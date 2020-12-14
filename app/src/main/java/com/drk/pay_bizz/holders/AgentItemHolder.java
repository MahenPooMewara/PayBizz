package com.drk.pay_bizz.holders;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.util.FontManager;

/**
 * Created by Mahendra Mewara.
 */
public class AgentItemHolder extends RecyclerView.ViewHolder {

    /**
     * getAgent_profile_pic of AgentItemHolder
     * @return
     */
    public ImageView getAgent_profile_pic() {
        return agent_profile_pic;
    }

    /**
     * setAgent_profile_pic of AgentItemHolder
     * @param agent_profile_pic
     */
    public void setAgent_profile_pic(ImageView agent_profile_pic) {
        this.agent_profile_pic = agent_profile_pic;
    }

    /**
     * getAgent_name of AgentItemHolder
     * @return
     */
    public TextView getAgent_name() {
        return agent_name;
    }

    /**
     * setAgent_name of AgentItemHolder
     * @param agent_name
     */
    public void setAgent_name(TextView agent_name) {
        this.agent_name = agent_name;
    }

    /**
     * getAgent_comment of AgentItemHolder
     * @return
     */
    public TextView getAgent_comment() {
        return agent_comment;
    }

    /**
     * setAgent_comment of AgentItemHolder
     * @param agent_comment
     */
    public void setAgent_comment(TextView agent_comment) {
        this.agent_comment = agent_comment;
    }

    private ImageView agent_profile_pic;
    private TextView agent_name;
    private TextView agent_comment;

    private View container;

    /**
     * Constructor of AgentItemHolder
     * @param itemView
     * @param activity
     */
    public AgentItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        agent_profile_pic = (ImageView) itemView.findViewById(R.id.agent_profile_iv);

        agent_name = (TextView) itemView.findViewById(R.id.agent_name_tv);
        agent_name.setTypeface(fontManager.getMediumFont());

        agent_comment = (TextView) itemView.findViewById(R.id.agent_comment_tv);
        agent_comment.setTypeface(fontManager.getMediumFont());

    }

    /**
     *  getContainer of AgentItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of AgentItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}