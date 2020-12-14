package com.drk.pay_bizz.holders.menus.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.util.FontManager;
import com.drk.pay_bizz.util.PayBizzAppAPI;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

/**
 * Created by Mahendra Mewara.
 */
public class MoneyTransferNewServiceReportItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView acc_no;
    private TextView bank_name;
    private TextView ifsc_code;
    private TextView mobile_no;
    private TextView name;
    private TextView bene_validate;
    private TextView transfer_amt;
    private TextView action;

    /**
     * Constructor of MoneyTransferNewServiceReportItemHolder
     * @param itemView
     * @param activity
     */
    public MoneyTransferNewServiceReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of MoneyTransferNewServiceReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        acc_no = PayBizzAppAPI.getTextViewId(itemView, R.id.acc_no, fontManager);
        bank_name = PayBizzAppAPI.getTextViewId(itemView, R.id.bank_name, fontManager);
        ifsc_code = PayBizzAppAPI.getTextViewId(itemView, R.id.ifsc_code, fontManager);
        mobile_no = PayBizzAppAPI.getTextViewId(itemView, R.id.mobile_no, fontManager);
        name = PayBizzAppAPI.getTextViewId(itemView, R.id.name, fontManager);
        bene_validate = PayBizzAppAPI.getTextViewId(itemView, R.id.bene_validate, fontManager);
        transfer_amt = PayBizzAppAPI.getTextViewId(itemView, R.id.transfer_amt, fontManager);
        action = PayBizzAppAPI.getTextViewId(itemView, R.id.action, fontManager);
    }

    /**
     *  getContainer of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of MoneyTransferNewServiceReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of MoneyTransferNewServiceReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getAcc_no of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getAcc_no() {
        return acc_no;
    }

    /**
     * setAcc_no of MoneyTransferNewServiceReportItemHolder
     * @param acc_no
     */
    public void setAcc_no(TextView acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * getBank_name of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getBank_name() {
        return bank_name;
    }

    /**
     * setBank_name of MoneyTransferNewServiceReportItemHolder
     * @param bank_name
     */
    public void setBank_name(TextView bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * getIfsc_code of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getIfsc_code() {
        return ifsc_code;
    }

    /**
     * setIfsc_code of MoneyTransferNewServiceReportItemHolder
     * @param ifsc_code
     */
    public void setIfsc_code(TextView ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    /**
     * getMobile_no of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getMobile_no() {
        return mobile_no;
    }

    /**
     * setMobile_no of MoneyTransferNewServiceReportItemHolder
     * @param mobile_no
     */
    public void setMobile_no(TextView mobile_no) {
        this.mobile_no = mobile_no;
    }

    /**
     * getBene_validate of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getBene_validate() {
        return bene_validate;
    }

    /**
     * setBene_validate of MoneyTransferNewServiceReportItemHolder
     * @param bene_validate
     */
    public void setBene_validate(TextView bene_validate) {
        this.bene_validate = bene_validate;
    }

    /**
     * getName of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getName() {
        return name;
    }

    /**
     * setName of MoneyTransferNewServiceReportItemHolder
     * @param name
     */
    public void setName(TextView name) {
        this.name = name;
    }

    /**
     * getTransfer_amt of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getTransfer_amt() {
        return transfer_amt;
    }

    /**
     * setTransfer_amt of MoneyTransferNewServiceReportItemHolder
     * @param transfer_amt
     */
    public void setTransfer_amt(TextView transfer_amt) {
        this.transfer_amt = transfer_amt;
    }

    /**
     * getAction of MoneyTransferNewServiceReportItemHolder
     * @return
     */
    public TextView getAction() {
        return action;
    }

    /**
     * setAction of MoneyTransferNewServiceReportItemHolder
     * @param action
     */
    public void setAction(TextView action) {
        this.action = action;
    }
}