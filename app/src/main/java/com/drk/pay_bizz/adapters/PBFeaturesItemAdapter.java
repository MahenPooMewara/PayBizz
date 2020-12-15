package com.drk.pay_bizz.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.util.ArrayListConstants;
import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.menus.main.PBFeaturesItemHolder;
import com.drk.pay_bizz.modals.PBFeaturesModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class PBFeaturesItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;

    /**
     * constructor of PBFeaturesItemAdapter
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     */
    public PBFeaturesItemAdapter(List<Object> items, Activity activity) {
        this.mItems = items;
        this.mActivity = activity;
    }

    /**
     * getItemCount of PBFeaturesItemAdapter
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
     * @param viewGroup ViewGroup container for the item
     * @param viewType  type of view to be inflated
     * @return viewHolder to be inflated
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from( viewGroup.getContext() );
        View view = inflater.inflate( R.layout.feature_about_us_item, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
        viewHolder = new PBFeaturesItemHolder( view, mActivity );

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
                PBFeaturesItemHolder pbFeaturesItemHolder = (PBFeaturesItemHolder)
                        viewHolder;
        configurePBFeaturesItemHolder( pbFeaturesItemHolder, position );
    }

    /**
     * configurePBFeaturesItemHolder of PBFeaturesItemAdapter
     * @param pbFeaturesItemHolder
     * @param position
     */
    private void configurePBFeaturesItemHolder(PBFeaturesItemHolder pbFeaturesItemHolder,
                                                  final int position) {
        final PBFeaturesModal mPBFeaturesModal = (PBFeaturesModal) mItems.get( position );
        if (mPBFeaturesModal != null) {
            final String featuresTitle = mPBFeaturesModal.getTitle();
            if (featuresTitle != null && !(featuresTitle.equals(
                    ArrayListConstants.EMPTY_STR))) {
                TextView feature_au_tv = pbFeaturesItemHolder.getFeature_au_tv();
                feature_au_tv.setText(featuresTitle);
            }

            final String featuresDesc = mPBFeaturesModal.getDesc();
            if (featuresDesc != null && !(featuresDesc.equals(
                    ArrayListConstants.EMPTY_STR))) {
                TextView feature_au_desc_tv = pbFeaturesItemHolder.getFeature_au_desc_tv();
                feature_au_desc_tv.setText(featuresDesc);
            }

            final int img_id = mPBFeaturesModal.getImgID();
            if (img_id !=0 ) {
                ImageView img = pbFeaturesItemHolder.getFeature_au_iv();
                img.setImageDrawable(ResourcesCompat.getDrawable(mActivity.getResources(),img_id,
                        mActivity.getTheme()));
            }
        }
    }

    /**
     * setDataList of PBFeaturesItemAdapter
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
