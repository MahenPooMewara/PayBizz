package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class WorkItemModal {

    /**
     * Constructor of WorkItemModal
     * @param mWorkItemTitle
     * @param mServiceImgId
     */
    public WorkItemModal(String mWorkItemTitle, int mServiceImgId) {
        this.title = mWorkItemTitle;
        this.imgId = mServiceImgId;
    }

    /**
     * getTitle of WorkItemModal
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle of WorkItemModal
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getImgId of WorkItemModal
     * @return
     */
    public int getImgId() {
        return imgId;
    }

    /**
     * setImgId of WorkItemModal
     * @param imgId
     */
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private String title;

    private int imgId;

}
