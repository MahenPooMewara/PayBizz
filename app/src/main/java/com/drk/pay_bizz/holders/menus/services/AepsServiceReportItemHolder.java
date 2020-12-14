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
public class AepsServiceReportItemHolder extends RecyclerView.ViewHolder {
    private View container;
    private TextView serial_no_id;
    private TextView type;
    private TextView util_code;
    private TextView serv_typ;
    private TextView ref_id_;
    private TextView tnx_date;
    private TextView bene_aur_receiver;
    private TextView acc_no;
    private TextView amt;
    private TextView charges_aur_commission;
    private TextView total_amt;
    private TextView remark;

    /**
     * Constructor of AepsServiceReportItemHolder
     * @param itemView
     * @param activity
     */
    public AepsServiceReportItemHolder(View itemView, Activity activity) {
        super(itemView);
        container = itemView;
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());

        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of AepsServiceReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        serial_no_id = PayBizzAppAPI.getTextViewId(itemView, R.id.serial_no_id, fontManager);
        type = PayBizzAppAPI.getTextViewId(itemView, R.id.type, fontManager);
        util_code = PayBizzAppAPI.getTextViewId(itemView, R.id.util_code, fontManager);
        serv_typ = PayBizzAppAPI.getTextViewId(itemView, R.id.serv_typ, fontManager);
        ref_id_ = PayBizzAppAPI.getTextViewId(itemView, R.id.ref_id_, fontManager);
        tnx_date = PayBizzAppAPI.getTextViewId(itemView, R.id.tnx_date, fontManager);
        bene_aur_receiver = PayBizzAppAPI.getTextViewId(itemView, R.id.bene_aur_receiver,
                fontManager);
        acc_no = PayBizzAppAPI.getTextViewId(itemView, R.id.acc_no, fontManager);
        amt = PayBizzAppAPI.getTextViewId(itemView, R.id.amt, fontManager);
        charges_aur_commission = PayBizzAppAPI.getTextViewId(itemView, R.id.charges_aur_commission,
                fontManager);
        total_amt = PayBizzAppAPI.getTextViewId(itemView, R.id.total_amt, fontManager);
        remark = PayBizzAppAPI.getTextViewId(itemView, R.id.remark, fontManager);
    }

    /**
     * getContainer of AepsServiceReportItemHolder
     * @return
     */
    public View getContainer() {
        return container;
    }

    /**
     * setContainer of AepsServiceReportItemHolder
     * @param container
     */
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getSerial_no_id of AepsServiceReportItemHolder
     * @return
     */
    public TextView getSerial_no_id() {
        return serial_no_id;
    }

    /**
     * setSerial_no_id of AepsServiceReportItemHolder
     * @param serial_no_id
     */
    public void setSerial_no_id(TextView serial_no_id) {
        this.serial_no_id = serial_no_id;
    }

    /**
     * getType of AepsServiceReportItemHolder
     * @return
     */
    public TextView getType() {
        return type;
    }

    /**
     * setType of AepsServiceReportItemHolder
     * @param type
     */
    public void setType(TextView type) {
        this.type = type;
    }

    /**
     * getUtil_code of AepsServiceReportItemHolder
     * @return
     */
    public TextView getUtil_code() {
        return util_code;
    }

    /**
     * setUtil_code of AepsServiceReportItemHolder
     * @param util_code
     */
    public void setUtil_code(TextView util_code) {
        this.util_code = util_code;
    }

    /**
     * getServ_typ of AepsServiceReportItemHolder
     * @return
     */
    public TextView getServ_typ() {
        return serv_typ;
    }

    /**
     * setServ_typ of AepsServiceReportItemHolder
     * @param serv_typ
     */
    public void setServ_typ(TextView serv_typ) {
        this.serv_typ = serv_typ;
    }

    /**
     * getRef_id_ of AepsServiceReportItemHolder
     * @return
     */
    public TextView getRef_id_() {
        return ref_id_;
    }

    /**
     * setRef_id_ of AepsServiceReportItemHolder
     * @param ref_id_
     */
    public void setRef_id_(TextView ref_id_) {
        this.ref_id_ = ref_id_;
    }

    /**
     * getTnx_date of AepsServiceReportItemHolder
     * @return
     */
    public TextView getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of AepsServiceReportItemHolder
     * @param tnx_date
     */
    public void setTnx_date(TextView tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getBene_aur_receiver of AepsServiceReportItemHolder
     * @return
     */
    public TextView getBene_aur_receiver() {
        return bene_aur_receiver;
    }

    /**
     * setBene_aur_receiver of AepsServiceReportItemHolder
     * @param bene_aur_receiver
     */
    public void setBene_aur_receiver(TextView bene_aur_receiver) {
        this.bene_aur_receiver = bene_aur_receiver;
    }

    /**
     * getAcc_no of AepsServiceReportItemHolder
     * @return
     */
    public TextView getAcc_no() {
        return acc_no;
    }

    /**
     * setAcc_no of AepsServiceReportItemHolder
     * @param acc_no
     */
    public void setAcc_no(TextView acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * getAmt of AepsServiceReportItemHolder
     * @return
     */
    public TextView getAmt() {
        return amt;
    }

    /**
     * setAmt of AepsServiceReportItemHolder
     * @param amt
     */
    public void setAmt(TextView amt) {
        this.amt = amt;
    }

    /**
     * getCharges_aur_commission of AepsServiceReportItemHolder
     * @return
     */
    public TextView getCharges_aur_commission() {
        return charges_aur_commission;
    }

    /**
     * setCharges_aur_commission of AepsServiceReportItemHolder
     * @param charges_aur_commission
     */
    public void setCharges_aur_commission(TextView charges_aur_commission) {
        this.charges_aur_commission = charges_aur_commission;
    }

    /**
     * getTotal_amt of AepsServiceReportItemHolder
     * @return
     */
    public TextView getTotal_amt() {
        return total_amt;
    }

    /**
     * setTotal_amt of AepsServiceReportItemHolder
     * @param total_amt
     */
    public void setTotal_amt(TextView total_amt) {
        this.total_amt = total_amt;
    }

    /**
     * getRemark of AepsServiceReportItemHolder
     * @return
     */
    public TextView getRemark() {
        return remark;
    }

    /**
     * setRemark of AepsServiceReportItemHolder
     * @param remark
     */
    public void setRemark(TextView remark) {
        this.remark = remark;
    }
}