package com.intellihealth.truemeds.presentation.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;
import com.intellihealth.truemeds.R;

import java.util.List;
import java.util.Objects;


public class ProductImageViewPagerBSAdapter extends PagerAdapter {
    Context context;
    List<String> imageList;
    LayoutInflater mLayoutInflater;

    public ProductImageViewPagerBSAdapter(Context context, List<String> imageList) {
        this.context = context;
        this.imageList = imageList;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ConstraintLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        String imageUrl = imageList.get(position);
        View itemView = mLayoutInflater.inflate(R.layout.product_details_slider_image_bs, container, false);
        PhotoView ivProductImage = itemView.findViewById(R.id.ivProductImage);
        /*PhotoViewAttacher pAttacher;
        pAttacher = new PhotoViewAttacher(ivProductImage);
        pAttacher.update();*/

        //String imageUrl = imageList[position] + "?tr=cm-pad_resize,bg-FFFFFF,lo-true,w-360";
        if (imageUrl.startsWith("android.resource:/")) {
            Glide.with(context).load(Uri.parse(imageUrl)).into(ivProductImage);
        } else {
            Glide.with(context).load(imageUrl+ "?tr=cm-pad_resize,bg-FFFFFF,lo-true,w-640").into(ivProductImage);
        }

        // Adding the View
        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout) object);
    }
}