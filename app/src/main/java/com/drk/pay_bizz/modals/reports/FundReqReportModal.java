package com.drk.pay_bizz.modals.reports;

/**
 * Created By Mahendra Mewara
 */
public class FundReqReportModal {

    /**
     * Constructor of FundReqReportModal
     * @param s_no
     * @param amt
     * @param req_date
     * @param pay_mode
     * @param bank_name
     * @param tran_no
     * @param status
     * @param action_date
     */
    public FundReqReportModal(int s_no, String amt, String req_date, String pay_mode,
          String bank_name, String tran_no, String status, String action_date) {
        this.s_no = s_no;
        this.amt = amt;
        this.req_date = req_date;
        this.pay_mode = pay_mode;
        this.bank_name = bank_name;
        this.tran_no = tran_no;
        this.status = status;
        this.action_date = action_date;
    }

    /**
     * getS_no of FundReqReportModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of FundReqReportModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getAmt of FundReqReportModal
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of FundReqReportModal
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getReq_date of FundReqReportModal
     * @return
     */
    public String getReq_date() {
        return req_date;
    }

    /**
     * setReq_date of FundReqReportModal
     * @param req_date
     */
    public void setReq_date(String req_date) {
        this.req_date = req_date;
    }

    /**
     * getPay_mode of FundReqReportModal
     * @return
     */
    public String getPay_mode() {
        return pay_mode;
    }

    /**
     * setPay_mode of FundReqReportModal
     * @param pay_mode
     */
    public void setPay_mode(String pay_mode) {
        this.pay_mode = pay_mode;
    }

    /**
     * getBank_name of FundReqReportModal
     * @return
     */
    public String getBank_name() {
        return bank_name;
    }

    /**
     * setBank_name of FundReqReportModal
     * @param bank_name
     */
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * getTran_no of FundReqReportModal
     * @return
     */
    public String getTran_no() {
        return tran_no;
    }

    /**
     * setTran_no of FundReqReportModal
     * @param tran_no
     */
    public void setTran_no(String tran_no) {
        this.tran_no = tran_no;
    }

    /**
     * getStatus of FundReqReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of FundReqReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * getAction_date of FundReqReportModal
     * @return
     */
    public String getAction_date() {
        return action_date;
    }

    /**
     * setAction_date of FundReqReportModal
     * @param action_date
     */
    public void setAction_date(String action_date) {
        this.action_date = action_date;
    }

    private int s_no;
    private String amt;
    private String req_date;
    private String pay_mode;
    private String bank_name;
    private String tran_no;
    private String status;
    private String action_date;
}
