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
 **/
public class UTI_PAN_CardReqItemHolder extends RecyclerView.ViewHolder {

    /**
     * getContainer of UTI_PAN_CardReqItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of UTI_PAN_CardReqItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of UTI_PAN_CardReqItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getNo_of_coupon of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getNo_of_coupon() {
        return no_of_coupon;
    }

    /**
     * setNo_of_coupon of UTI_PAN_CardReqItemHolder
     * @param no_of_coupon
     */
    public void setNo_of_coupon(TextView no_of_coupon) {
        this.no_of_coupon = no_of_coupon;
    }

    /**
     * getAmt of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of UTI_PAN_CardReqItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getDate_time of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getDate_time() {
        return date_time;
    }

    /**
     * setDate_time of UTI_PAN_CardReqItemHolder
     * @param date_time
     */
    public void setDate_time(TextView date_time) {
        this.date_time = date_time;
    }

    /**
     * getStatus_id of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getStatus_id() {
        return status_id;
    }

    /**
     * setStatus_id of UTI_PAN_CardReqItemHolder
     * @param status_id
     */
    public void setStatus_id(TextView status_id) {
        this.status_id = status_id;
    }

    /**
     * getRemark of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getRemark() {
        return remark;
    }

    /**
     * setRemark of UTI_PAN_CardReqItemHolder
     * @param remark
     */
    public void setRemark(TextView remark) {
        this.remark = remark;
    }

    /**
     * getAction_date of UTI_PAN_CardReqItemHolder
     * @return
     */
    public TextView getAction_date() {
        return action_date;
    }

    /**
     * setAction_date of UTI_PAN_CardReqItemHolder
     * @param action_date
     */
    public void setAction_date(TextView action_date) {
        this.action_date = action_date;
    }

    private View container;
    private TextView serial_no_id;
    private TextView no_of_coupon;
    private TextView amt;
    private TextView date_time;
    private TextView status_id;
    private TextView remark;
    private TextView action_date;

    /**
     * Constructor of UTI_PAN_CardReqItemHolder
     * @param itemView
     * @param activity
     */
    public UTI_PAN_CardReqItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of UTI_PAN_CardReqItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        no_of_coupon = PayBizzAppAPI.getTextViewId(itemView, R.id.no_of_coupon, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        date_time = PayBizzAppAPI.getTextViewId(itemView, R.id.date_time, fontManager);
        status_id = PayBizzAppAPI.getTextViewId(itemView, R.id.status_id, fontManager);
        remark = PayBizzAppAPI.getTextViewId(itemView, R.id.remark, fontManager);
        action_date = PayBizzAppAPI.getTextViewId(itemView, R.id.action_date, fontManager);
    }
}
