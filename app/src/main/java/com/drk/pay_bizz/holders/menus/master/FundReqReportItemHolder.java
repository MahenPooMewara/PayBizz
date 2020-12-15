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
public class FundReqReportItemHolder extends RecyclerView.ViewHolder {

    /**
     * Constructor of FundReqReportItemHolder
     * @param itemView
     * @param activity
     */
    public FundReqReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of FundReqReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        req_date = PayBizzAppAPI.getTextViewId(itemView, R.id.req_date, fontManager);
        pay_mode = PayBizzAppAPI.getTextViewId(itemView, R.id.pay_mode, fontManager);
        bank_name = PayBizzAppAPI.getTextViewId(itemView, R.id.bank_name, fontManager);
        tnx_id = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_id, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
        action_date = PayBizzAppAPI.getTextViewId(itemView, R.id.action_date, fontManager);
    }

    /**
     *  getContainer of FundReqReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of FundReqReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of FundReqReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of FundReqReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getTnx_id of FundReqReportItemHolder
     * @return
     */
    public TextView getTnx_id() {
        return tnx_id;
    }

    /**
     * setTnx_id of FundReqReportItemHolder
     * @param tnx_id
     */
    public void setTnx_id(TextView tnx_id) {
        this.tnx_id = tnx_id;
    }

    /**
     * getAmt of FundReqReportItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of FundReqReportItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getReq_date of FundReqReportItemHolder
     * @return
     */
    public TextView getReq_date() {
        return req_date;
    }

    /**
     * setReq_date of FundReqReportItemHolder
     * @param req_date
     */
    public void setReq_date(TextView req_date) {
        this.req_date = req_date;
    }

    /**
     * getPay_mode of FundReqReportItemHolder
     * @return
     */
    public TextView getPay_mode() {
        return pay_mode;
    }

    /**
     * setPay_mode of FundReqReportItemHolder
     * @param pay_mode
     */
    public void setPay_mode(TextView pay_mode) {
        this.pay_mode = pay_mode;
    }

    /**
     * getBank_name of FundReqReportItemHolder
     * @return
     */
    public TextView getBank_name() {
        return bank_name;
    }

    /**
     * setBank_name of FundReqReportItemHolder
     * @param bank_name
     */
    public void setBank_name(TextView bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * getStatus of FundReqReportItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of FundReqReportItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }

    /**
     * getAction_date of FundReqReportItemHolder
     * @return
     */
    public TextView getAction_date() {
        return action_date;
    }

    /**
     * setAction_date of FundReqReportItemHolder
     * @param action_date
     */
    public void setAction_date(TextView action_date) {
        this.action_date = action_date;
    }

    private TextView serial_no_id;
    private TextView amt;
    private TextView req_date;
    private TextView pay_mode;
    private TextView bank_name;
    private TextView status;
    private TextView action_date;
    private View container;
    private TextView tnx_id;

}