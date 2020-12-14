package com.drk.pay_bizz.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.drk.pay_bizz.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mahendra Mewara.
 */
@SuppressWarnings("WeakerAccess")
public class PayBizzAppAPI {

    /**
     * @param context the current application context
     * @return whether the device was connected to the internet
     */
    public static boolean isConnected(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)
                    context.getSystemService( Context.CONNECTIVITY_SERVICE );
            Network network;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                assert connectivityManager != null;
                if(connectivityManager.getActiveNetwork() != null) {
                    network = connectivityManager.getActiveNetwork();
                    NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(
                            network );
                    return capabilities != null && capabilities.hasCapability(
                            NetworkCapabilities.NET_CAPABILITY_VALIDATED );
                }else{
                    return AppConstants.BOOLEAN_FALSE;
                }
            }else {
                assert connectivityManager != null;
                //noinspection deprecation
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                //noinspection deprecation
                if (networkInfo != null && networkInfo.isConnected())
                    return AppConstants.BOOLEAN_TRUE;
                else
                    return AppConstants.BOOLEAN_FALSE;
            }
        }catch (OutOfMemoryError e) {
            e.printStackTrace();
            return AppConstants.BOOLEAN_FALSE;
        }catch (Exception e) {
            e.printStackTrace();
            return AppConstants.BOOLEAN_FALSE;
        }catch (Error e) {
            e.printStackTrace();
            return AppConstants.BOOLEAN_FALSE;
        }
    }

    /**
     * Share App
     *
     * @param context   - context
     * @param share_url - body of chooser
     */
    private static void sharePayBizzApp(Context context, String share_url, String subject) {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType(AppConstants.SHARE_MSG_TYPE);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            // This will be change later
            intent.putExtra(Intent.EXTRA_TEXT, share_url);
            if (context != null)
                context.startActivity(Intent.createChooser(intent, AppConstants.SHARE_SUBJECT));
        }catch (Exception e){
            e.printStackTrace();
        }
        // This will be change later

    }

    /**
     * Show Toast Message For Short Time of Period
     *
     * @param activity -activity
     * @param msg      -msg
     */
    public static void showShortToastMessage(Activity activity, String msg) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * Show Toast Message For Long Time of Period
     *
     * @param activity -activity
     * @param msg      -msg
     */
    public static void showLongTimeToastMessage(Activity activity, String msg) {
        Toast.makeText(activity, msg, Toast.LENGTH_LONG).show();
    }

    /**
     * Hide Key Board API
     *
     * @param activity -activity
     */
    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(
                Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one,
        // just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        try {
            assert imm != null;
            imm.hideSoftInputFromWindow( view.getWindowToken(), AppConstants.ZERO );
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Get Contact Us URL
     *
     * @param activity -activity
     */
    private static String getShareUsUrl(Activity activity) {
        Resources resources = activity.getResources();
        return resources.getString(R.string.app_share_url);
    }

    /**
     * setNormalActionProperty of StoryAppApi
     * @param appCompatActivity
     * @param categorytitle
     */
    public static void setNormalActionProperty(AppCompatActivity appCompatActivity,
                                               String categorytitle) {
        Log.e("setNormalActionProperty", "categorytitle"
                + AppConstants.COLON_STRING + categorytitle);
        setNormalActionPropertyUpdation(appCompatActivity, PayBizzAppAPI.getColorCode(categorytitle,
                appCompatActivity));
    }

    /**
     * getColorCode of StoryAppApi
     * @param code
     * @param context
     * @return
     */
    public static int getColorCode(String code, Context context) {
        int return_value;
        try {
            CategoryCode categoryCode = CategoryCode.valueOf(getCategoryProperFormat(code));
            switch (categoryCode) {
                case Romance:
                    return_value = ContextCompat.getColor(context, R.color.black);
                    break;

                default:
                    return_value = ContextCompat.getColor(context, R.color.black);
            }
        } catch (Exception e) {
            return_value = ContextCompat.getColor(context, R.color.black);
        }

        return return_value;
    }

    /**
     * Get Class Proper Format for enum..  of StoryAppApi
     * @param value -value
     * @return
     */
    private static String getCategoryProperFormat(String value) {
        String return_value;
        String[] arr = value.split(AppConstants.ONE_SPACE_STRING);
        if (arr.length == AppConstants.TWO) {
            try {
                return_value = arr[AppConstants.ZERO]
                        + AppConstants.UNDER_SCORE_SYMBOL
                        + arr[AppConstants.ONE];
            } catch (Exception e) {
                return_value = value;
            }
        } else {
            return_value = value;
        }
        return return_value;
    }

    /**
     * setNormalActionPropertyUpdation of StoryAppApi
     * @param appCompatActivity
     * @param color
     */
    public static void setNormalActionPropertyUpdation(AppCompatActivity appCompatActivity,
                                                       int color) {
        if (appCompatActivity != null) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    Objects.requireNonNull(appCompatActivity.getSupportActionBar()).hide();
                } else {
                    //noinspection ConstantConditions
                    appCompatActivity.getSupportActionBar().hide();
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Window window = appCompatActivity.getWindow();
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                window.setStatusBarColor(color);
            }
        }
    }

    /**
     * Load JSON From Assets of StoryAppApi
     * @param activity
     * @param file_name
     * @return
     */
    @SuppressWarnings("CharsetObjectCanBeUsed")
    @Nullable
    public static String loadJSONFromAsset(Activity activity, String file_name) {
        String json;
        try {

            InputStream is = activity.getAssets().open(file_name);
            int size = is.available();
            byte[] buffer = new byte[size];
            //noinspection ResultOfMethodCallIgnored
            is.read(buffer);
            is.close();
            json = new String(buffer, AppConstants.UTF_8_SYMBOL);

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    /**
     * CategoryCode Enum of StoryAppApi
     */
    private enum CategoryCode {
        Romance, Crime, Family_Drama, Poems, Humour, Audio
    }

    /**
     * Time Format API for Timer...
     * timeFormatString of StoryAppApi
     * @param Pos
     * @return
     */
    public static String timeFormatString(int Pos) {
        return String.format(Locale.getDefault(), "%d:%d",
                TimeUnit.MILLISECONDS.toMinutes((long) Pos),
                TimeUnit.MILLISECONDS.toSeconds((long) Pos) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                Pos)));
    }

    /**
     * Return Process String of StoryAppApi
     *
     * @param value
     * @return
     */
    private static String returnProcessString(String value) {
        if (isCheckFirstCharDigit(value)) {
            return AppConstants.UNDER_SCORE_SYMBOL + value;
        } else {
            return value;
        }
    }

    /**
     * Check First Character is Digit or Character of StoryAppApi
     *
     * @param value
     * @return
     */
    private static boolean isCheckFirstCharDigit(String value) {
        final char c = value.charAt(AppConstants.ZERO);
        return (c >= AppConstants.DEFAULT_CONSTANT_ZERO.toCharArray()[AppConstants.
                ZERO] && c <= AppConstants.DEFAULT_CONSTANT_NINE.toCharArray()
                [AppConstants.ZERO]);
    }

    /**
     * Get Static Image from cache in initial conditions of StoryAppApi
     *
     * @param story_code -story_code
     * @param activity -activity
     * @return
     */
    public static Drawable getStoryImageOnBasisOfStoryCode(String story_code, Activity activity) {
        Drawable drawable;
        try {
            StoryCode storyCode = StoryCode.valueOf(returnProcessString(story_code));
            switch (storyCode) {
                /**
                 * Audio Story
                 */
                case _1296:
                    drawable = ContextCompat.getDrawable(activity.getApplicationContext(),
                            R.drawable.ic_menu_slideshow);
                    break;

                default:
                    drawable = null;
                    break;
            }
        } catch (OutOfMemoryError e) {
            drawable = null;
            e.printStackTrace();
        }catch (Exception e) {
            drawable = null;
            e.printStackTrace();
        }catch (Error e) {
            drawable = null;
            e.printStackTrace();
        }

        return drawable;
    }

    /**
     * StoryCode Enum of StoryAppApi
     */
    private enum StoryCode {
        _1296, _998, _974, _1746, _969, _4924, _4918, _4880, _4851, //Audio Stories
    }

    /**
     * Get Static Image from cache in initial conditions of StoryAppApi
     *
     * @param story_code -story_code
     * @param activity -activity
     * @return
     */
    public static Drawable getStoryImageSmallOnBasisOfStoryCode(String story_code,
                                                                Activity activity) {
        Drawable drawable;
        try {
            StoryCode storyCode = StoryCode.valueOf(returnProcessString(story_code));
            switch (storyCode) {
                /**
                 * Audio Story
                 */
                case _1296:
                    drawable = ContextCompat.getDrawable(activity.getApplicationContext(),
                            R.drawable.pay_bizz_logo);
                    break;


                default:
                    drawable = null;
                    break;
            }
        } catch (Exception e) {
            drawable = null;
        }

        return drawable;
    }

    /**
     * getTextViewId of PayBizzAppAPI
     * @param itemView
     * @param id
     * @param fontManager
     * @return
     */
    public static TextView getTextViewId(View itemView, int id, FontManager fontManager) {
        TextView textView = (TextView) itemView.findViewById(id);
        textView.setTypeface(fontManager.getRegularFont());
        return textView;
    }

    static final String DATA = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static Random RANDOM = new Random();

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(DATA.charAt(RANDOM.nextInt(DATA.length())));
        }

        return sb.toString();
    }
}