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
public class FAQItemHolder extends RecyclerView.ViewHolder {
    private TextView faq;
    private TextView faqa;

    private View container;

    /**
     * Constructor of FAQItemHolder
     * @param itemView
     * @param activity
     */
    @SuppressLint("WrongConstant")
    public FAQItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        faq = (TextView) itemView.findViewById(R.id.faq);
        faq.setTypeface(fontManager.getRegularFont());

        faqa = (TextView) itemView.findViewById(R.id.faq_ans);
        faqa.setTypeface(fontManager.getMediumFont());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            faqa.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

    }

    /**
     * getFaq of FAQItemHolder
     * @return
     */
    public TextView getFaq() {
        return faq;
    }

    /**
     * setFaq of FAQItemHolder
     * @param faq
     */
    public void setFaq(TextView faq) {
        this.faq = faq;
    }

    /**
     * getFaqa of FAQItemHolder
     * @return
     */
    public TextView getFaqa() {
        return faqa;
    }

    /**
     * setFaqa of FAQItemHolder
     * @param faqa
     */
    public void setFaqa(TextView faqa) {
        this.faqa = faqa;
    }

    /**
     *  getContainer of FAQItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of FAQItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

}