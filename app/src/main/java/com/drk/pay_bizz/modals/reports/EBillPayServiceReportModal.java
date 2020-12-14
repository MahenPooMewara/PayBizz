package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class EBillPayServiceReportModal {
    /**
     * Constructor of EBillPayServiceReportModal
     * @param s_no
     * @param tnx_date
     * @param consumer_name
     * @param amt
     * @param k_no
     * @param drk_ref_no
     * @param status
     */
    public EBillPayServiceReportModal(int s_no, String tnx_date, String consumer_name,
                                      String amt, String k_no, String drk_ref_no, String status) {
        this.s_no = s_no;
        this.tnx_date = tnx_date;
        this.consumer_name = consumer_name;
        this.amt = amt;
        this.k_no = k_no;
        this.drk_ref_no = drk_ref_no;
        this.status = status;
    }

    /**
     * getS_no of EBillPayServiceReportModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of EBillPayServiceReportModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getTnx_date of EBillPayServiceReportModal
     * @return
     */
    public String getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of EBillPayServiceReportModal
     * @param tnx_date
     */
    public void setTnx_date(String tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getConsumer_name of EBillPayServiceReportModal
     * @return
     */
    public String getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of EBillPayServiceReportModal
     * @param consumer_name
     */
    public void setConsumer_name(String consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getAmt of EBillPayServiceReportModal
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of EBillPayServiceReportModal
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getK_no of EBillPayServiceReportModal
     * @return
     */
    public String getK_no() {
        return k_no;
    }

    /**
     * setK_no of EBillPayServiceReportModal
     * @param k_no
     */
    public void setK_no(String k_no) {
        this.k_no = k_no;
    }

    /**
     * getDrk_ref_no of EBillPayServiceReportModal
     * @return
     */
    public String getDrk_ref_no() {
        return drk_ref_no;
    }

    /**
     * setDrk_ref_no of EBillPayServiceReportModal
     * @param drk_ref_no
     */
    public void setDrk_ref_no(String drk_ref_no) {
        this.drk_ref_no = drk_ref_no;
    }

    /**
     * getStatus of EBillPayServiceReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of EBillPayServiceReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    int s_no;
    String tnx_date;
    String consumer_name;
    String amt;
    String k_no;
    String drk_ref_no;
    String status;
}
