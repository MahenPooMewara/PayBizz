package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class FileUploadDetails {

    /**
     * Constructor of FileUploadDetails
     * @param IURL
     * @param PURL
     * @param AFURL
     * @param ABURL
     * @param PACURL
     */
    public FileUploadDetails(String IURL, String PURL, String AFURL, String ABURL, String PACURL) {
        this.IURL = IURL;
        this.PURL = PURL;
        this.AFURL = AFURL;
        this.ABURL = ABURL;
        this.PACURL = PACURL;
    }

    /**
     * getIURL of FileUploadDetails
     * @return
     */
    public String getIURL() {
        return IURL;
    }

    /**
     * getPURL of FileUploadDetails
     * @return
     */
    public String getPURL() {
        return PURL;
    }

    /**
     * getAFURL of FileUploadDetails
     * @return
     */
    public String getAFURL() {
        return AFURL;
    }

    /**
     * getABURL of FileUploadDetails
     * @return
     */
    public String getABURL() {
        return ABURL;
    }

    /**
     * getPACURL of FileUploadDetails
     * @return
     */
    public String getPACURL() {
        return PACURL;
    }

    /**
     * setIURL of FileUploadDetails
     * @param IURL
     */
    public void setIURL(String IURL) {
        this.IURL = IURL;
    }

    /**
     * setPURL of FileUploadDetails
     * @param PURL
     */
    public void setPURL(String PURL) {
        this.PURL = PURL;
    }

    /**
     * setAFURL of FileUploadDetails
     * @param AFURL
     */
    public void setAFURL(String AFURL) {
        this.AFURL = AFURL;
    }

    /**
     * setABURL of FileUploadDetails
     * @param ABURL
     */
    public void setABURL(String ABURL) {
        this.ABURL = ABURL;
    }

    /**
     * setPACURL of FileUploadDetails
     * @param PACURL
     */
    public void setPACURL(String PACURL) {
        this.PACURL = PACURL;
    }

    private String IURL;
    private String PURL;
    private String AFURL;
    private String ABURL;
    private String PACURL;
}
