package com.drk.pay_bizz.holders.menus.reports;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.menus.services.EBillServiceReqItemHolder;
import com.drk.pay_bizz.util.FontManager;
import com.drk.pay_bizz.util.PayBizzAppAPI;

/**
 * Created by Mahendra Mewara.
 */
public class EBillReportItemHolder extends EBillServiceReqItemHolder {

    private TextView agnt_code;

    /**
     * Constructor of EBillReportItemHolder
     * @param itemView
     * @param activity
     */
    public EBillReportItemHolder(View itemView, Activity activity) {
        super(itemView, activity);
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of EBillReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        agnt_code = PayBizzAppAPI.getTextViewId(itemView, R.id.agnt_code, fontManager);
    }

    /**
     * getAgnt_code of EBillReportItemHolder
     * @return
     */
    public TextView getAgnt_code() {
        return agnt_code;
    }

    /**
     * setAgnt_code of EBillReportItemHolder
     * @param agnt_code
     */
    public void setAgnt_code(TextView agnt_code) {
        this.agnt_code = agnt_code;
    }

}