package com.drk.pay_bizz.modals.reports;

/**
 * Created By Mahendra Mewara
 */
public class PayUGatewayModal {

    /**
     * Constructor of PayUGatewayModal
     * @param serial_no
     * @param trans_date
     * @param amt
     * @param mode
     * @param status
     * @param trnx_no
     */
    public PayUGatewayModal(int serial_no, String trans_date, String amt, String mode,
                            String status, String trnx_no) {
        this.serial_no = serial_no;
        this.trans_date = trans_date;
        this.amt = amt;
        this.mode = mode;
        this.status = status;
        this.trnx_no = trnx_no;
    }

    /**
     * getSerial_no of PayUGatewayModal
     * @return
     */
    public int getSerial_no() {
        return serial_no;
    }

    /**
     * setSerial_no of PayUGatewayModal
     * @param serial_no
     */
    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    /**
     * getTrans_date of PayUGatewayModal
     * @return
     */
    public String getTrans_date() {
        return trans_date;
    }

    /**
     * setTrans_date of PayUGatewayModal
     * @param trans_date
     */
    public void setTrans_date(String trans_date) {
        this.trans_date = trans_date;
    }

    /**
     * getAmt of PayUGatewayModal
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of PayUGatewayModal
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getMode of PayUGatewayModal
     * @return
     */
    public String getMode() {
        return mode;
    }

    /**
     * setMode of PayUGatewayModal
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * getStatus of PayUGatewayModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of PayUGatewayModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * getTrnx_no of PayUGatewayModal
     * @return
     */
    public String getTrnx_no() {
        return trnx_no;
    }

    /**
     * setTrnx_no of PayUGatewayModal
     * @param trnx_no
     */
    public void setTrnx_no(String trnx_no) {
        this.trnx_no = trnx_no;
    }

    private int serial_no;
    private String trans_date;
    private String amt;
    private String mode;
    private String status;
    private String trnx_no;

}
