package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class LICServiceReportModal {

    /**
     * Constructor of LICServiceReportModal
     * @param s_no
     * @param tnx_date
     * @param consumer_no
     * @param amt
     * @param policy_no
     * @param drk_ref_no
     * @param status
     */
    public LICServiceReportModal(int s_no, String tnx_date, String consumer_no, String amt,
                                 String policy_no, String drk_ref_no, String status) {
        this.s_no = s_no;
        this.tnx_date = tnx_date;
        this.consumer_no = consumer_no;
        this.amt = amt;
        this.policy_no = policy_no;
        this.drk_ref_no = drk_ref_no;
        this.status = status;
    }

    /**
     * getS_no of LICServiceReportModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of LICServiceReportModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getTnx_date of LICServiceReportModal
     * @return
     */
    public String getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of LICServiceReportModal
     * @param tnx_date
     */
    public void setTnx_date(String tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getConsumer_no of LICServiceReportModal
     * @return
     */
    public String getConsumer_no() {
        return consumer_no;
    }

    /**
     * setConsumer_no of LICServiceReportModal
     * @param consumer_no
     */
    public void setConsumer_no(String consumer_no) {
        this.consumer_no = consumer_no;
    }

    /**
     * getAmt of LICServiceReportModal
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of LICServiceReportModal
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getPolicy_no of LICServiceReportModal
     * @return
     */
    public String getPolicy_no() {
        return policy_no;
    }

    /**
     * setPolicy_no of LICServiceReportModal
     * @param policy_no
     */
    public void setPolicy_no(String policy_no) {
        this.policy_no = policy_no;
    }

    /**
     * getDrk_ref_no of LICServiceReportModal
     * @return
     */
    public String getDrk_ref_no() {
        return drk_ref_no;
    }

    /**
     * setDrk_ref_no of LICServiceReportModal
     * @param drk_ref_no
     */
    public void setDrk_ref_no(String drk_ref_no) {
        this.drk_ref_no = drk_ref_no;
    }

    /**
     * getStatus of LICServiceReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of LICServiceReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    int s_no;
    String tnx_date;
    String consumer_no;
    String amt;
    String policy_no;
    String drk_ref_no;
    String status;
}
