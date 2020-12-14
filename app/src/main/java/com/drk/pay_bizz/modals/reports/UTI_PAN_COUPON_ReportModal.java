package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara
 **/
public class UTI_PAN_COUPON_ReportModal {

    /**
     * Constructor of UTI_PAN_COUPON_ReportModal
     * @param s_no
     * @param no_of_coupon
     * @param amt
     * @param date_time
     * @param status
     * @param action_date_time
     * @param remarks
     */
    public UTI_PAN_COUPON_ReportModal(int s_no, String no_of_coupon, String amt, String date_time,
                                      String status, String action_date_time, String remarks) {
        this.s_no = s_no;
        this.no_of_coupon = no_of_coupon;
        this.amt = amt;
        this.date_time = date_time;
        this.status = status;
        this.action_date_time = action_date_time;
        this.remarks = remarks;
    }

    /**
     * getS_no of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of UTI_PAN_COUPON_ReportModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getNo_of_coupon of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public String getNo_of_coupon() {
        return no_of_coupon;
    }

    /**
     * setNo_of_coupon of UTI_PAN_COUPON_ReportModal
     * @param no_of_coupon
     */
    public void setNo_of_coupon(String no_of_coupon) {
        this.no_of_coupon = no_of_coupon;
    }

    /**
     * getAmt of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of UTI_PAN_COUPON_ReportModal
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getDate_time of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public String getDate_time() {
        return date_time;
    }

    /**
     * setDate_time of UTI_PAN_COUPON_ReportModal
     * @param date_time
     */
    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    /**
     * getStatus of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of UTI_PAN_COUPON_ReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * getAction_date_time of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public String getAction_date_time() {
        return action_date_time;
    }

    /**
     * setAction_date_time of UTI_PAN_COUPON_ReportModal
     * @param action_date_time
     */
    public void setAction_date_time(String action_date_time) {
        this.action_date_time = action_date_time;
    }

    /**
     * getRemarks of UTI_PAN_COUPON_ReportModal
     * @return
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * setRemarks of UTI_PAN_COUPON_ReportModal
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private int s_no;
    private String no_of_coupon;
    private String amt;
    private String date_time;
    private String status;
    private String action_date_time;
    private String remarks;

}
