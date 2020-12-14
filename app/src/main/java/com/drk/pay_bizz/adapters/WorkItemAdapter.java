package com.drk.pay_bizz.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.util.ArrayListConstants;
import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.WorkItemHolder;
import com.drk.pay_bizz.modals.WorkItemModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class WorkItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;

    /**
     * constructor of WorkItemAdapter
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     */
    public WorkItemAdapter(List<Object> items, Activity activity) {
        this.mItems = items;
        this.mActivity = activity;
    }

    /**
     * getItemCount of WorkItemAdapter
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
        View view = inflater.inflate( R.layout.pb_work_item_layout, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
                viewHolder = new WorkItemHolder( view, mActivity );

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
                WorkItemHolder WorkItemHolder = (WorkItemHolder)
                        viewHolder;
        configureWorkItemHolder( WorkItemHolder, position );
    }

    /**
     * configureWorkItemHolder of WorkItemAdapter
     * @param viewHolder
     * @param position
     */
    private void configureWorkItemHolder(WorkItemHolder viewHolder,
                                                  final int position) {
        final WorkItemModal mWorkItemModal = (WorkItemModal) mItems.get( position );
        if (mWorkItemModal != null) {
            final String work_title = mWorkItemModal.getTitle();
            if (work_title != null && !(work_title.equals(
                    ArrayListConstants.EMPTY_STR))) {
                TextView title = viewHolder.getTitle();
                title.setText(work_title);
            }
        }
    }

    /**
     * setDataList of WorkItemAdapter
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
