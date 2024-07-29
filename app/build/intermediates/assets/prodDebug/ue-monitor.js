(function f() {
    if (!(window.UserExperiorSDK && window.UserExperiorSDK.mobilesdk)) {
        function applySDK() {
            window.UserExperiorSDK = window.UserExperiorSDK || {};

            let sdk       = window.UserExperiorSDK.mobilesdk              = window.UserExperiorSDK.mobilesdk         || { monitor: {} };
            let monitor   = window.UserExperiorSDK.mobilesdk.monitor      = window.UserExperiorSDK.mobilesdk.monitor || sdk.monitor;
            let selectors = window.UserExperiorSDK.mobilesdk.PIISelectors = window.UserExperiorSDK.mobilesdk.PIISelectors || undefined;
            /*
            * Listen to DOM mutation events and mark domChanged for every such event.
            * This is used in getBlockedRects to recalculate which DOM elements should be blocked for PII only when DOM actually change.
            * */
            if (MutationObserver) {
                let mo = new MutationObserver(function () {
                    sdk.domChanged = true;
                });
                mo.observe(document.documentElement, {subtree: true, childList: true, attributes: true});
            }

            /*
            * For PII -
            * Detect when the screen is still scrolling - required for preventing screenshotting while screen moves.
            */
            !function () {
                if (!monitor.isScrollHandlerInstalled) {
                    monitor.isScrollHandlerInstalled = true;
                    monitor.isScrolling = 'false';

                    /*
                    * Assume we are still scrolling while we still receive scroll events inside 750 milli sec sliding window
                    * */
                    window.addEventListener('scroll', function () {
                        monitor.isScrolling = 'true';
                        if (monitor.scrollTimeout) {
                            clearTimeout(monitor.scrollTimeout);
                        }
                        monitor.scrollTimeout = setTimeout(function () {
                            monitor.isScrolling = 'false';
                        }, 750);
                    });
                }
            }();

            /* For PII -
            * This is heuristic to detect zooming action required for preventing screenshotting while screen moves.
            * */
            !function () {
                function renewTimeout(data) {
                    data.isZooming = 'true';
                    if (data.zoomTimeout) {
                        clearTimeout(data.zoomTimeout);
                    }
                    data.zoomTimeout = setTimeout(function () {
                        data.isZooming = 'false';
                    }, 750);
                }

                if (!monitor.isTapActionHandlerInstalled) {
                    monitor.isTapActionHandlerInstalled = true;
                    monitor.isZooming = 'false';

                    document.body.addEventListener("touchend", function () {
                        var now = new Date().getTime();
                        var lastTouch = monitor.ueLastTouchTimestamp || now + 1;
                        var delta = now - lastTouch;
                        monitor.ueLastTouchTimestamp = now;
                        if (delta > 0 && delta < 50) {
                            renewTimeout(monitor);
                        }
                    });
                }

                /*
                 * We listen to focus event since the browser zooms the screen when an input gains focus.
                 * Not sure whether this is reported via window resize event.
                 * Assume we are still zooming while we still receive focus events on an element inside a 750 milli sec
                 * sliding window
                 */
                if (!monitor.isFocusHandlerInstalled) {
                    monitor.isFocusHandlerInstalled = true;
                    monitor.isZooming = 'false';
                    document.querySelectorAll('input').forEach(function (e) {
                        e.addEventListener('focus', function () { renewTimeout(monitor); }, false);
                    });
                }
            }();

            sdk.getBlockedLocations = function () {
                /*
                * Returns rectangles of all blocked input.
                * Returns a string of rects in the format {{left,top},{width,height}}*...*{{left,top},{width,height}} or
                * empty string if no rects exist
                * */
                function serializeRects(rectangles) {
                    let isIos = false;
                    if (isIos) {
                        return rectangles.flatMap(function (e) {
                            return '{{' + e.left + ',' + e.top + '},{' + e.width + ',' + e.height + '}}';
                        }).join('*');
                    } else {
                        return rectangles.flatMap(function (e) {
                            return {origin:{x:e.left,y: e.top},size:{width:e.width,height:e.height}};
                        });
                    };
                };
                /*
                * Checks if a given DOM element is hidden
                * by checking if CSS style hides it or if it is out of the displayed page.
                * */
                function isElementHidden(element) {

                    var  style = window.getComputedStyle(element);
                    return style.getPropertyValue('display') === 'none' ||
                        style.getPropertyValue('visibility') === 'hidden' ||
                        style.getPropertyValue('opacity') === "0" ||
                        element.offsetParent === null || (!element.offsetWidth || !element.offsetHeight);
                };
                /*
                * Checks if a given DOM element is within the display viewport
                * */
                function isInViewport(element) {
                    var shadowWindow = {
                        top    : 0,
                        left   : 0,
                        bottom : window.innerHeight || document.documentElement.clientHeight,
                        right  : window.innerWidth || document.documentElement.clientWidth
                    };
                    var rect = element.getBoundingClientRect();
                    return intersectedRectangle(shadowWindow,rect);
                };

                /*
                * creates new Set, which contains the union of two sets
                * */
                function uniteSets(setA, setB) {
                    var union = new Set(setA);
                    for (let element of setB) {
                        union.add(element);
                    }
                    return union;
                };

                /*
                * creates new Set, which contains the minus of two sets
                * */
                function minusSets(setA, setB) {
                    return new Set(Array.from(setA).filter(item => !setB.has(item)));
                }

                /*
                * Checks if DOM elements intersect (overlap)
                * */
                function intersectedRectangle (rectOne, rectTwo) {
                    return !(
                        rectTwo.left >= rectOne.right ||
                        rectTwo.right <= rectOne.left ||
                        rectTwo.top >= rectOne.bottom ||
                        rectTwo.bottom <= rectOne.top
                    );
                }

                /*
                * Recalculate which DOM elements should be blocked only if DOM has changes, or calculation hasn't been done before
                * */
                if (sdk.domChanged || !(sdk.autoDetected || sdk.elements || sdk.domNodes || sdk.blacklist || sdk.whitelist)) {

                    sdk.autoDetected = Array.prototype.slice.call(document.querySelectorAll("input" +
                        "[type='date'],[type='datetime'],[type='datetime-local'],[type='month']," +
                        "[type='text'],[type='email'],[type='number'],[type='tel'],[type='file'],[type='password']"
                    ));

                    sdk.elements  = Array.prototype.slice.call(document.getElementsByClassName('ue-mask'));
                    sdk.domNodes  = Array.prototype.slice.call(document.querySelectorAll(selectors));
                    sdk.blacklist = Array.prototype.concat(sdk.elements, sdk.domNodes);
                    sdk.whitelist = Array.prototype.slice.call(document.getElementsByClassName('ue-unmask'));
                }

                let allSecuredElements = () => {
                    let allSecured = new Set();
                    allSecured = uniteSets(allSecured, new Set(sdk.autoDetected));
                    allSecured = minusSets(allSecured, new Set(sdk.whitelist));
                    allSecured = uniteSets(allSecured, new Set(sdk.blacklist));
                    return allSecured;
                };

                var rects = Array.from(allSecuredElements()).filter(function (element) {
                    return !isElementHidden(element) && isInViewport(element);
                }).flatMap(e => e.getBoundingClientRect());

                return serializeRects(rects);
            };

            sdk.snapshotInformation = function() {
                return JSON.stringify({
                    isScrolling     : window.UserExperiorSDK.mobilesdk.monitor.isScrolling,
                    isZooming       : window.UserExperiorSDK.mobilesdk.monitor.isZooming,
                    locationsToMask : window.UserExperiorSDK.mobilesdk.getBlockedLocations(),
                    windowWidth     : window.innerWidth || document.documentElement.clientWidth
                });
            };
        }
        applySDK();
    }
} )();
if (window.UserExperiorSDK && window.UserExperiorSDK.mobilesdk) {
    window.UserExperiorSDK.mobilesdk.snapshotInformation();
}