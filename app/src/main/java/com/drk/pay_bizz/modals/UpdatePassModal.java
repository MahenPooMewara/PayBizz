package com.drk.pay_bizz.modals;

import com.drk.pay_bizz.util.ValidationAPI;

/**
 * Created by Mahendra Mewara
 */
public class UpdatePassModal {

    /**
     * getUser_id of UpdatePassModal
     * @return
     */
    public long getUser_id() {
        return user_id;
    }

    /**
     * getN_pass of UpdatePassModal
     * @return
     */
    public String getN_pass() {
        return n_pass;
    }

    /**
     * getAccess_key of UpdatePassModal
     * @return
     */
    public String getAccess_key() {
        return access_key;
    }

    /**
     * setUser_id of UpdatePassModal
     * @param user_id
     */
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    /**
     * setN_pass of UpdatePassModal
     * @param n_pass
     */
    public void setN_pass(String n_pass) {
        this.n_pass = n_pass;
    }

    /**
     * UpdatePassModal of UpdatePassModal
     * @param user_id
     * @param n_pass
     */
    public UpdatePassModal(long user_id, String n_pass) {
        this.user_id = user_id;
        this.n_pass = n_pass;
        this.access_key = ValidationAPI.MD5_STR(user_id + "|" + n_pass) ;
    }

    private long user_id;
    private String n_pass;
    private String access_key;
}
