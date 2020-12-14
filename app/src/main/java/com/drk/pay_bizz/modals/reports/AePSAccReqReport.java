package com.drk.pay_bizz.modals.reports;

/**
 * Created By Mahendra Mewara
 */
public class AePSAccReqReport {

    /**
     * Constructor of AePSAccReqReport
     * @param s_no
     * @param amt
     * @param trn_type
     * @param date_time
     * @param status
     */
    public AePSAccReqReport(int s_no, String amt, String trn_type, String date_time, String status) {
        this.s_no = s_no;
        this.amt = amt;
        this.trn_type = trn_type;
        this.date_time = date_time;
        this.status = status;
    }

    /**
     * getS_no of AePSAccReqReport
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of AePSAccReqReport
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getAmt of AePSAccReqReport
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of AePSAccReqReport
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getTrn_type of AePSAccReqReport
     * @return
     */
    public String getTrn_type() {
        return trn_type;
    }

    /**
     * setTrn_type of AePSAccReqReport
     * @param trn_type
     */
    public void setTrn_type(String trn_type) {
        this.trn_type = trn_type;
    }

    /**
     * getDate_time of AePSAccReqReport
     * @return
     */
    public String getDate_time() {
        return date_time;
    }

    /**
     * setDate_time of AePSAccReqReport
     * @param date_time
     */
    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    /**
     * getStatus of AePSAccReqReport
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of AePSAccReqReport
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    private int s_no;
    private String amt;
    private String trn_type;
    private String date_time;
    private String status;
}
