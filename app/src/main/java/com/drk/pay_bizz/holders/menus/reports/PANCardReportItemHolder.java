package com.drk.pay_bizz.holders.menus.reports;

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
public class PANCardReportItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView consumer_name;
    private TextView type;
    private TextView ref_no;
    private TextView amt;
    private TextView id_proof;
    private TextView add_proof;
    private TextView dob_proof;
    private TextView form_49_i;
    private TextView form_49_ii;
    private TextView date;
    private TextView receipt;
    private TextView status;

    /**
     * Constructor of PANCardReportItemHolder
     * @param itemView
     * @param activity
     */
    public PANCardReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of PANCardReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        consumer_name = PayBizzAppAPI.getTextViewId(itemView, R.id.consumer_name, fontManager);
        type = PayBizzAppAPI.getTextViewId(itemView, R.id.type, fontManager);
        ref_no = PayBizzAppAPI.getTextViewId(itemView, R.id.ref_no, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        id_proof = PayBizzAppAPI.getTextViewId(itemView, R.id.id_proof, fontManager);
        add_proof = PayBizzAppAPI.getTextViewId(itemView, R.id.add_proof, fontManager);
        dob_proof = PayBizzAppAPI.getTextViewId(itemView, R.id.dob_proof, fontManager);
        form_49_i = PayBizzAppAPI.getTextViewId(itemView, R.id.form_49_i, fontManager);
        form_49_ii = PayBizzAppAPI.getTextViewId(itemView, R.id.form_49_ii, fontManager);
        date = PayBizzAppAPI.getTextViewId(itemView, R.id.date, fontManager);
        receipt = PayBizzAppAPI.getTextViewId(itemView, R.id.receipt, fontManager);
        status = PayBizzAppAPI.getTextViewId(itemView, R.id.status, fontManager);
    }

    /**
     *  getContainer of PANCardReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     *  setContainer of PANCardReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of PANCardReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of PANCardReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getConsumer_name of PANCardReportItemHolder
     * @return
     */
    public TextView getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of PANCardReportItemHolder
     * @param consumer_name
     */
    public void setConsumer_name(TextView consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getType of PANCardReportItemHolder
     * @return
     */
    public TextView getType() {
        return type;
    }

    /**
     * setType of PANCardReportItemHolder
     * @param type
     */
    public void setType(TextView type) {
        this.type = type;
    }

    /**
     * getRef_no of PANCardReportItemHolder
     * @return
     */
    public TextView getRef_no() {
        return ref_no;
    }

    /**
     * setRef_no of PANCardReportItemHolder
     * @param ref_no
     */
    public void setRef_no(TextView ref_no) {
        this.ref_no = ref_no;
    }

    /**
     * getAmt of PANCardReportItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of PANCardReportItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getId_proof of PANCardReportItemHolder
     * @return
     */
    public TextView getId_proof() {
        return id_proof;
    }

    /**
     * setId_proof of PANCardReportItemHolder
     * @param id_proof
     */
    public void setId_proof(TextView id_proof) {
        this.id_proof = id_proof;
    }

    /**
     * getAdd_proof of PANCardReportItemHolder
     * @return
     */
    public TextView getAdd_proof() {
        return add_proof;
    }

    /**
     * setAdd_proof of PANCardReportItemHolder
     * @param add_proof
     */
    public void setAdd_proof(TextView add_proof) {
        this.add_proof = add_proof;
    }

    /**
     * getDob_proof of PANCardReportItemHolder
     * @return
     */
    public TextView getDob_proof() {
        return dob_proof;
    }

    /**
     * setDob_proof of PANCardReportItemHolder
     * @param dob_proof
     */
    public void setDob_proof(TextView dob_proof) {
        this.dob_proof = dob_proof;
    }

    /**
     * getForm_49_i of PANCardReportItemHolder
     * @return
     */
    public TextView getForm_49_i() {
        return form_49_i;
    }

    /**
     * setForm_49_i of PANCardReportItemHolder
     * @param form_49_i
     */
    public void setForm_49_i(TextView form_49_i) {
        this.form_49_i = form_49_i;
    }

    /**
     * getForm_49_ii of PANCardReportItemHolder
     * @return
     */
    public TextView getForm_49_ii() {
        return form_49_ii;
    }

    /**
     * setForm_49_ii of PANCardReportItemHolder
     * @param form_49_ii
     */
    public void setForm_49_ii(TextView form_49_ii) {
        this.form_49_ii = form_49_ii;
    }

    /**
     * getDate of PANCardReportItemHolder
     * @return
     */
    public TextView getDate() {
        return date;
    }

    /**
     * setDate of PANCardReportItemHolder
     * @param date
     */
    public void setDate(TextView date) {
        this.date = date;
    }

    /**
     * getReceipt of PANCardReportItemHolder
     * @return
     */
    public TextView getReceipt() {
        return receipt;
    }

    /**
     * setReceipt of PANCardReportItemHolder
     * @param receipt
     */
    public void setReceipt(TextView receipt) {
        this.receipt = receipt;
    }

    /**
     * getStatus of PANCardReportItemHolder
     * @return
     */
    public TextView getStatus() {
        return status;
    }

    /**
     * setStatus of PANCardReportItemHolder
     * @param status
     */
    public void setStatus(TextView status) {
        this.status = status;
    }
}