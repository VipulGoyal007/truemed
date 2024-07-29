package com.intellihealth.truemeds.presentation.bindingadapter;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse;
import com.intellihealth.truemeds.presentation.adapter.VideoAdapterP2;
import com.intellihealth.truemeds.presentation.adapter.VideoVerticalAdapterP2;
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel;

import java.util.List;

public class VideoBindingAdapterP2 {

    @BindingAdapter({"videosList", "setVideoFaqViewModel"})
    public static void setVideosList(RecyclerView view, List<VideoFaqAllResponse.Video> items, VideoViewModel viewModel) {
        if (view == null) {
            return;
        }


        if (view.getAdapter() != null) {

            //if (view.getAdapter() instanceof VideoAdapter) {
            try {
                ((VideoAdapterP2) view.getAdapter()).items = items;
                ((VideoAdapterP2) view.getAdapter()).viewModel = viewModel;
                view.getAdapter().notifyDataSetChanged();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //}
        } else {
            VideoAdapterP2 adapter = new VideoAdapterP2(items, viewModel/*, languageSelection*/);
            view.setAdapter(adapter);
        }
    }

    @BindingAdapter({"verticalVideosList", "setVideoFaqViewModel"/*, "languageSelection"*/})
    public static void setVerticalVideosList(RecyclerView view, List<VideoFaqAllResponse.Video> items, VideoViewModel viewModel/*, String languageSelection*/) {
        if (view == null) {
            return;
        }


        if (view.getAdapter() != null) {

            //if (view.getAdapter() instanceof VideoAdapter) {
            try {
                ((VideoVerticalAdapterP2) view.getAdapter()).items = items;
                ((VideoVerticalAdapterP2) view.getAdapter()).viewModel = viewModel;
                view.getAdapter().notifyDataSetChanged();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //}
        } else {
            VideoVerticalAdapterP2 adapter = new VideoVerticalAdapterP2(items, viewModel/*, languageSelection*/);
            view.setAdapter(adapter);
        }
    }

    @BindingAdapter("thumbnailUrl")
    public static void setThumbnailUrl(AppCompatImageView view, String imageUrl) {
        if (view == null) {
            return;
        }
        Glide.with(view.getContext()).load(imageUrl).placeholder(R.color.video_buffer_color).into(view);
    }


//    @BindingAdapter({"isSelected","viewModel"})
//    public static void setSelectionVideo(AppCompatImageView view, int isSelected,VideoViewModel viewModel) {
//        Log.d("qwerty","isSelected : "+isSelected+" || viewModel.isSecondaryPlayFlag : "+viewModel.isSecondaryPlayFlag.getValue() );
//
//    }




}
