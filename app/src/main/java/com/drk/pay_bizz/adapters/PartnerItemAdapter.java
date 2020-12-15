package com.drk.pay_bizz.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.menus.main.PartnerItemHolder;
import com.drk.pay_bizz.modals.OurPartnersModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class PartnerItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;

    /**
     * constructor of PartnerItemAdapter
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     */
    public PartnerItemAdapter(List<Object> items, Activity activity) {
        this.mItems = items;
        this.mActivity = activity;
    }

    /**
     * getItemCount of PartnerItemAdapter
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
        View view = inflater.inflate( R.layout.pb_partner_item_layout, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
        viewHolder = new PartnerItemHolder( view, mActivity );
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
                PartnerItemHolder partnerItemHolder = (PartnerItemHolder)
                        viewHolder;
        configurePartnerItemHolder( partnerItemHolder, position );
    }

    /**
     * configurePartnerItemHolder of PartnerItemAdapter
     * @param viewHolder
     * @param position
     */
    private void configurePartnerItemHolder(PartnerItemHolder viewHolder,
                                                  final int position) {
        final OurPartnersModal mOurPartnersModal = (OurPartnersModal) mItems.get( position );
        if (mOurPartnersModal != null) {
            final int img_id = mOurPartnersModal.getOur_partners_log();
            if (img_id !=0 ) {
                ImageView img = viewHolder.getFeatureImage();
                img.setImageDrawable(ResourcesCompat.getDrawable(mActivity.getResources(),img_id,
                        mActivity.getTheme()));
            }
        }
    }

    /**
     * setDataList of PartnerItemAdapter
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
