package com.intellihealth.truemeds.presentation.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel


class ExpandableListAdapter(
    listDataHeader: List<String>,
    listDataChildMap: HashMap<String, List<String>>,
    viewModel: PaymentOptionsViewModel
) : BaseExpandableListAdapter(){

    private var listDataHeader: List<String>? = null // header titles

    // child data in format of header title, child title
    private var listDataChild: HashMap<String, List<String>>? = null
    private lateinit var viewModel : PaymentOptionsViewModel

    init {
        this.listDataHeader = listDataHeader
        this.listDataChild = listDataChildMap
        this.viewModel = viewModel

    }

    override fun getGroupCount(): Int {
        return this.listDataHeader?.size!!
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return listDataChild?.get(listDataHeader?.get(groupPosition))?.size!!;
    }

    override fun getGroup(groupPosition: Int): String {
        return listDataHeader?.get(groupPosition)!!
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any? {
        return listDataHeader?.let {
            listDataChild?.get(it[groupPosition])?.get(childPosition)
        }
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong();
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?,
                              parent: ViewGroup?): View {
        var view : View? = convertView
        if (view == null) {
            val inflater = parent?.context
                ?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.faq_group, null)
        }

        val tvGroupTitle: AppCompatTextView = view!!.findViewById(R.id.tvGroupTitle)
        val appCompatTextView15: AppCompatTextView =
            view.findViewById(R.id.appCompatTextView15)
        val ivExpandCollapse: AppCompatImageView = view.findViewById(R.id.ivExpandCollapse)
        tvGroupTitle.text = getGroup(groupPosition)

        if (viewModel != null) {
            appCompatTextView15.setTextColor(
                ContextCompat.getColor(
                    appCompatTextView15.context,
                    R.color.adress_text_color
                )
            )
            tvGroupTitle.setTextColor(ContextCompat.getColor(tvGroupTitle.context, R.color.adress_text_color))
            ivExpandCollapse.setImageResource(R.drawable.ic_expand_down_grey)
        } else {
            appCompatTextView15.setTextColor(ContextCompat.getColor(appCompatTextView15.context, R.color.notification_text_color_normal))
            tvGroupTitle.setTextColor(ContextCompat.getColor(tvGroupTitle.context, R.color.notification_text_color_normal))
            ivExpandCollapse.setImageResource(R.drawable.ic_expand_down_black)
        }


        if (isExpanded) {
            if (viewModel != null) {
                ivExpandCollapse.setImageResource(R.drawable.ic_collapse_up_grey)
            } else {
                ivExpandCollapse.setImageResource(R.drawable.ic_collapse_up_black)
            }
        } else {
            if (viewModel != null) {
                ivExpandCollapse.setImageResource(R.drawable.ic_expand_down_grey)
            } else {
                ivExpandCollapse.setImageResource(R.drawable.ic_expand_down_black)
            }
        }
        return view
    }

    override fun getChildView(groupPosition: Int, childPosition: Int,
                              isLastChild: Boolean, convertView: View?,
                              parent: ViewGroup?): View {
        val childText = getChild(groupPosition, childPosition) as String?
        var view : View? = convertView
        if (view == null) {
            view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.faq_group_child, null)
        }

        val tvData: AppCompatTextView = view!!.findViewById(R.id.tvData)
        val appCompatTextView20: AppCompatTextView =
            view.findViewById(R.id.appCompatTextView20)

        tvData.text = childText
        if (viewModel != null) {
            appCompatTextView20.setTextColor(
                ContextCompat.getColor(
                    appCompatTextView20.context,
                    R.color.adress_text_color
                )
            )
            tvData.setTextColor(ContextCompat.getColor(tvData.context, R.color.adress_text_color))
        } else {
            appCompatTextView20.setTextColor(ContextCompat.getColor(appCompatTextView20.context, R.color.notification_text_color_normal))
            tvData.setTextColor(ContextCompat.getColor(tvData.context, R.color.notification_text_color_normal))
        }
        return view
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true;
    }
}