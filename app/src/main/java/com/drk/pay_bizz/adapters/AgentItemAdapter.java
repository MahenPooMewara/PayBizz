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
import com.drk.pay_bizz.holders.AgentItemHolder;
import com.drk.pay_bizz.modals.AgentDetailsModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

//import android.os.TransactionTooLargeException;

/**
 * Created by Mahendra Mewara.
 */
public class AgentItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The mItems to display in your RecyclerView
    private List<Object> mItems;
    private Activity mActivity;

    /**
     * constructor of AgentItemAdapter
     * Provide a suitable constructor (depends on the kind of dataset)
     * @param items
     * @param activity
     */
    public AgentItemAdapter(List<Object> items, Activity activity) {
        this.mItems = items;
        this.mActivity = activity;
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
        View view = inflater.inflate( R.layout.pb_agent_item_layout, viewGroup,
                        AppConstants.BOOLEAN_FALSE );
                viewHolder = new AgentItemHolder( view, mActivity );

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
        AgentItemHolder agentItemHolder = (AgentItemHolder)
                        viewHolder;
        configureAgentItemHolder( agentItemHolder, position );
    }

    /**
     * configureAgentItemHolder of AgentItemAdapter
     * @param viewHolder
     * @param position
     */
    private void configureAgentItemHolder(AgentItemHolder viewHolder,
                                                  final int position) {
        final AgentDetailsModal mAgentDetailsModal = (AgentDetailsModal) mItems.get( position );
        if (mAgentDetailsModal != null) {
            final String agent_name = mAgentDetailsModal.getAgent_name();
            if (agent_name != null && !(agent_name.equals(
                    ArrayListConstants.EMPTY_STR))) {
                TextView agent_name_tv = viewHolder.getAgent_name();
                agent_name_tv.setText(agent_name);
            }

            final String agent_comment = mAgentDetailsModal.getAgent_comment();
            if (agent_comment != null && !(agent_comment.equals(
                    ArrayListConstants.EMPTY_STR))) {
                TextView agent_comment_tv = viewHolder.getAgent_comment();
                agent_comment_tv.setText(agent_comment);
            }

            final int img_id = mAgentDetailsModal.getAgent_profile_pic();
            if (img_id !=0 ) {
                ImageView img = viewHolder.getAgent_profile_pic();
                img.setImageDrawable(ResourcesCompat.getDrawable(mActivity.getResources(),img_id,
                        mActivity.getTheme()));
            }


        }
    }

    /**
     * setDataList of AgentItemAdapter
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
