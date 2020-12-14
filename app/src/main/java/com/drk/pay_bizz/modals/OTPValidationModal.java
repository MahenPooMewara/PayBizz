package com.drk.pay_bizz.modals;

import com.drk.pay_bizz.util.ValidationAPI;

/**
 * Created by Mahendra Mewara
 */
public class OTPValidationModal {
    /**
     * getUser_id of OTPValidationModal
     * @return
     */
    public long getUser_id() {
        return user_id;
    }

    /**
     * getOtp of OTPValidationModal
     * @return
     */
    public long getOtp() {
        return otp;
    }

    /**
     * getAccess_key of OTPValidationModal
     * @return
     */
    public String getAccess_key() {
        return access_key;
    }

    /**
     * setUser_id of OTPValidationModal
     * @param user_id
     */
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    /**
     * setOtp of OTPValidationModal
     * @param otp
     */
    public void setOtp(long otp) {
        this.otp = otp;
    }

    /**
     * Constructor of OTPValidationModal
     * @param user_id
     * @param otp
     */
    public OTPValidationModal(long user_id, long otp) {
        this.user_id = user_id;
        this.otp = otp;
        this.access_key = ValidationAPI.MD5_STR(user_id+"|"+otp);
    }

    private long user_id;
    private long otp;
    private String access_key;
}
