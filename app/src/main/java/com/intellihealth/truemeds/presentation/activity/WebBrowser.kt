package com.intellihealth.truemeds.presentation.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.ActivityWalletTranasctionsBinding
import com.intellihealth.truemeds.databinding.ActivityWebBrowserBinding
import com.intellihealth.truemeds.presentation.utils.viewBinding

class WebBrowser : BaseActivity() {
    private val binding by viewBinding(ActivityWebBrowserBinding::inflate)
    var ExtUrl: String? = ""
    var isDeliveryPartner = false
    var deliveryPartnerName: String? = null
    var deliveryPartnerNumber: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        if (savedInstanceState == null) {
            val extras: Bundle? = intent.extras
            if (extras != null) {

                try {

                    extractIntentData()

                    if (!TextUtils.isEmpty(deliveryPartnerName) && !TextUtils.isEmpty(
                            deliveryPartnerNumber
                        ) && deliveryPartnerNumber != "null" && deliveryPartnerName != "null"
                    ) {
                        binding.linearLayout8.setVisibility(View.VISIBLE)
                        binding.textviewDeliveryPersonName.setText("Name : $deliveryPartnerName")
                        binding.textviewDeliveryPersonContact.setText("Contact : $deliveryPartnerNumber")
                        binding.textviewCall.setVisibility(View.VISIBLE)
                    } else {
                        binding.linearLayout8.setVisibility(View.GONE)
                    }
                } catch (e: Exception) {
                    binding.linearLayout8.setVisibility(View.GONE)
                    isDeliveryPartner = false
                }
            }
        } else {
            ExtUrl = savedInstanceState.getSerializable("ExtUrl").toString()
        }
        if (ExtUrl != null && !TextUtils.isEmpty(ExtUrl) && ExtUrl!!.substring(0, 4)
                .equals("http", ignoreCase = true)
        ) {
        } else {
            ExtUrl = "http://$ExtUrl"
        }
        binding.textviewCall.setOnClickListener(View.OnClickListener { v: View? ->
            if (!TextUtils.isEmpty(deliveryPartnerNumber)) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:$deliveryPartnerNumber"))
                startActivity(intent)
            } else {
                binding.textviewCall.setVisibility(View.GONE)
            }
        })
        try {
            binding.viewWebview.getSettings().setJavaScriptEnabled(true)
            binding.viewWebview.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND)
            binding.viewWebview.loadUrl(ExtUrl?:"")
            binding.viewWebview.setWebViewClient(object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    view.loadUrl(url)
                    return false
                }

                override fun onLoadResource(view: WebView, url: String) {
                    try {
                        if (view != null && view.getOriginalUrl() != null && view.getOriginalUrl() == "https://truemeds.clickpost.in/returns") {
                            overridePendingTransition(
                                R.anim.activity_fade_in,
                                R.anim.activity_fade_out
                            )
                            finish()
                            return
                        } else {
                            super.onLoadResource(view, url)
                        }
                    } catch (e: Exception) {
                    }
                }
            })
        } catch (e: Exception) {
        }
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            ExtUrl = bundle.getString("ExtUrl")
            isDeliveryPartner = bundle.getBoolean("isDeliveryPartner")
            deliveryPartnerName = bundle.getString("deliveryPartnerName", null)
            deliveryPartnerNumber = bundle.getString("deliveryPartnerContact", null)
        }
    }
}