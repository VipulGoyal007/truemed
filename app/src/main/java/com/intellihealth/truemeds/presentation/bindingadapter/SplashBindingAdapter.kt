package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.domain.enums.SplashScreenImageType

@BindingAdapter("setSplashScreenImage")
fun setSplashScreenImage(view: AppCompatImageView, splashScreenImageType: SplashScreenImageType) {
    if (splashScreenImageType == SplashScreenImageType.CHRISTMAS) {
        Glide.with(view.context).load(R.drawable.ic_splash_screen_christmas).into(view)
            .clearOnDetach()
    } else {
        Glide.with(view.context).load(R.drawable.ic_splash_screen_with_51_discount).into(view)
            .clearOnDetach()
    }
}