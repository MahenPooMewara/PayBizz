package com.drk.pay_bizz.modals;

import com.drk.pay_bizz.util.ValidationAPI;

/**
 * Created by Mahendra Mewara
 */
public class SearchModal {

    /**
     * getUser_id of SearchModal
     * @return
     */
    public long getUser_id() {
        return user_id;
    }

    /**
     * setUser_id of SearchModal
     * @param user_id
     */
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    /**
     * Constructor of SearchModal
     * @param user_id
     */
    public SearchModal(long user_id) {
        this.user_id = user_id;
        this.access_key = ValidationAPI.MD5_STR(user_id+"");
    }

    /**
     * getAccess_key of SearchModal
     * @return
     */
    public String getAccess_key() {
        return access_key;
    }

    private long user_id;
    private String access_key;
}
