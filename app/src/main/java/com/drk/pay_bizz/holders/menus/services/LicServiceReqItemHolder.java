package com.drk.pay_bizz.holders.menus.services;

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
public class LicServiceReqItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView tnx_date;
    private TextView consumer_name;
    private TextView amt;
    private TextView policy_no;
    private TextView drk_ref_no;
    private TextView status;

    /**
     * Constructor of LicServiceReqItemHolder
     * @param itemView
     * @param activity
     */
    public LicServiceReqItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of LicServiceReqItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        tnx_date = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_date, fontManager);
        consumer_name = PayBizzAppAPI.getTextViewId(itemView, R.id.consumer_name, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        policy_no = PayBizzAppAPI.getTextViewId(itemView, R.id.policy_no, fontManager);
        drk_ref_no = PayBizzAppAPI.getTextViewId(itemView, R.id.drk_ref_no, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
    }

    /**
     *  getContainer of LicServiceReqItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of LicServiceReqItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of LicServiceReqItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of LicServiceReqItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getTnx_date of LicServiceReqItemHolder
     * @return
     */
    public TextView getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of LicServiceReqItemHolder
     * @param tnx_date
     */
    public void setTnx_date(TextView tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getConsumer_name of LicServiceReqItemHolder
     * @return
     */
    public TextView getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of LicServiceReqItemHolder
     * @param consumer_name
     */
    public void setConsumer_name(TextView consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getAmt of LicServiceReqItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of LicServiceReqItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getPolicy_no of LicServiceReqItemHolder
     * @return
     */
    public TextView getPolicy_no() {
        return policy_no;
    }

    /**
     * setPolicy_no of LicServiceReqItemHolder
     * @param policy_no
     */
    public void setPolicy_no(TextView policy_no) {
        this.policy_no = policy_no;
    }

    /**
     * getDrk_ref_no of LicServiceReqItemHolder
     * @return
     */
    public TextView getDrk_ref_no() {
        return drk_ref_no;
    }

    /**
     * setDrk_ref_no of LicServiceReqItemHolder
     * @param drk_ref_no
     */
    public void setDrk_ref_no(TextView drk_ref_no) {
        this.drk_ref_no = drk_ref_no;
    }

    /**
     * getStatus of LicServiceReqItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of LicServiceReqItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }
}