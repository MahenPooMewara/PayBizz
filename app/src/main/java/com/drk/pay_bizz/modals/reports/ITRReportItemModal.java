package com.drk.pay_bizz.modals.reports;

/**
 * Created by Mahendra Mewara
 **/
public class ITRReportItemModal {

    /**
     * Constructor of ITRReportItemModal
     * @param s_no
     * @param tnx_no
     * @param uname
     * @param plan_name
     * @param consumer_name
     * @param plan_amt
     * @param plan_commission
     * @param total_amt
     * @param tnx_date
     * @param status
     */
    public ITRReportItemModal(int s_no, String tnx_no, String uname, String plan_name,
        String consumer_name, String plan_amt, String plan_commission, String total_amt,
        String tnx_date, String status) {
        this.s_no = s_no;
        this.tnx_no = tnx_no;
        this.uname = uname;
        this.plan_name = plan_name;
        this.consumer_name = consumer_name;
        this.plan_amt = plan_amt;
        this.plan_commission = plan_commission;
        this.total_amt = total_amt;
        this.tnx_date = tnx_date;
        this.status = status;
    }

    /**
     * getS_no of ITRReportItemModal
     * @return
     */
    public int getS_no() {
        return s_no;
    }

    /**
     * setS_no of ITRReportItemModal
     * @param s_no
     */
    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    /**
     * getTnx_no of ITRReportItemModal
     * @return
     */
    public String getTnx_no() {
        return tnx_no;
    }

    /**
     * setTnx_no of ITRReportItemModal
     * @param tnx_no
     */
    public void setTnx_no(String tnx_no) {
        this.tnx_no = tnx_no;
    }

    /**
     * getUname of ITRReportItemModal
     * @return
     */
    public String getUname() {
        return uname;
    }

    /**
     * getPlan_name of ITRReportItemModal
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * getPlan_name of ITRReportItemModal
     * @return
     */
    public String getPlan_name() {
        return plan_name;
    }

    /**
     * setPlan_name of ITRReportItemModal
     * @param plan_name
     */
    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    /**
     * getConsumer_name of ITRReportItemModal
     * @return
     */
    public String getConsumer_name() {
        return consumer_name;
    }

    /**
     * setConsumer_name of ITRReportItemModal
     * @param consumer_name
     */
    public void setConsumer_name(String consumer_name) {
        this.consumer_name = consumer_name;
    }

    /**
     * getPlan_amt of ITRReportItemModal
     * @return
     */
    public String getPlan_amt() {
        return plan_amt;
    }

    /**
     * setPlan_amt of ITRReportItemModal
     * @param plan_amt
     */
    public void setPlan_amt(String plan_amt) {
        this.plan_amt = plan_amt;
    }

    /**
     * getPlan_commission of ITRReportItemModal
     * @return
     */
    public String getPlan_commission() {
        return plan_commission;
    }

    /**
     * setPlan_commission of ITRReportItemModal
     * @param plan_commission
     */
    public void setPlan_commission(String plan_commission) {
        this.plan_commission = plan_commission;
    }

    /**
     * getTotal_amt of ITRReportItemModal
     * @return
     */
    public String getTotal_amt() {
        return total_amt;
    }

    /**
     * setTotal_amt of ITRReportItemModal
     * @param total_amt
     */
    public void setTotal_amt(String total_amt) {
        this.total_amt = total_amt;
    }

    /**
     * getTnx_date of ITRReportItemModal
     * @return
     */
    public String getTnx_date() {
        return tnx_date;
    }

    /**
     * setTnx_date of ITRReportItemModal
     * @param tnx_date
     */
    public void setTnx_date(String tnx_date) {
        this.tnx_date = tnx_date;
    }

    /**
     * getStatus of ITRReportItemModal
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * setStatus of ITRReportItemModal
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    int s_no;
    String tnx_no;
    String uname;
    String plan_name;
    String consumer_name;
    String plan_amt;
    String plan_commission;
    String total_amt;
    String tnx_date;
    String status;
}
