package com.drk.pay_bizz.menus.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

import com.drk.pay_bizz.listener.SmsListner;

/**
 * Created by Mahendra Mewara.
 */
public class SmsReceiver extends BroadcastReceiver {
    private static SmsListner mListener;
    Boolean b;
    String abcd,xyz;

    /**
     * onReceive of SmsReceiver
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle data  = intent.getExtras();
        Object[] pdus = (Object[]) data.get("pdus");
        for(int i=0;i<pdus.length;i++){
            SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdus[i]);
            String sender = smsMessage.getDisplayOriginatingAddress();
            // b=sender.endsWith("WNRCRP");  //Just to fetch otp sent from WNRCRP
            String messageBody = smsMessage.getMessageBody();
            abcd=messageBody.replaceAll("[^0-9]","");
            // here abcd contains otp
            //which is in number format
            //Pass on the text to our listener.
            if(b==true) {
                mListener.messageReceived(abcd);  // attach value to interface
            }
            else
            {
            }
        }
    }

    /**
     * bindListener of SmsReceiver
     * @param listener
     */
    public static void bindListener(SmsListner listener) {
        mListener = listener;
    }
}
