package com.drk.pay_bizz.modals.reports;

/**
 * Created By Mahendra Mewara
 */
public class DrkGiftCardReportModal {

    /**
     * constructor of DrkGiftCardReportModal
     * @param s_no
     * @param card_amt
     * @param req_for
     * @param req_value
     * @param req_date
     * @param action_date
     * @param status
     * @param remark
     */
    public DrkGiftCardReportModal(int s_no, String card_amt, String req_for, String req_value,
                          String req_date, String action_date, String status, String remark) {
        this.s_no = s_no;
        this.card_amt = card_amt;
        this.req_for = req_for;
        this.req_value = req_value;
        this.req_date = req_date;
        this.action_date = action_date;
        this.status = status;
        this.remark = remark;
    }

    /**
     * getS_no of DrkGiftCardReportModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of DrkGiftCardReportModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getCard_amt of DrkGiftCardReportModal
     * @return
     */
    public String getCard_amt() {
        return card_amt;
    }

    /**
     * setCard_amt of DrkGiftCardReportModal
     * @param card_amt
     */
    public void setCard_amt(String card_amt) {
        this.card_amt = card_amt;
    }

    /**
     * getReq_for of DrkGiftCardReportModal
     * @return
     */
    public String getReq_for() {
        return req_for;
    }

    /**
     * setReq_for of DrkGiftCardReportModal
     * @param req_for
     */
    public void setReq_for(String req_for) {
        this.req_for = req_for;
    }

    /**
     * getReq_value of DrkGiftCardReportModal
     * @return
     */
    public String getReq_value() {
        return req_value;
    }

    /**
     * setReq_value of DrkGiftCardReportModal
     * @param req_value
     */
    public void setReq_value(String req_value) {
        this.req_value = req_value;
    }

    /**
     * getReq_date of DrkGiftCardReportModal
     * @return
     */
    public String getReq_date() {
        return req_date;
    }

    /**
     * setReq_date of DrkGiftCardReportModal
     * @param req_date
     */
    public void setReq_date(String req_date) {
        this.req_date = req_date;
    }

    /**
     * getAction_date of DrkGiftCardReportModal
     * @return
     */
    public String getAction_date() {
        return action_date;
    }

    /**
     * setAction_date of DrkGiftCardReportModal
     * @param action_date
     */
    public void setAction_date(String action_date) {
        this.action_date = action_date;
    }

    /**
     *  of DrkGiftCardReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of DrkGiftCardReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * getRemark of DrkGiftCardReportModal
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * setRemark of DrkGiftCardReportModal
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    private int s_no;
    private String card_amt;
    private String req_for;
    private String req_value;
    private String req_date;
    private String action_date;
    private String status;
    private String remark;


}
