package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class PBFeaturesModal {

    /**
     * Constructor of PBFeaturesModal
     * @param title
     * @param desc
     * @param imgID
     */
    public PBFeaturesModal(String title, String desc, int imgID) {
        this.title = title;
        this.desc = desc;
        this.imgID = imgID;
    }

    /**
     * getTitle of PBFeaturesModal
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle of PBFeaturesModal
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getDesc of PBFeaturesModal
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * setDesc of PBFeaturesModal
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * getImgID of PBFeaturesModal
     * @return
     */
    public int getImgID() {
        return imgID;
    }

    /**
     * setImgID of PBFeaturesModal
     * @param imgID
     */
    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    private String title;

    private String desc;

    private int imgID;


}
