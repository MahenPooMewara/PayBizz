package com.drk.pay_bizz.listener;

import android.location.Location;
import android.os.Bundle;

/**
 * Created by Mahendra Mewara.
 */
public interface LocationListener {
    /**
     * onLocationChanged of LocationListener
     * @param var1
     */
    void onLocationChanged(Location var1);

    /**
     * onStatusChanged of LocationListener
     * @param var1
     * @param var2
     * @param var3
     */
    void onStatusChanged(String var1, int var2, Bundle var3);

    /**
     * onProviderEnabled of LocationListener
     * @param var1
     */
    void onProviderEnabled(String var1);

    /**
     * onProviderDisabled of LocationListener
     * @param var1
     */
    void onProviderDisabled(String var1);
}
