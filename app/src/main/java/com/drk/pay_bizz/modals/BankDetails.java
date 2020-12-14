package com.drk.pay_bizz.modals;

/**
 * Created By Mahendra Mewara
 */
public class BankDetails {

    /**
     * getAcc_no of BankDetails
     * @return
     */
    public long getAcc_no() {
        return acc_no;
    }

    /**
     * getH_name of BankDetails
     * @return
     */
    public String getH_name() {
        return h_name;
    }

    /**
     * getB_name of BankDetails
     * @return
     */
    public String getB_name() {
        return b_name;
    }

    /**
     * getIfsc of BankDetails
     * @return
     */
    public String getIfsc() {
        return ifsc;
    }

    /**
     * setAcc_no of BankDetails
     * @param acc_no
     */
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * setH_name of BankDetails
     * @param h_name
     */
    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    /**
     * setB_name of BankDetails
     * @param b_name
     */
    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    /**
     * setIfsc of BankDetails
     * @param ifsc
     */
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    /**
     * Constructor of BankDetails
     * @param acc_no
     * @param h_name
     * @param b_name
     * @param ifsc
     */
    public BankDetails(long acc_no, String h_name, String b_name, String ifsc) {
        this.acc_no = acc_no;
        this.h_name = h_name;
        this.b_name = b_name;
        this.ifsc = ifsc;
    }

    private long acc_no;
    private String h_name;
    private String b_name;
    private String ifsc;


}
