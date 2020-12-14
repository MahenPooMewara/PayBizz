package com.drk.pay_bizz.holders.menus.reports;

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
public class AllTnxReportItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView consumer_name;
    private TextView agnt_code;
    private TextView opening_bal;
    private TextView amt;
    private TextView dr_and_cr;
    private TextView gross_commission;
    private TextView tds;
    private TextView net_comm;
    private TextView closing_bal;
    private TextView status;
    private TextView remark;
    private TextView sub_date_time;
    private TextView action_date_time;

    /**
     * Constructor of AllTnxReportItemHolder
     * @param itemView
     * @param activity
     */
    public AllTnxReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of AllTnxReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        consumer_name = PayBizzAppAPI.getTextViewId(itemView, R.id.consumer_name, fontManager);
        agnt_code = PayBizzAppAPI.getTextViewId(itemView, R.id.agnt_code, fontManager);
        opening_bal = PayBizzAppAPI.getTextViewId(itemView, R.id.opening_bal, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        dr_and_cr = PayBizzAppAPI.getTextViewId(itemView, R.id.dr_and_cr, fontManager);
        gross_commission = PayBizzAppAPI.getTextViewId(itemView, R.id.gross_commission, fontManager);
        tds = PayBizzAppAPI.getTextViewId(itemView, R.id.tds, fontManager);
        net_comm = PayBizzAppAPI.getTextViewId(itemView, R.id.net_comm, fontManager);
        closing_bal = PayBizzAppAPI.getTextViewId(itemView, R.id.closing_bal, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
        remark = PayBizzAppAPI.getTextViewId(itemView, R.id.remark, fontManager);
        sub_date_time = PayBizzAppAPI.getTextViewId(itemView, R.id.sub_date_time, fontManager);
        action_date_time = PayBizzAppAPI.getTextViewId(itemView, R.id.action_date_time, fontManager);
    }

    /**
     *  getContainer of AllTnxReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of AllTnxReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of AllTnxReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of AllTnxReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getConsumer_name of AllTnxReportItemHolder
     * @return
     */
    public TextView getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of AllTnxReportItemHolder
     * @param consumer_name
     */
    public void setConsumer_name(TextView consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getAgnt_code of AllTnxReportItemHolder
     * @return
     */
    public TextView getAgnt_code() {
        return agnt_code;
    }

    /**
     * setAgnt_code of AllTnxReportItemHolder
     * @param agnt_code
     */
    public void setAgnt_code(TextView agnt_code) {
        this.agnt_code = agnt_code;
    }

    /**
     * getOpening_bal of AllTnxReportItemHolder
     * @return
     */
    public TextView getOpening_bal() {
        return opening_bal;
    }

    /**
     * setOpening_bal of AllTnxReportItemHolder
     * @param opening_bal
     */
    public void setOpening_bal(TextView opening_bal) {
        this.opening_bal = opening_bal;
    }

    /**
     * getAmt of AllTnxReportItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of AllTnxReportItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getDr_and_cr of AllTnxReportItemHolder
     * @return
     */
    public TextView getDr_and_cr() {
        return dr_and_cr;
    }

    /**
     * setDr_and_cr of AllTnxReportItemHolder
     * @param dr_and_cr
     */
    public void setDr_and_cr(TextView dr_and_cr) {
        this.dr_and_cr = dr_and_cr;
    }

    /**
     * getGross_commission of AllTnxReportItemHolder
     * @return
     */
    public TextView getGross_commission() {
        return gross_commission;
    }

    /**
     * setGross_commission of AllTnxReportItemHolder
     * @param gross_commission
     */
    public void setGross_commission(TextView gross_commission) {
        this.gross_commission = gross_commission;
    }

    /**
     * getTds of AllTnxReportItemHolder
     * @return
     */
    public TextView getTds() {
        return tds;
    }

    /**
     * setTds of AllTnxReportItemHolder
     * @param tds
     */
    public void setTds(TextView tds) {
        this.tds = tds;
    }

    /**
     * getNet_comm of AllTnxReportItemHolder
     * @return
     */
    public TextView getNet_comm() {
        return net_comm;
    }

    /**
     * setNet_comm of AllTnxReportItemHolder
     * @param net_comm
     */
    public void setNet_comm(TextView net_comm) {
        this.net_comm = net_comm;
    }

    /**
     * getClosing_bal of AllTnxReportItemHolder
     * @return
     */
    public TextView getClosing_bal() {
        return closing_bal;
    }

    /**
     * setClosing_bal of AllTnxReportItemHolder
     * @param closing_bal
     */
    public void setClosing_bal(TextView closing_bal) {
        this.closing_bal = closing_bal;
    }

    /**
     * getStatus of AllTnxReportItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of AllTnxReportItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }

    /**
     * getRemark of AllTnxReportItemHolder
     * @return
     */
    public TextView getRemark() {
        return remark;
    }

    /**
     * setRemark of AllTnxReportItemHolder
     * @param remark
     */
    public void setRemark(TextView remark) {
        this.remark = remark;
    }

    /**
     * getSub_date_time of AllTnxReportItemHolder
     * @return
     */
    public TextView getSub_date_time() {
        return sub_date_time;
    }

    /**
     * setSub_date_time of AllTnxReportItemHolder
     * @param sub_date_time
     */
    public void setSub_date_time(TextView sub_date_time) {
        this.sub_date_time = sub_date_time;
    }

    /**
     * getAction_date_time of AllTnxReportItemHolder
     * @return
     */
    public TextView getAction_date_time() {
        return action_date_time;
    }

    /**
     * setAction_date_time of AllTnxReportItemHolder
     * @param action_date_time
     */
    public void setAction_date_time(TextView action_date_time) {
        this.action_date_time = action_date_time;
    }
}