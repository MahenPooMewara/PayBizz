package com.drk.pay_bizz.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.util.ArrayListConstants;
import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.menus.main.FAQItemHolder;
import com.drk.pay_bizz.modals.FAQItemModal;
import com.drk.pay_bizz.util.AppConstants;
import com.drk.pay_bizz.util.FontManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class FAQItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private FontManager fontManager;

    /**
     * interface OnItemClickListener of FAQItemAdapter
     */
    public interface OnItemClickListener {
        /**
         * setOnViewClickListner of OnItemClickListener
         * @param faq
         * @param position
         */
        void setOnViewClickListner(TextView faq, int position);
    }

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;
    private final FAQItemAdapter.OnItemClickListener mListener;

    /**
     * constructor of FAQItemAdapter
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     * @param mListener
     */
    public FAQItemAdapter(List<Object> items, Activity activity, OnItemClickListener mListener) {
        this.mItems = items;
        this.mActivity = activity;
        this.mListener = mListener;
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     * @return
     */
    @Override
    public int getItemCount() {
        try {
            return this.mItems.size();
        } catch (Exception e) {
            return 0;
        }
    }


    /**
     * This method creates different RecyclerView.ViewHolder objects based on the item view type.\
     *
     * @param viewGroup ViewGroup container for the item
     * @param viewType  type of view to be inflated
     * @return viewHolder to be inflated
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from( viewGroup.getContext() );
        View view = inflater.inflate( R.layout.faq_item, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
                viewHolder = new FAQItemHolder( view, mActivity );
        mContext = mActivity;
        fontManager = FontManager.getInstance( mContext );

        return viewHolder;
    }

    /**
     * This method internally calls onBindViewHolder(ViewHolder, int) to update the
     * RecyclerView.ViewHolder contents with the item at the given position
     * and also sets up some private fields to be used by RecyclerView.
     *
     * @param viewHolder The type of RecyclerView.ViewHolder to populate
     * @param position   Item position in the viewgroup.
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
                FAQItemHolder faqItemHolder = (FAQItemHolder)
                        viewHolder;
        configureFAQItemHolder( faqItemHolder, position );
    }

    /**
     * configureFAQItemHolder of FAQItemAdapter
     * @param viewHolder
     * @param position
     */
    private void configureFAQItemHolder(FAQItemHolder viewHolder, final int position) {
        final FAQItemModal mFAQItemModal = (FAQItemModal) mItems.get( position );
        if (mFAQItemModal != null) {
            final String faq = mFAQItemModal.getFaq();
            TextView faq_tv = viewHolder.getFaq();
            TextView faqa_tv = viewHolder.getFaqa();
            if (faq != null && !(faq.equals(ArrayListConstants.EMPTY_STR))) {
                faq_tv.setText(faq);
                faq_tv.setTypeface(fontManager.getRegularFont() );
                faq_tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mListener.setOnViewClickListner( faqa_tv, position );
                    }
                } );
            }

            final String faqa = mFAQItemModal.getFaqa();
            if (faqa != null && !(faqa.equals(ArrayListConstants.EMPTY_STR))) {
                faqa_tv.setText(faqa);
                faqa_tv.setTypeface(fontManager.getRegularFont() );
            }
        }
    }

    /**
     * setDataList of FAQItemAdapter
     * @param updated_list
     */
    public void setDataList(List<Object> updated_list) {
        if (mItems == null) {
            mItems = new ArrayList<Object>();
        }
        mItems.clear();
        mItems = updated_list;
        notifyDataSetChanged();
    }


}
