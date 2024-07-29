package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.utils.compressImageSize
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BannerViewpagerItemBinding
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import java.util.Objects

class BannerViewpagerAdapter(
    var context: Context,
    var bannerImageModel: ArrayList<BannerItemModel>,
    private val bannerClickCallback: BannerViewPagerClickCallback,
    private val title:String?=""
) :
    PagerAdapter() {

    private val layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    var bannerImageList: ArrayList<BannerItemModel> = arrayListOf()
    private var isImageLoadingSuccess:Boolean= true

    init {
        bannerImageList = bannerImageModel
    }

    override fun getCount(): Int {
        return bannerImageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding: BannerViewpagerItemBinding =
            DataBindingUtil.inflate(
                layoutInflater,
                R.layout.banner_viewpager_item,
                container,
                false
            )

        if (bannerImageList[position].imageUrl.isNotEmpty()) {
            var customPlaceHolder:Drawable?=null
            customPlaceHolder = if (!title.isNullOrEmpty()) {
                binding.imageViewMain.context?.getDrawable(
                    CommonFunc.getDefaultPlaceHolderDrawable(title)
                )
            } else {
                binding.imageViewMain.context?.getDrawable(R.drawable.ic_placeholder_personal_care)
            }
            Glide.with(context)
                .load(bannerImageList[position].imageUrl.compressImageSize(640,0))
                .error(customPlaceHolder)
                .listener(object : RequestListener<Drawable> {
                    override fun onResourceReady(
                        resource: Drawable,
                        model: Any,
                        target: com.bumptech.glide.request.target.Target<Drawable>?,
                        dataSource: DataSource,
                        isFirstResource: Boolean
                    ): Boolean {
                        return false
                    }

                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>,
                        isFirstResource: Boolean
                    ): Boolean {
                        isImageLoadingSuccess= false
                       return false
                    }
                })
                .into(binding.imageViewMain)
        }

        Objects.requireNonNull(container).addView(binding.root)


        binding.imageViewMain.setOnClickListener {
            if(isImageLoadingSuccess) bannerClickCallback.onBannerClick(position, bannerImageList)

        }
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }


    interface BannerViewPagerClickCallback {

        fun onBannerClick(position: Int, imgList: ArrayList<BannerItemModel>)

    }

}
