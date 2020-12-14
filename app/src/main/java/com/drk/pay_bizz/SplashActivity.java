package com.drk.pay_bizz;

import android.Manifest;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.InflateException;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.drk.pay_bizz.util.AppConstants;
import com.drk.pay_bizz.util.PayBizzAppAPI;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by Mahendra Mewara.
 */
public class SplashActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CODE = AppConstants.ONE;
    private static final int REQUEST_CODE = 3456;
    private static final int REQUEST_UPDATE_CODE = 3457;

    private Activity mSplashActivity;

    private View mView;

    private Resources mResources;

    /**
     * The {@code FirebaseAnalytics} used to record screen views.
     */
    private FirebaseAnalytics mFirebaseAnalytics;

    private GoogleApiClient mGoogleApiClient;
    private Location mLocation;
    private LocationManager mLocationManager;
    private LocationRequest mLocationRequest;

    private static final String TAG = "SPLASH_ACTIVITY";

    private Handler mHandler;
    private Runnable mRunnable;

    /**
     * onCreate of SplashActivity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        try {
            setContentView( R.layout.splash_layout );
            mSplashActivity = this;
            mView = this.findViewById( R.id.pay_bizz_logo_splash);
            mResources = mSplashActivity.getResources();
            mHandler = new Handler();
           // initialMethod();


            FirebaseApp.initializeApp(this);
            /*if (StoryAppSharedPreference.getPrefCount(this,
                    AppConstants.GET_ACCOUNTS_INFO) == 56) {*/
                callSplashMainView();
            //}

        } catch (InflateException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * onActivityResult of SplashActivity
     * @param requestCode
     * @param resultCode
     * @param data
     */
    protected void onActivityResult(final int requestCode, final int resultCode,
                                    final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            String accountName = data.getStringExtra(AccountManager.KEY_ACCOUNT_NAME);
            assert accountName != null;
            Log.d(TAG, accountName);
            String[] arrOfStr = accountName.split( "@" );
            callSplashMainView();
        }

    }

    /**
     * onResume of SplashActivity
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * initialMethod of SplashActivity
     */
    public void initialMethod() {
            callSplashMainView();
    }

    /**
     * onStart of SplashActivity
     */
    public void onStart() {
        super.onStart();
    }

    /**
     * callSplashMainView of SplashActivity
     */
    private void callSplashMainView() {
        if (PayBizzAppAPI.isConnected( mSplashActivity )) {
            mRunnable = new Runnable() {
                // Using handler with postDelayed called runnable run method
                @Override
                public void run() {
                    try {
                        Intent intent = new Intent(SplashActivity.this,
                                LoginDashBoard.class);
                                //DashBoard.class);
                        mHandler.removeCallbacks(mRunnable);
                        mSplashActivity.finish();
                        startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            mHandler.postDelayed(mRunnable, AppConstants.ONE_THOUSAND_VALUE_);
        }

    }

    /**
     * startMainActivityCall of SplashActivity
     */
    private void startMainActivityCall() {
        try {
            Intent intent = new Intent( SplashActivity.this,
                    DashBoard.class );
            mHandler.removeCallbacks( mRunnable );
            mSplashActivity.finish();
            startActivity( intent );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * checkPermission of SplashActivity
     * @return
     */
    private boolean checkPermission() {
        int access_fine_location = ContextCompat.checkSelfPermission( getApplicationContext(),
                Manifest.permission.ACCESS_FINE_LOCATION );
        int storage = ContextCompat.checkSelfPermission( getApplicationContext(),
                Manifest.permission.WRITE_EXTERNAL_STORAGE );
        int coarse = ContextCompat.checkSelfPermission( getApplicationContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION );
        int account = ContextCompat.checkSelfPermission( getApplicationContext(),
                Manifest.permission.GET_ACCOUNTS );
        return access_fine_location == PackageManager.PERMISSION_GRANTED ||
                storage == PackageManager.PERMISSION_GRANTED ||
                account == PackageManager.PERMISSION_GRANTED ||
                coarse == PackageManager.PERMISSION_GRANTED;
    }

    /**
     * requestPermission of SplashActivity
     */
    private void requestPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale( mSplashActivity,
                Manifest.permission.ACCESS_FINE_LOCATION )) {
            PayBizzAppAPI.showShortToastMessage( mSplashActivity,
                    mResources.getString( R.string.digital_place ) );
        } else if (ActivityCompat.shouldShowRequestPermissionRationale( mSplashActivity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE )) {
        } else if (ActivityCompat.shouldShowRequestPermissionRationale( mSplashActivity,
                Manifest.permission.ACCESS_COARSE_LOCATION )) {

        } else if (ActivityCompat.shouldShowRequestPermissionRationale( mSplashActivity,
                Manifest.permission.GET_ACCOUNTS )) {
        } else {
            ActivityCompat.requestPermissions( mSplashActivity,
                    new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.GET_ACCOUNTS,
                            Manifest.permission.ACCESS_COARSE_LOCATION,
                    }, PERMISSION_REQUEST_CODE );
        }
    }

    /**
     * onRequestPermissionsResult of SplashActivity
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @SuppressWarnings({"CStyleArrayDeclaration", "SwitchStatementWithTooFewBranches"})
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[],
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > AppConstants.ZERO &&
                        grantResults[AppConstants.ZERO]
                                == PackageManager.PERMISSION_GRANTED) {
                    setSnackBarMethod();
                } else if (grantResults.length > AppConstants.ONE &&
                        grantResults[AppConstants.ONE]
                                == PackageManager.PERMISSION_GRANTED) {
                    setSnackBarMethod();
                } else {
                    Snackbar.make( mView, mResources.getString( R.string.
                            splash_activity_permission_denied ), Snackbar.LENGTH_LONG ).show();
                }

                break;
        }
    }

    /**
     *  setSnackBarMethod of SplashActivity
     */
    private void setSnackBarMethod() {
        initialMethod();
    }

}


