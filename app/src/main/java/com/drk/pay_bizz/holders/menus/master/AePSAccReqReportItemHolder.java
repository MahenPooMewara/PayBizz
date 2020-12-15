package com.drk.pay_bizz.holders.menus.master;

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
public class AePSAccReqReportItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView amt;
    private TextView trn_type;
    private TextView date_time;
    private TextView status_id;

    /**
     * Constructor of AePSAccReqReportItemHolder
     * @param itemView
     * @param activity
     */
    public AePSAccReqReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);

    }

    /**
     * setRegisterID of AePSAccReqReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        trn_type = PayBizzAppAPI.getTextViewId(itemView, R.id.trn_type, fontManager);
        date_time = PayBizzAppAPI.getTextViewId(itemView, R.id.date_time, fontManager);
        status_id = PayBizzAppAPI.getTextViewId(itemView, R.id.status_id, fontManager);
    }

    /**
     * getSerial_no_id of AePSAccReqReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of AePSAccReqReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getAmt of AePSAccReqReportItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of AePSAccReqReportItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getTrn_type of AePSAccReqReportItemHolder
     * @return
     */
    public TextView getTrn_type() {
        return trn_type;
    }

    /**
     * setTrn_type of AePSAccReqReportItemHolder
     * @param trn_type
     */
    public void setTrn_type(TextView trn_type) {
        this.trn_type = trn_type;
    }

    /**
     * getDate_time of AePSAccReqReportItemHolder
     * @return
     */
    public TextView getDate_time() {
        return date_time;
    }

    /**
     *  of AePSAccReqReportItemHolder
     * @param date_time
     */
    public void setDate_time(TextView date_time) {
        this.date_time = date_time;
    }

    /**
     * getStatus_id of AePSAccReqReportItemHolder
     * @return
     */
    public TextView getStatus_id() {
        return status_id;
    }

    /**
     * setStatus_id of AePSAccReqReportItemHolder
     * @param status_id
     */
    public void setStatus_id(TextView status_id) {
        this.status_id = status_id;
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