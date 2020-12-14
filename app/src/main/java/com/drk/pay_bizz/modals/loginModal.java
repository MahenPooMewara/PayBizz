package com.drk.pay_bizz.modals;

import com.drk.pay_bizz.util.ValidationAPI;

/**
 * Created by Mahendra Mewara
 */
public class loginModal {

    /**
     * getUser_id of loginModal
     * @return
     */
    public long getUser_id() {
        return user_id;
    }

    /**
     * getPass of loginModal
     * @return
     */
    public String getPass() {
        return pass;
    }

    /**
     * getAccess_key of loginModal
     * @return
     */
    public String getAccess_key() {
        return access_key;
    }

    /**
     * setUser_id of loginModal
     * @param user_id
     */
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    /**
     * setPass of loginModal
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Constructor of loginModal
     * @param user_id
     * @param pass
     */
    public loginModal(long user_id, String pass) {
        this.user_id = user_id;
        this.pass = pass;
        this.access_key = ValidationAPI.MD5_STR(user_id + "|" + pass);
    }

    private long user_id;
    private String pass;
    private String access_key;


}
