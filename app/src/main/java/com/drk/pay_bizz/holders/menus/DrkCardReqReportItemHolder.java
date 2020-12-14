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
public class DrkCardReqReportItemHolder extends RecyclerView.ViewHolder {

    /**
     * Constructor of DrkCardReqReportItemHolder
     * @param itemView
     * @param activity
     */
    public DrkCardReqReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of DrkCardReqReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        card_amt = PayBizzAppAPI.getTextViewId(itemView, R.id.card_amt, fontManager);
        req_for = PayBizzAppAPI.getTextViewId(itemView, R.id.req_for, fontManager);
        req_val = PayBizzAppAPI.getTextViewId(itemView, R.id.req_val, fontManager);
        req_date = PayBizzAppAPI.getTextViewId(itemView, R.id.req_date, fontManager);
        action_date = PayBizzAppAPI.getTextViewId(itemView, R.id.action_date, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
        remark = PayBizzAppAPI.getTextViewId(itemView, R.id.remark, fontManager);
    }

    /**
     *  getContainer of DrkCardReqReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of DrkCardReqReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of DrkCardReqReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getReq_date of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getReq_date() {
        return req_date;
    }

    /**
     * setReq_date of DrkCardReqReportItemHolder
     * @param req_date
     */
    public void setReq_date(TextView req_date) {
        this.req_date = req_date;
    }

    /**
     * getStatus of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of DrkCardReqReportItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }

    /**
     * getAction_date of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getAction_date() {
        return action_date;
    }

    /**
     * setAction_date of DrkCardReqReportItemHolder
     * @param action_date
     */
    public void setAction_date(TextView action_date) {
        this.action_date = action_date;
    }


    /**
     * getCard_amt of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getCard_amt() {
        return card_amt;
    }

    /**
     * setCard_amt of DrkCardReqReportItemHolder
     * @param card_amt
     */
    public void setCard_amt(TextView card_amt) {
        this.card_amt = card_amt;
    }

    /**
     * getReq_for of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getReq_for() {
        return req_for;
    }

    /**
     * setReq_for of DrkCardReqReportItemHolder
     * @param req_for
     */
    public void setReq_for(TextView req_for) {
        this.req_for = req_for;
    }

    /**
     * getReq_val of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getReq_val() {
        return req_val;
    }

    /**
     *  of DrkCardReqReportItemHolder
     * @param req_val
     */
    public void setReq_val(TextView req_val) {
        this.req_val = req_val;
    }

    /**
     * getRemark of DrkCardReqReportItemHolder
     * @return
     */
    public TextView getRemark() {
        return remark;
    }

    /**
     * setRemark of DrkCardReqReportItemHolder
     * @param remark
     */
    public void setRemark(TextView remark) {
        this.remark = remark;
    }

    private TextView serial_no_id;
    private TextView card_amt;
    private TextView req_for;
    private TextView req_val;
    private TextView remark;
    private TextView req_date;
    private TextView status;
    private TextView action_date;
    private View container;

}