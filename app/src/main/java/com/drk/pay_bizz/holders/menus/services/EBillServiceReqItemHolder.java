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
public class EBillServiceReqItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView tnx_date;
    private TextView consumer_name;
    private TextView amt;
    private TextView k_no;
    private TextView drk_ref_no;
    private TextView status_id;

    /**
     * Constructor of EBillServiceReqItemHolder
     * @param itemView
     * @param activity
     */
    public EBillServiceReqItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of EBillServiceReqItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        tnx_date = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_date, fontManager);
        consumer_name = PayBizzAppAPI.getTextViewId(itemView, R.id.consumer_name, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        k_no = PayBizzAppAPI.getTextViewId(itemView, R.id.k_no, fontManager);
        drk_ref_no = PayBizzAppAPI.getTextViewId(itemView, R.id.drk_ref_no, fontManager);
        status_id = PayBizzAppAPI.getTextViewId(itemView, R.id.status_id, fontManager);
    }

    /**
     * getContainer of EBillServiceReqItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     * setContainer of EBillServiceReqItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of EBillServiceReqItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of EBillServiceReqItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getTnx_date of EBillServiceReqItemHolder
     * @return
     */
    public TextView getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of EBillServiceReqItemHolder
     * @param tnx_date
     */
    public void setTnx_date(TextView tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getConsumer_name of EBillServiceReqItemHolder
     * @return
     */
    public TextView getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of EBillServiceReqItemHolder
     * @param consumer_name
     */
    public void setConsumer_name(TextView consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getAmt of EBillServiceReqItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of EBillServiceReqItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getK_no of EBillServiceReqItemHolder
     * @return
     */
    public TextView getK_no() {
        return k_no;
    }

    /**
     * setK_no of EBillServiceReqItemHolder
     * @param k_no
     */
    public void setK_no(TextView k_no) {
        this.k_no = k_no;
    }

    /**
     * getDrk_ref_no of EBillServiceReqItemHolder
     * @return
     */
    public TextView getDrk_ref_no() {
        return drk_ref_no;
    }

    /**
     * setDrk_ref_no of EBillServiceReqItemHolder
     * @param drk_ref_no
     */
    public void setDrk_ref_no(TextView drk_ref_no) {
        this.drk_ref_no = drk_ref_no;
    }

    /**
     * getStatus_id of EBillServiceReqItemHolder
     * @return
     */
    public TextView getStatus_id() {
        return status_id;
    }

    /**
     * setStatus_id of EBillServiceReqItemHolder
     * @param status_id
     */
    public void setStatus_id(TextView status_id) {
        this.status_id = status_id;
    }
}