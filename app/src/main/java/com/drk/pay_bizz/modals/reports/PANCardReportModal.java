package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class PANCardReportModal {
    /**
     * Constructor of PANCardReportModal
     * @param s_no
     * @param name
     * @param type
     * @param ref_no
     * @param amt
     * @param identity_proof
     * @param address_proof
     * @param dob_proof
     * @param form_49A_I
     * @param form_49A_II
     * @param date
     * @param receipt
     * @param status
     */
    public PANCardReportModal(int s_no, String name, String type, String ref_no, String amt,
        String identity_proof, String address_proof, String dob_proof, String form_49A_I,
        String form_49A_II, String date, String receipt, String status) {
        this.s_no = s_no;
        this.name = name;
        this.type = type;
        this.ref_no = ref_no;
        this.amt = amt;
        this.identity_proof = identity_proof;
        this.address_proof = address_proof;
        this.dob_proof = dob_proof;
        this.form_49A_I = form_49A_I;
        this.form_49A_II = form_49A_II;
        this.date = date;
        this.receipt = receipt;
        this.status = status;
    }

    /**
     * getS_no of PANCardReportModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of PANCardReportModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getName of PANCardReportModal
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setName of PANCardReportModal
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getType of PANCardReportModal
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * setType of PANCardReportModal
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getRef_no of PANCardReportModal
     * @return
     */
    public String getRef_no() {
        return ref_no;
    }

    /**
     * setRef_no of PANCardReportModal
     * @param ref_no
     */
    public void setRef_no(String ref_no) {
        this.ref_no = ref_no;
    }

    /**
     * getAmt of PANCardReportModal
     * @return
     */
    public String getAmt() {
        return amt;
    }

    /**
     * setAmt of PANCardReportModal
     * @param amt
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * getIdentity_proof of PANCardReportModal
     * @return
     */
    public String getIdentity_proof() {
        return identity_proof;
    }

    /**
     * setIdentity_proof of PANCardReportModal
     * @param identity_proof
     */
    public void setIdentity_proof(String identity_proof) {
        this.identity_proof = identity_proof;
    }

    /**
     * getAddress_proof of PANCardReportModal
     * @return
     */
    public String getAddress_proof() {
        return address_proof;
    }

    /**
     * setAddress_proof of PANCardReportModal
     * @param address_proof
     */
    public void setAddress_proof(String address_proof) {
        this.address_proof = address_proof;
    }

    /**
     * getDob_proof of PANCardReportModal
     * @return
     */
    public String getDob_proof() {
        return dob_proof;
    }

    /**
     * setDob_proof of PANCardReportModal
     * @param dob_proof
     */
    public void setDob_proof(String dob_proof) {
        this.dob_proof = dob_proof;
    }

    /**
     * getForm_49A_I of PANCardReportModal
     * @return
     */
    public String getForm_49A_I() {
        return form_49A_I;
    }

    /**
     * setForm_49A_I of PANCardReportModal
     * @param form_49A_I
     */
    public void setForm_49A_I(String form_49A_I) {
        this.form_49A_I = form_49A_I;
    }

    /**
     * getForm_49A_II of PANCardReportModal
     * @return
     */
    public String getForm_49A_II() {
        return form_49A_II;
    }

    /**
     * setForm_49A_II of PANCardReportModal
     * @param form_49A_II
     */
    public void setForm_49A_II(String form_49A_II) {
        this.form_49A_II = form_49A_II;
    }

    /**
     * getDate of PANCardReportModal
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * setDate of PANCardReportModal
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * getReceipt of PANCardReportModal
     * @return
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * setReceipt of PANCardReportModal
     * @param receipt
     */
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    /**
     * getStatus of PANCardReportModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of PANCardReportModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    int s_no;
    String name;
    String type;
    String ref_no;
    String amt;
    String identity_proof;
    String address_proof;
    String dob_proof;
    String form_49A_I;
    String form_49A_II;
    String date;
    String receipt;
    String status;
}
