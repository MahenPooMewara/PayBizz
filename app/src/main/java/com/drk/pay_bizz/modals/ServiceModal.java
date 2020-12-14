package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class ServiceModal {

    /**
     * Constructor of ServiceModal
     * @param title
     * @param imgId
     */
    public ServiceModal(String title, int imgId) {
        this.title = title;
        this.imgId = imgId;
    }

    /**
     * getTitle of ServiceModal
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle of ServiceModal
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getImgId of ServiceModal
     * @return
     */
    public int getImgId() {
        return imgId;
    }

    /**
     * setImgId of ServiceModal
     * @param imgId
     */
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private String title;

    private int imgId;

}
