package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class DMTMoneyTransferReportModal extends MoneyTransFerNewReportModal{
    /**
     * super constructor of DMTMoneyTransferReportModal
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
    public DMTMoneyTransferReportModal(int sno, int acc_no, String bank_name, String bank_ifsc,
        int m_no, String name, String bene_validate, String transfer_amt, String action) {
        super(sno, acc_no, bank_name, bank_ifsc, m_no, name, bene_validate, transfer_amt, action);
    }

    /**
     * Constructor of DMTMoneyTransferReportModal
     * @param sno
     * @param acc_no
     * @param bank_name
     * @param bank_ifsc
     * @param m_no
     * @param name
     * @param bene_validate
     * @param transfer_amt
     * @param action
     * @param tnx_date
     * @param status
     */
    public DMTMoneyTransferReportModal(int sno, int acc_no, String bank_name, String bank_ifsc,
        int m_no, String name, String bene_validate, String transfer_amt, String action,
        String tnx_date, String status) {
        super(sno, acc_no, bank_name, bank_ifsc, m_no, name, bene_validate, transfer_amt, action);
        this.tnx_date = tnx_date;
        this.status = status;
    }

    /**
     * getTnx_date of DMTMoneyTransferReportModal
     * @return
     */
    public String getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of DMTMoneyTransferReportModal
     * @param tnx_date
     */
    public void setTnx_date(String tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getStatus of DMTMoneyTransferReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of DMTMoneyTransferReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    String tnx_date;
    String status;
}
