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
public class WorkItemHolder extends RecyclerView.ViewHolder {
    private ImageView work_item_icon_image;
    private TextView title;

    private View container;

    /**
     * Constructor of WorkItemHolder
     * @param itemView
     * @param activity
     */
    public WorkItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        work_item_icon_image = (ImageView) itemView.findViewById(R.id.work_item_iv);

        title = (TextView) itemView.findViewById(R.id.work_item_tv);
        title.setTypeface(fontManager.getMediumFont());

    }

    /**
     * getFeatureImage of WorkItemHolder
     * @return
     */
    public ImageView getFeatureImage() {
        return work_item_icon_image;
    }

    /**
     * setFeatureImage of WorkItemHolder
     * @param feature_image
     */
    public void setFeatureImage(ImageView feature_image) {
        this.work_item_icon_image = feature_image;
    }

    /**
     * getTitle of WorkItemHolder
     * @return
     */
    public TextView getTitle() {
        return title;
    }

    /**
     * setTitle of WorkItemHolder
     * @param title
     */
    public void setTitle(TextView title) {
        this.title = title;
    }

    /**
     *  getContainer of WorkItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of WorkItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}