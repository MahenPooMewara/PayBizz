package com.drk.pay_bizz.holders.menus;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.util.FontManager;
import com.drk.pay_bizz.util.PayBizzAppAPI;

/**
 * Created by Mahendra Mewara.
 */
public class PayUPaymentItemHolder extends RecyclerView.ViewHolder {


    /**
     * Constructor of PayUPaymentItemHolder
     * @param itemView
     * @param activity
     */
    public PayUPaymentItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of PayUPaymentItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        tranc_date_id = PayBizzAppAPI.getTextViewId(itemView, R.id.tranc_date_id, fontManager);
        amt_id = PayBizzAppAPI.getTextViewId(itemView, R.id.amt_id, fontManager);
        mode_id = PayBizzAppAPI.getTextViewId(itemView, R.id.mode_id, fontManager);
        status_id = PayBizzAppAPI.getTextViewId(itemView, R.id.status_id, fontManager);
        tnx_id = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_id, fontManager);
    }

    /**
     *  getContainer of PayUPaymentItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of PayUPaymentItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of PayUPaymentItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of PayUPaymentItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getTranc_date_id of PayUPaymentItemHolder
     * @return
     */
    public TextView getTranc_date_id() {
        return tranc_date_id;
    }

    /**
     * setTranc_date_id of PayUPaymentItemHolder
     * @param tranc_date_id
     */
    public void setTranc_date_id(TextView tranc_date_id) {
        this.tranc_date_id = tranc_date_id;
    }

    /**
     * getAmt_id of PayUPaymentItemHolder
     * @return
     */
    public TextView getAmt_id() {
        return amt_id;
    }

    /**
     * setAmt_id of PayUPaymentItemHolder
     * @param amt_id
     */
    public void setAmt_id(TextView amt_id) {
        this.amt_id = amt_id;
    }

    /**
     * getMode_id of PayUPaymentItemHolder
     * @return
     */
    public TextView getMode_id() {
        return mode_id;
    }

    /**
     * setMode_id of PayUPaymentItemHolder
     * @param mode_id
     */
    public void setMode_id(TextView mode_id) {
        this.mode_id = mode_id;
    }

    /**
     * setStatus_id of PayUPaymentItemHolder
     * @return
     */
    public TextView getStatus_id() {
        return status_id;
    }

    /**
     * setStatus_id of PayUPaymentItemHolder
     * @param status_id
     */
    public void setStatus_id(TextView status_id) {
        this.status_id = status_id;
    }

    /**
     * getTnx_id of PayUPaymentItemHolder
     * @return
     */
    public TextView getTnx_id() {
        return tnx_id;
    }

    /**
     * setTnx_id of PayUPaymentItemHolder
     * @param tnx_id
     */
    public void setTnx_id(TextView tnx_id) {
        this.tnx_id = tnx_id;
    }

    private TextView serial_no_id;
    private TextView tranc_date_id;
    private View container;
    private TextView amt_id;
    private TextView mode_id;
    private TextView status_id;
    private TextView tnx_id;

}