package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class MoneyTransFerNewReportModal {
    /**
     * Constructor of MoneyTransFerNewReportModal
     * @param sno
     * @param acc_no
     * @param bank_name
     * @param bank_ifsc
     * @param m_no
     * @param name
     * @param bene_validate
     * @param transfer_amt
     * @param action
     */
    public MoneyTransFerNewReportModal(int sno, int acc_no, String bank_name, String bank_ifsc,
       int m_no, String name, String bene_validate, String transfer_amt, String action) {
        this.sno = sno;
        this.acc_no = acc_no;
        this.bank_name = bank_name;
        this.bank_ifsc = bank_ifsc;
        this.m_no = m_no;
        this.name = name;
        this.bene_validate = bene_validate;
        this.transfer_amt = transfer_amt;
        this.action = action;
    }

    /**
     * getSno of MoneyTransFerNewReportModal
     * @return
     */
    public int getSno() {
        return sno;
    }

    /**
     * setSno of MoneyTransFerNewReportModal
     * @param sno
     */
    public void setSno(int sno) {
        this.sno = sno;
    }

    /**
     * getAcc_no of MoneyTransFerNewReportModal
     * @return
     */
    public int getAcc_no() {
        return acc_no;
    }

    /**
     * setAcc_no of MoneyTransFerNewReportModal
     * @param acc_no
     */
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * getBank_name of MoneyTransFerNewReportModal
     * @return
     */
    public String getBank_name() {
        return bank_name;
    }

    /**
     * setBank_name of MoneyTransFerNewReportModal
     * @param bank_name
     */
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * getBank_ifsc of MoneyTransFerNewReportModal
     * @return
     */
    public String getBank_ifsc() {
        return bank_ifsc;
    }

    /**
     * setBank_ifsc of MoneyTransFerNewReportModal
     * @param bank_ifsc
     */
    public void setBank_ifsc(String bank_ifsc) {
        this.bank_ifsc = bank_ifsc;
    }

    /**
     * getM_no of MoneyTransFerNewReportModal
     * @return
     */
    public int getM_no() {
        return m_no;
    }

    /**
     * setM_no of MoneyTransFerNewReportModal
     * @param m_no
     */
    public void setM_no(int m_no) {
        this.m_no = m_no;
    }

    /**
     * getName of MoneyTransFerNewReportModal
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setName of MoneyTransFerNewReportModal
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getBene_validate of MoneyTransFerNewReportModal
     * @return
     */
    public String getBene_validate() {
        return bene_validate;
    }

    /**
     * setBene_validate of MoneyTransFerNewReportModal
     * @param bene_validate
     */
    public void setBene_validate(String bene_validate) {
        this.bene_validate = bene_validate;
    }

    /**
     * getTransfer_amt of MoneyTransFerNewReportModal
     * @return
     */
    public String getTransfer_amt() {
        return transfer_amt;
    }

    /**
     * setTransfer_amt of MoneyTransFerNewReportModal
     * @param transfer_amt
     */
    public void setTransfer_amt(String transfer_amt) {
        this.transfer_amt = transfer_amt;
    }

    /**
     * getAction of MoneyTransFerNewReportModal
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * setAction of MoneyTransFerNewReportModal
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    int sno;
    int acc_no;
    String bank_name;
    String bank_ifsc;
    int m_no;
    String name;
    String bene_validate;
    String transfer_amt;
    String action;
    
}
