package com.drk.pay_bizz.holders.menus.reports;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.holders.menus.services.LicServiceReqItemHolder;
import com.drk.pay_bizz.util.FontManager;
import com.drk.pay_bizz.util.PayBizzAppAPI;

/**
 * Created by Mahendra Mewara.
 */
public class LICReportItemHolder extends LicServiceReqItemHolder {

    private View container;
    private TextView agnt_code;
    private TextView due_date;
    private TextView lic;
    private TextView lic_ref_no;

    /**
     * Constructor of LICReportItemHolder
     * @param itemView
     * @param activity
     */
    public LICReportItemHolder(View itemView, Activity activity) {
        super(itemView, activity);
        container = itemView;
        setRegisterID(itemView, activity);
    }

    /**
     * setRegisterID of LICReportItemHolder
     * @param itemView
     * @param activity
     */
    private void setRegisterID(View itemView, Activity activity) {
        FontManager fontManager = FontManager.getInstance(activity.getBaseContext());
        agnt_code = PayBizzAppAPI.getTextViewId(itemView, R.id.agnt_code, fontManager);
        due_date = PayBizzAppAPI.getTextViewId(itemView, R.id.due_date, fontManager);
        lic = PayBizzAppAPI.getTextViewId(itemView, R.id.lic, fontManager);
        lic_ref_no = PayBizzAppAPI.getTextViewId(itemView, R.id.lic_ref_no, fontManager);
    }

    /**
     * getContainer of LICReportItemHolder
     * @return
     */
    @Override
    public View getContainer() {
        return container;
    }

    /**
     * setContainer of LICReportItemHolder
     * @param container
     */
    @Override
    public void setContainer(View container) {
        this.container = container;
    }

    /**
     * getDue_date of LICReportItemHolder
     * @return
     */
    public TextView getDue_date() {
        return due_date;
    }

    /**
     * setDue_date of LICReportItemHolder
     * @param due_date
     */
    public void setDue_date(TextView due_date) {
        this.due_date = due_date;
    }

    /**
     * getAgnt_code of LICReportItemHolder
     * @return
     */
    public TextView getAgnt_code() {
        return agnt_code;
    }

    /**
     * setAgnt_code of LICReportItemHolder
     * @param agnt_code
     */
    public void setAgnt_code(TextView agnt_code) {
        this.agnt_code = agnt_code;
    }

    /**
     * getLic of LICReportItemHolder
     * @return
     */
    public TextView getLic() {
        return lic;
    }

    /**
     * setLic of LICReportItemHolder
     * @param lic
     */
    public void setLic(TextView lic) {
        this.lic = lic;
    }

    /**
     * getLic_ref_no of LICReportItemHolder
     * @return
     */
    public TextView getLic_ref_no() {
        return lic_ref_no;
    }

    /**
     * setLic_ref_no of LICReportItemHolder
     * @param lic_ref_no
     */
    public void setLic_ref_no(TextView lic_ref_no) {
        this.lic_ref_no = lic_ref_no;
    }
}