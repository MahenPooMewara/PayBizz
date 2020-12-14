package com.drk.pay_bizz.holders.menus.reports;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.menus.services.MoneyTransferNewServiceReportItemHolder;
import com.drk.pay_bizz.util.FontManager;
import com.drk.pay_bizz.util.PayBizzAppAPI;

/**
 * Created by Mahendra Mewara.
 */
public class MoneyTransferReportItemHolder extends MoneyTransferNewServiceReportItemHolder {
    private TextView tnx_date;
    private TextView status;

    /**
     * Constructor of MoneyTransferReportItemHolder
     * @param itemView
     * @param activity
     */
    public MoneyTransferReportItemHolder(View itemView, Activity activity) {
        super(itemView,activity);
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of MoneyTransferReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        tnx_date = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_date, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
    }

    /**
     * getTnx_date of MoneyTransferReportItemHolder
     * @return
     */
    public TextView getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of MoneyTransferReportItemHolder
     * @param tnx_date
     */
    public void setTnx_date(TextView tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getStatus of MoneyTransferReportItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of MoneyTransferReportItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }
}