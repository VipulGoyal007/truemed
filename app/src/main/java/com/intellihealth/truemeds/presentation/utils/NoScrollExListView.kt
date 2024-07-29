package com.intellihealth.truemeds.presentation.utils

import android.content.Context
import android.util.AttributeSet
import android.widget.ExpandableListView


class NoScrollExListView(context: Context?, attrs: AttributeSet?) : ExpandableListView(context,attrs) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        try {
            setMeasuredDimension(widthMeasureSpec,heightMeasureSpec)
            val heightMeasureSpecCustom = MeasureSpec.makeMeasureSpec(
                Int.MAX_VALUE shr 2, MeasureSpec.AT_MOST
            )
            super.onMeasure(widthMeasureSpec, heightMeasureSpecCustom)
            val params = layoutParams
            params.height = measuredHeight

        } catch (ignore: Exception) {
        }
    }
}