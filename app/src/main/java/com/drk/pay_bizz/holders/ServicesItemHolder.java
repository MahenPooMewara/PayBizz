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
public class ServicesItemHolder extends RecyclerView.ViewHolder {
    private ImageView service_icon_image;
    private TextView title;

    private View container;

    /**
     * Constructor of ServicesItemHolder
     * @param itemView
     * @param activity
     */
    public ServicesItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        service_icon_image = (ImageView) itemView.findViewById(R.id.service_icon_iv);

        title = (TextView) itemView.findViewById(R.id.service_name_tv);
        title.setTypeface(fontManager.getMediumFont());

    }

    /**
     * getFeatureImage of ServicesItemHolder
     * @return
     */
    public ImageView getFeatureImage() {
        return service_icon_image;
    }

    /**
     * setFeatureImage of ServicesItemHolder
     * @param feature_image
     */
    public void setFeatureImage(ImageView feature_image) {
        this.service_icon_image = feature_image;
    }

    /**
     * getTitle of ServicesItemHolder
     * @return
     */
    public TextView getTitle() {
        return title;
    }

    /**
     * setTitle of ServicesItemHolder
     * @param title
     */
    public void setTitle(TextView title) {
        this.title = title;
    }

    /**
     *  getContainer of ServicesItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of ServicesItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}