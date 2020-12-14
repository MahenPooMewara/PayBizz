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
import com.drk.pay_bizz.holders.ServicesItemHolder;
import com.drk.pay_bizz.modals.ServiceModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

//import android.os.TransactionTooLargeException;

/**
 * Created by Mahendra Mewara.
 */
public class ServicesItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /**
     * interface of OnItemClickListener
     */
    interface OnItemClickListener {
        /**
         * onItemClick of OnItemClickListener
         * @param item
         * @param position
         */
        void onItemClick(ServiceModal item, int position);

    }

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;

    /**
     * constructor of ServicesItemAdapter
     * PagerAdapter mPagerAdapter;
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     */
    public ServicesItemAdapter(List<Object> items,
                               Activity activity) {
        this.mItems = items;
        this.mActivity = activity;
    }

    /**
     * getItemCount of ServicesItemAdapter
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
        View view = inflater.inflate( R.layout.service_item_layout, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
                viewHolder = new ServicesItemHolder( view, mActivity );

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
                ServicesItemHolder servicesItemHolder = (ServicesItemHolder)
                        viewHolder;
        configureServiceItemHolder( servicesItemHolder, position );
    }

    /**
     * configureServiceItemHolder of ServicesItemAdapter
     * @param servicesItemHolder
     * @param position
     */
    private void configureServiceItemHolder(ServicesItemHolder servicesItemHolder,
                                                  final int position) {
        final ServiceModal mServiceModal = (ServiceModal) mItems.get( position );
        if (mServiceModal != null) {
            final String service_title = mServiceModal.getTitle();
            if (service_title != null && !(service_title.equals(
                    ArrayListConstants.EMPTY_STR))) {
                TextView title = servicesItemHolder.getTitle();
                title.setText(service_title);
            }

            final int img_id = mServiceModal.getImgId();
            if (img_id !=0 ) {
                ImageView img = servicesItemHolder.getFeatureImage();
                img.setImageDrawable(ResourcesCompat.getDrawable(mActivity.getResources(),img_id,
                        mActivity.getTheme()));
            }
        }



    }

    /**
     * Call Service Details of ServicesItemAdapter
     * Story Main Details will be show here....
     *
     * @param serviceModal
     */
    private void callServiceDetails(ServiceModal serviceModal, Boolean bool) {
        try {
            try {

            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            /**
             * Call Service Details View
             */
            /*Intent intent = new Intent( mActivity, ServiceDetails.class );
            // Start AnotherActivity with the request code
            ((DashBoard) mActivity).startActivityForResult( intent,
                    AppConstants.REQUEST_STORY );*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * setDataList of ServicesItemAdapter
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
