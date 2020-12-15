package com.drk.pay_bizz.holders.menus.main;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.util.FontManager;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

/**
 * Created by Mahendra Mewara.
 */
public class PBFeaturesItemHolder extends RecyclerView.ViewHolder {
    /**
     * getFeature_au_iv of PBFeaturesItemHolder
     * @return
     */
    public ImageView getFeature_au_iv() {
        return feature_au_iv;
    }

    /**
     * setFeature_au_iv of PBFeaturesItemHolder
     * @param feature_au_iv
     */
    public void setFeature_au_iv(ImageView feature_au_iv) {
        this.feature_au_iv = feature_au_iv;
    }

    /**
     * getFeature_au_tv of PBFeaturesItemHolder
     * @return
     */
    public TextView getFeature_au_tv() {
        return feature_au_tv;
    }

    /**
     * setFeature_au_tv of PBFeaturesItemHolder
     * @param feature_au_tv
     */
    public void setFeature_au_tv(TextView feature_au_tv) {
        this.feature_au_tv = feature_au_tv;
    }

    /**
     * getFeature_au_desc_tv of PBFeaturesItemHolder
     * @return
     */
    public TextView getFeature_au_desc_tv() {
        return feature_au_desc_tv;
    }

    /**
     * setFeature_au_desc_tv of PBFeaturesItemHolder
     * @param feature_au_desc_tv
     */
    public void setFeature_au_desc_tv(TextView feature_au_desc_tv) {
        this.feature_au_desc_tv = feature_au_desc_tv;
    }

    private ImageView feature_au_iv;
    private TextView feature_au_tv;
    private TextView feature_au_desc_tv;

    private View container;

    /**
     * Constructor of PBFeaturesItemHolder
     * @param itemView
     * @param activity
     */
    @SuppressLint("WrongConstant")
    public PBFeaturesItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        feature_au_iv = (ImageView) itemView.findViewById(R.id.feature_au_iv);

        feature_au_tv = (TextView) itemView.findViewById(R.id.feature_au_tv);
        feature_au_tv.setTypeface(fontManager.getMediumFont());


        feature_au_desc_tv = (TextView) itemView.findViewById(R.id.feature_au_desc_tv);
        feature_au_desc_tv.setTypeface(fontManager.getMediumFont());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            feature_au_desc_tv.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

    }

    /**
     * getContainer of PBFeaturesItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of PBFeaturesItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}