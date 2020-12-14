package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class ServiceDescItemModal {

    /**
     * constructor of ServiceDescItemModal
     * @param title
     * @param desc
     * @param imgID
     */
    public ServiceDescItemModal(String title, String desc, int imgID) {
        this.title = title;
        this.desc = desc;
        this.imgID = imgID;
    }

    /**
     * getTitle of ServiceDescItemModal
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle of ServiceDescItemModal
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getDesc of ServiceDescItemModal
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * setDesc of ServiceDescItemModal
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * getImgID of ServiceDescItemModal
     * @return
     */
    public int getImgID() {
        return imgID;
    }

    /**
     * setImgID of ServiceDescItemModal
     * @param imgID
     */
    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    private String title;
    private String desc;
    private int imgID;

}
