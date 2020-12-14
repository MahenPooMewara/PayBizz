package com.drk.pay_bizz.holders;

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
public class ServiceDescItemHolder extends RecyclerView.ViewHolder {

    /**
     * getImg of ServiceDescItemHolder
     * @return
     */
    public ImageView getImg() {
        return img;
    }

    /**
     * setImg of ServiceDescItemHolder
     * @param img
     */
    public void setImg(ImageView img) {
        this.img = img;
    }

    /**
     * getTitle of ServiceDescItemHolder
     * @return
     */
    public TextView getTitle() {
        return title;
    }

    /**
     * setTitle of ServiceDescItemHolder
     * @param title
     */
    public void setTitle(TextView title) {
        this.title = title;
    }

    /**
     * getDesc of ServiceDescItemHolder
     * @return
     */
    public TextView getDesc() {
        return desc;
    }

    /**
     * setDesc of ServiceDescItemHolder
     * @param desc
     */
    public void setDesc(TextView desc) {
        this.desc = desc;
    }

    private ImageView img;
    private TextView title;
    private TextView desc;

    private View container;

    /**
     * Constructor of ServiceDescItemHolder
     * @param itemView
     * @param activity
     */
    @SuppressLint("WrongConstant")
    public ServiceDescItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        img = (ImageView) itemView.findViewById(R.id.img);

        title = (TextView) itemView.findViewById(R.id.title);
        title.setTypeface(fontManager.getMediumFont());

        desc = (TextView) itemView.findViewById(R.id.desc);
        desc.setTypeface(fontManager.getRegularFont());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            desc.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

    }

    /**
     *  getContainer of ServiceDescItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of ServiceDescItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}