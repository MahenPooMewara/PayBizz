package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class AePSServiceReportModal {

    /**
     * Constructor of AePSServiceReportModal
     * @param sno
     * @param type
     * @param utility_code
     * @param service_type
     * @param ref_id
     * @param txn_date
     * @param bene_aur_receiver
     * @param acc_no
     * @param amount
     * @param charges_aur_commission
     * @param total_amt
     * @param remarks
     */
    public AePSServiceReportModal(int sno, String type, String utility_code, String service_type,
        String ref_id, String txn_date, String bene_aur_receiver, int acc_no, String amount,
        String charges_aur_commission, String total_amt, String remarks) {
        this.sno = sno;
        this.type = type;
        this.utility_code = utility_code;
        this.service_type = service_type;
        this.ref_id = ref_id;
        this.txn_date = txn_date;
        this.bene_aur_receiver = bene_aur_receiver;
        this.acc_no = acc_no;
        this.amount = amount;
        this.charges_aur_commission = charges_aur_commission;
        this.total_amt = total_amt;
        this.remarks = remarks;
    }

    /**
     * getSno of AePSServiceReportModal
     * @return
     */
    public int getSno() {
        return sno;
    }

    /**
     * setSno of AePSServiceReportModal
     * @param sno
     */
    public void setSno(int sno) {
        this.sno = sno;
    }

    /**
     * getType of AePSServiceReportModal
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * setType of AePSServiceReportModal
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getUtility_code of AePSServiceReportModal
     * @return
     */
    public String getUtility_code() {
        return utility_code;
    }

    /**
     * setUtility_code of AePSServiceReportModal
     * @param utility_code
     */
    public void setUtility_code(String utility_code) {
        this.utility_code = utility_code;
    }

    /**
     * getService_type of AePSServiceReportModal
     * @return
     */
    public String getService_type() {
        return service_type;
    }

    /**
     * setService_type of AePSServiceReportModal
     * @param service_type
     */
    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    /**
     * getRef_id of AePSServiceReportModal
     * @return
     */
    public String getRef_id() {
        return ref_id;
    }

    /**
     * setRef_id of AePSServiceReportModal
     * @param ref_id
     */
    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }

    /**
     * getTxn_date of AePSServiceReportModal
     * @return
     */
    public String getTxn_date() {
        return txn_date;
    }

    /**
     * setTxn_date of AePSServiceReportModal
     * @param txn_date
     */
    public void setTxn_date(String txn_date) {
        this.txn_date = txn_date;
    }

    /**
     * getBene_aur_receiver of AePSServiceReportModal
     * @return
     */
    public String getBene_aur_receiver() {
        return bene_aur_receiver;
    }

    /**
     * setBene_aur_receiver of AePSServiceReportModal
     * @param bene_aur_receiver
     */
    public void setBene_aur_receiver(String bene_aur_receiver) {
        this.bene_aur_receiver = bene_aur_receiver;
    }

    /**
     * getAcc_no of AePSServiceReportModal
     * @return
     */
    public int getAcc_no() {
        return acc_no;
    }

    /**
     * setAcc_no of AePSServiceReportModal
     * @param acc_no
     */
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * getAmount of AePSServiceReportModal
     * @return
     */
    public String getAmount() {
        return amount;
    }

    /**
     * setAmount of AePSServiceReportModal
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * getCharges_aur_commission of AePSServiceReportModal
     * @return
     */
    public String getCharges_aur_commission() {
        return charges_aur_commission;
    }

    /**
     * setCharges_aur_commission of AePSServiceReportModal
     * @param charges_aur_commission
     */
    public void setCharges_aur_commission(String charges_aur_commission) {
        this.charges_aur_commission = charges_aur_commission;
    }

    /**
     * getTotal_amt of AePSServiceReportModal
     * @return
     */
    public String getTotal_amt() {
        return total_amt;
    }

    /**
     * setTotal_amt of AePSServiceReportModal
     * @param total_amt
     */
    public void setTotal_amt(String total_amt) {
        this.total_amt = total_amt;
    }

    /**
     * getRemarks of AePSServiceReportModal
     * @return
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * setRemarks of AePSServiceReportModal
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    int sno;
    String type;
    String utility_code;
    String service_type;
    String ref_id;
    String txn_date;
    String bene_aur_receiver;
    int acc_no;
    String amount;
    String charges_aur_commission;
    String total_amt;
    String remarks;
}
