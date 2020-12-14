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
import com.drk.pay_bizz.holders.ServiceDescItemHolder;
import com.drk.pay_bizz.modals.ServiceDescItemModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class ServiceDescItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;

    /**
     * constructor of ServiceDescItemAdapter
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     */
    public ServiceDescItemAdapter(List<Object> items, Activity activity) {
        this.mItems = items;
        this.mActivity = activity;
    }

    /**
     * getItemCount of ServiceDescItemAdapter
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
        View view = inflater.inflate( R.layout.service_desc_item, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
        viewHolder = new ServiceDescItemHolder(view, mActivity );
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
                ServiceDescItemHolder serviceDescItemHolder = (ServiceDescItemHolder)
                        viewHolder;
        configureServiceDescItemHolder( serviceDescItemHolder, position );
    }

    /**
     * configureServiceDescItemHolder of ServiceDescItemAdapter
     * @param viewHolder
     * @param position
     */
    private void configureServiceDescItemHolder(ServiceDescItemHolder viewHolder,
                                                  final int position) {
        final ServiceDescItemModal serviceDescItemModal = (ServiceDescItemModal) mItems.get(
                position);
        if (serviceDescItemModal != null) {
            final String title_str = serviceDescItemModal.getTitle();
            if (title_str != null && !(title_str.equals(ArrayListConstants.EMPTY_STR))) {
                TextView title = viewHolder.getTitle();
                title.setText(title_str);
            }
            final String desc_str = serviceDescItemModal.getDesc();
            if (desc_str != null && !(desc_str.equals(ArrayListConstants.EMPTY_STR))) {
                TextView desc = viewHolder.getDesc();
                desc.setText(desc_str);
            }
            final int img_id = serviceDescItemModal.getImgID();
            if (img_id !=0 ) {
                ImageView img = viewHolder.getImg();
                img.setImageDrawable(ResourcesCompat.getDrawable(mActivity.getResources(),img_id,
                        mActivity.getTheme()));
            }
        }
    }

    /**
     * setDataList of ServiceDescItemAdapter
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
