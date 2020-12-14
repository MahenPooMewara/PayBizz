package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara.
 **/
public class LICReportModal extends LICServiceReportModal {
    /**
     * Super Constructor of LICReportModal
     * @param s_no
     * @param tnx_date
     * @param consumer_no
     * @param amt
     * @param policy_no
     * @param drk_ref_no
     * @param status
     */
    public LICReportModal(int s_no, String tnx_date, String consumer_no, String amt,
                          String policy_no, String drk_ref_no, String status) {
        super(s_no, tnx_date, consumer_no, amt, policy_no, drk_ref_no, status);
    }

    /**
     * Constructor of LICReportModal
     * @param s_no
     * @param tnx_date
     * @param consumer_no
     * @param amt
     * @param policy_no
     * @param drk_ref_no
     * @param status
     * @param agent_code
     * @param name
     * @param due_date
     * @param lic
     * @param lic_ref_no
     */
    public LICReportModal(int s_no, String tnx_date, String consumer_no, String amt,
        String policy_no, String drk_ref_no, String status, String agent_code, String name,
        String due_date, String lic, String lic_ref_no) {
        super(s_no, tnx_date, consumer_no, amt, policy_no, drk_ref_no, status);
        this.agent_code = agent_code;
        this.due_date = due_date;
        this.lic = lic;
        this.lic_ref_no = lic_ref_no;
    }

    /**
     * getAgent_code of LICReportModal
     * @return
     */
    public String getAgent_code() {
        return agent_code;
    }

    /**
     * setAgent_code of LICReportModal
     * @param agent_code
     */
    public void setAgent_code(String agent_code) {
        this.agent_code = agent_code;
    }

    /**
     * getDue_date of LICReportModal
     * @return
     */
    public String getDue_date() {
        return due_date;
    }

    /**
     * setDue_date of LICReportModal
     * @param due_date
     */
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    /**
     * getLic of LICReportModal
     * @return
     */
    public String getLic() {
        return lic;
    }

    /**
     * setLic of LICReportModal
     * @param lic
     */
    public void setLic(String lic) {
        this.lic = lic;
    }

    /**
     * getLic_ref_no of LICReportModal
     * @return
     */
    public String getLic_ref_no() {
        return lic_ref_no;
    }

    /**
     * setLic_ref_no of LICReportModal
     * @param lic_ref_no
     */
    public void setLic_ref_no(String lic_ref_no) {
        this.lic_ref_no = lic_ref_no;
    }

    String agent_code;
    String due_date;
    String lic;
    String lic_ref_no;
}
