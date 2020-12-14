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
public class IncomeTaxReportItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView tnx_no;
    private TextView uname;
    private TextView plan_name;
    private TextView consumer_name;
    private TextView plan_amt;
    private TextView plan_commission;
    private TextView total_amt;
    private TextView tnx_date;
    private TextView status;

    /**
     * Constructor of IncomeTaxReportItemHolder
     * @param itemView
     * @param activity
     */
    public IncomeTaxReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of IncomeTaxReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        tnx_no = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_no, fontManager);
        uname = PayBizzAppAPI.getTextViewId(itemView, R.id.uname, fontManager);
        plan_name = PayBizzAppAPI.getTextViewId(itemView, R.id.plan_name, fontManager);
        consumer_name = PayBizzAppAPI.getTextViewId(itemView, R.id.consumer_name, fontManager);
        plan_amt = PayBizzAppAPI.getTextViewId(itemView, R.id.plan_amt, fontManager);
        plan_commission = PayBizzAppAPI.getTextViewId(itemView, R.id.plan_commission, fontManager);
        total_amt = PayBizzAppAPI.getTextViewId(itemView, R.id.total_amt, fontManager);
        tnx_date = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_date, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
    }

    /**
     *  getContainer of IncomeTaxReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of IncomeTaxReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of IncomeTaxReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getTnx_no of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getTnx_no() {
        return tnx_no;
    }

    /**
     * setTnx_no of IncomeTaxReportItemHolder
     * @param tnx_no
     */
    public void setTnx_no(TextView tnx_no) {
        this.tnx_no = tnx_no;
    }

    /**
     * getUname of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getUname() {
        return uname;
    }

    /**
     * setUname of IncomeTaxReportItemHolder
     * @param uname
     */
    public void setUname(TextView uname) {
        this.uname = uname;
    }

    /**
     * getPlan_name of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getPlan_name() {
        return plan_name;
    }

    /**
     * setPlan_name of IncomeTaxReportItemHolder
     * @param plan_name
     */
    public void setPlan_name(TextView plan_name) {
        this.plan_name = plan_name;
    }

    /**
     * getConsumer_name of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of IncomeTaxReportItemHolder
     * @param consumer_name
     */
    public void setConsumer_name(TextView consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getPlan_amt of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getPlan_amt() {
        return plan_amt;
    }

    /**
     * setPlan_amt of IncomeTaxReportItemHolder
     * @param plan_amt
     */
    public void setPlan_amt(TextView plan_amt) {
        this.plan_amt = plan_amt;
    }

    /**
     * getPlan_commission of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getPlan_commission() {
        return plan_commission;
    }

    /**
     * setPlan_commission of IncomeTaxReportItemHolder
     * @param plan_commission
     */
    public void setPlan_commission(TextView plan_commission) {
        this.plan_commission = plan_commission;
    }

    /**
     * getTotal_amt of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getTotal_amt() {
        return total_amt;
    }

    /**
     * setTotal_amt of IncomeTaxReportItemHolder
     * @param total_amt
     */
    public void setTotal_amt(TextView total_amt) {
        this.total_amt = total_amt;
    }

    /**
     * getTnx_date of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of IncomeTaxReportItemHolder
     * @param tnx_date
     */
    public void setTnx_date(TextView tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getStatus of IncomeTaxReportItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of IncomeTaxReportItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }
}