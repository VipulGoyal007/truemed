package com.intellihealth.truemeds.presentation.bottomsheet

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class CustomBottomSheetBehavior<V : View> : BottomSheetBehavior<V> {

    constructor() : super()

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    override fun onAttachedToLayoutParams(params: CoordinatorLayout.LayoutParams) {
        super.onAttachedToLayoutParams(params)
        state = STATE_EXPANDED
    }
    override fun onLayoutChild(parent: CoordinatorLayout, child: V, layoutDirection: Int): Boolean {
        val layoutChild = super.onLayoutChild(parent, child, layoutDirection)
//        if (state == STATE_HALF_EXPANDED) {
            val screenHeight = parent.height.toFloat()
            val initialPeekHeight = (screenHeight * 500f).toInt() // Initial height (50% of screen)
            val maxPeekHeight = (screenHeight * 200f).toInt() // Max height (80% of screen)
            val i = initialPeekHeight.coerceAtMost(maxPeekHeight)
            peekHeight = i
//        }
        return layoutChild
    }

    override fun onTouchEvent(parent: CoordinatorLayout, child: V, event: MotionEvent): Boolean {
/*
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                // Handle touch down event
                val screenHeight = parent.height.toFloat()
                val initialPeekHeight = (screenHeight * 0.5f).toInt()
                peekHeight = initialPeekHeight
            }
            MotionEvent.ACTION_MOVE -> {
                // Handle touch move event
            }
            MotionEvent.ACTION_UP -> {
                // Handle touch up event
                val screenHeight = parent.height.toFloat()
                val initialPeekHeight = (screenHeight * 0.8f).toInt()
                peekHeight = initialPeekHeight
            }
            else -> return super.onTouchEvent(parent, child, event)
        }
*/
        return true
    }
}