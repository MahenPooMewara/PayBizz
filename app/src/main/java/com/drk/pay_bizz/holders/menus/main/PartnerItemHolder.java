package com.drk.pay_bizz.holders.menus.main;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;

/**
 * Created by Mahendra Mewara.
 */
public class PartnerItemHolder extends RecyclerView.ViewHolder {
    private ImageView our_partner_iv;
    private View container;

    /**
     * Constructor of PartnerItemHolder
     * @param itemView
     * @param activity
     */
    public PartnerItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;

        our_partner_iv = (ImageView) itemView.findViewById(R.id.our_partner_iv);

    }

    /**
     * getFeatureImage of PartnerItemHolder
     * @return
     */
    public ImageView getFeatureImage() {
        return our_partner_iv;
    }

    /**
     * setFeatureImage of WorkItemHolder
     * @param feature_image
     */
    public void setFeatureImage(ImageView feature_image) {
        this.our_partner_iv = feature_image;
    }

    /**
     *  getContainer of PartnerItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of PartnerItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}