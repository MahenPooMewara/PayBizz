package com.drk.pay_bizz.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Mahendra Mewara.
 * This singleton class has methods to create different types of fonts from the ttf files regular
 * font, medium font, bold fonts are supported
 */
public class FontManager extends AppConstants {

    private static FontManager sFontManager;
    @SuppressLint("StaticFieldLeak")
    private Context mAppContext = null;
    private Typeface mRegularTypeface = null;
    private Typeface mMediumTypeface = null;

    private FontManager(Context context) {
        mAppContext = context.getApplicationContext();
    }

    /**
     * getInstance of FontManager
     * @param context
     * @return
     */
    public static FontManager getInstance(Context context) {
        if (sFontManager == null) {
            synchronized (FontManager.class) {
                if (sFontManager == null) {
                    sFontManager = new FontManager(context);
                }
            }
        }
        return sFontManager;
    }

    /**
     * getRegularFont of FontManager
     * @return
     */
    public Typeface getRegularFont() {
        if (mRegularTypeface == null) {
            mRegularTypeface = Typeface.createFromAsset(mAppContext.getAssets(),
                    REGULAR_FONT_FILE_PATH);
        }
        return mRegularTypeface;
    }

    /**
     * getMediumFont of FontManager
     * @return
     */
    public Typeface getMediumFont() {
        if (mMediumTypeface == null) {
            mMediumTypeface = Typeface.createFromAsset(mAppContext.getAssets(),
                    MEDIUM_FONT_FILE_PATH);
        }
        return mMediumTypeface;
    }

}
