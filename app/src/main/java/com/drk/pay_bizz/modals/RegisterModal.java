package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class RegisterModal {

    /**
     * Constructor of RegisterModal
     * @param a_for
     * @param u_name
     * @param m_no
     * @param eid
     * @param a_no
     * @param PAN
     * @param DOB
     * @param address
     * @param street
     * @param NBY
     * @param CITY
     * @param state
     * @param district
     * @param pincode
     * @param mBankDetails
     * @param mFileUploadDetails
     * @param pass
     * @param lat
     * @param longi
     */
    public RegisterModal(String a_for, String u_name, long m_no, String eid, long a_no, String PAN,
                         String DOB, String address, String street, String NBY, String CITY,
                         String state, String district, String pincode, BankDetails mBankDetails,
                         FileUploadDetails mFileUploadDetails, String pass,
                         String lat, String longi) {
        this.a_for = a_for;
        this.u_name = u_name;
        M_no = m_no;
        Eid = eid;
        A_no = a_no;
        this.PAN = PAN;
        this.DOB = DOB;
        Address = address;
        Street = street;
        this.NBY = NBY;
        this.CITY = CITY;
        State = state;
        District = district;
        this.pincode = pincode;
        this.mBankDetails = mBankDetails;
        this.mFileUploadDetails = mFileUploadDetails;
        this.pass = pass;
        this.lat = lat;
        this.longi = longi;
    }

    /**
     * getRid of RegisterModal
     * @return
     */
    public long getRid() {
        return rid;
    }

    /**
     * getA_for of RegisterModal
     * @return
     */
    public String getA_for() {
        return a_for;
    }

    /**
     * getU_name of RegisterModal
     * @return
     */
    public String getU_name() {
        return u_name;
    }

    /**
     * getM_no of RegisterModal
     * @return
     */
    public long getM_no() {
        return M_no;
    }

    /**
     * getEid of RegisterModal
     * @return
     */
    public String getEid() {
        return Eid;
    }

    /**
     * getA_no of RegisterModal
     * @return
     */
    public long getA_no() {
        return A_no;
    }

    /**
     * getPAN of RegisterModal
     * @return
     */
    public String getPAN() {
        return PAN;
    }

    /**
     * getDOB of RegisterModal
     * @return
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * getGST of RegisterModal
     * @return
     */
    public String getGST() {
        return GST;
    }

    /**
     * getAddress of RegisterModal
     * @return
     */
    public String getAddress() {
        return Address;
    }

    /**
     * getStreet of RegisterModal
     * @return
     */
    public String getStreet() {
        return Street;
    }

    /**
     * getNBY of RegisterModal
     * @return
     */
    public String getNBY() {
        return NBY;
    }

    /**
     * getCITY of RegisterModal
     * @return
     */
    public String getCITY() {
        return CITY;
    }

    /**
     * getState of RegisterModal
     * @return
     */
    public String getState() {
        return State;
    }

    /**
     * getDiv of RegisterModal
     * @return
     */
    public String getDiv() {
        return Div;
    }

    /**
     * getDistrict of RegisterModal
     * @return
     */
    public String getDistrict() {
        return District;
    }

    /**
     * get Pincode of RegisterModal
     * @return
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * get BankDetails of RegisterModal
     * @return
     */
    public BankDetails getmBankDetails() {
        return mBankDetails;
    }

    /**
     * get FileUploadDetails of RegisterModal
     * @return
     */
    public FileUploadDetails getmFileUploadDetails() {
        return mFileUploadDetails;
    }

    /**
     * getPass of RegisterModal
     * @return
     */
    public String getPass() {
        return pass;
    }

    /**
     * get latitude of RegisterModal
     * @return
     */
    public String getLat() {
        return lat;
    }

    /**
     * get Longitude of RegisterModal
     * @return
     */
    public String getLongi() {
        return longi;
    }

    /**
     * setRid of RegisterModal
     * @param rid
     */
    public void setRid(long rid) {
        this.rid = rid;
    }

    /**
     * setA_for of RegisterModal
     * @param a_for
     */
    public void setA_for(String a_for) {
        this.a_for = a_for;
    }

    /**
     * setU_name of RegisterModal
     * @param u_name
     */
    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    /**
     * setM_no of RegisterModal
     * @param m_no
     */
    public void setM_no(long m_no) {
        M_no = m_no;
    }

    /**
     * setEid of RegisterModal
     * @param eid
     */
    public void setEid(String eid) {
        Eid = eid;
    }

    /**
     * setA_no of RegisterModal
     * @param a_no
     */
    public void setA_no(long a_no) {
        A_no = a_no;
    }

    /**
     * setPAN of RegisterModal
     * @param PAN
     */
    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    /**
     * setDOB of RegisterModal
     * @param DOB
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * setGST of RegisterModal
     * @param GST
     */
    public void setGST(String GST) {
        this.GST = GST;
    }

    /**
     * setAddress of RegisterModal
     * @param address
     */
    public void setAddress(String address) {
        Address = address;
    }

    /**
     * setStreet of RegisterModal
     * @param street
     */
    public void setStreet(String street) {
        Street = street;
    }

    /**
     * setNBY of RegisterModal
     * @param NBY
     */
    public void setNBY(String NBY) {
        this.NBY = NBY;
    }

    /**
     * set city of RegisterModal
     * @param CITY
     */
    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    /**
     * set state of RegisterModal
     * @param state
     */
    public void setState(String state) {
        State = state;
    }

    /**
     * set division of RegisterModal
     * @param div
     */
    public void setDiv(String div) {
        Div = div;
    }

    /**
     * set district of RegisterModal
     * @param district
     */
    public void setDistrict(String district) {
        District = district;
    }

    /**
     * set pin-code of RegisterModal
     * @param pincode
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * set Bank Details of RegisterModal
     * @param mBankDetails
     */
    public void setmBankDetails(BankDetails mBankDetails) {
        this.mBankDetails = mBankDetails;
    }

    /**
     * set File uploading Details of RegisterModal
     * @param mFileUploadDetails
     */
    public void setmFileUploadDetails(FileUploadDetails mFileUploadDetails) {
        this.mFileUploadDetails = mFileUploadDetails;
    }

    /**
     * set password of RegisterModal
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * get Longitude of RegisterModal
     * @param lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * set Longitude of RegisterModal
     * @param longi
     */
    public void setLongi(String longi) {
        this.longi = longi;
    }

    private long rid;
    private String  a_for;
    private String  u_name;
    private long M_no;
    private String Eid;
    private long A_no;
    private String PAN;
    private String DOB;
    private String GST;
    private String Address;
    private String Street;
    private String NBY;
    private String CITY;
    private String State;
    private String Div;
    private String District;
    private String pincode;
    private BankDetails mBankDetails;
    private FileUploadDetails mFileUploadDetails;
    private String pass;
    private String lat;
    private String longi;

}
