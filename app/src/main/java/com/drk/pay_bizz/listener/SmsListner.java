package com.drk.pay_bizz.listener;

/**
 * Created by Mahendra Mewara.
 */
public interface SmsListner {
    /**
     * messageReceived of SmsListner
     * @param messageText
     */
    public void messageReceived(String messageText);
}
