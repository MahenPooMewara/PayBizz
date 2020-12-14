package com.drk.pay_bizz;

/*
 * Copyright Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;

//import com.clevertap.android.sdk.ActivityLifecycleCallback;
//import com.google.firebase.database.core.view.Event;

/**
 * Created by Mahendra Mewara.
 */
public class PayBizzApplication extends Application {
    public static final String TAG = PayBizzApplication.class
            .getSimpleName();

    private static PayBizzApplication mInstance;

    private static FirebaseAnalytics firebaseAnalytics;

    /**
     * onCreate of StoryApplication
     */
    @Override
    public void onCreate() {
        //ActivityLifecycleCallback.register(this);
        super.onCreate();
        /*if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);*/
        // Normal app init code...
        try {
            mInstance = this;
            FirebaseApp.initializeApp( this );
            firebaseAnalytics = FirebaseAnalytics.getInstance( this );

            /*AnalyticsTrackers.initialize( this );
            AnalyticsTrackers.getInstance().get( AnalyticsTrackers.Target.APP );*/

        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * getInstance of StoryApplication
     * @return
     */
    public static synchronized PayBizzApplication getInstance() {
        if (mInstance == null) {
            try {
                mInstance = (PayBizzApplication.class).newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mInstance;
    }

    /***
     * Tracking screen view of StoryApplication
     *
     * @param screen_name screen name to be displayed on GA dashboard
     */
    public void trackScreenView(final String screen_name, final String action,
                                final String category, final Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString( FirebaseAnalytics.Param.ITEM_CATEGORY, category );
        bundle.putString( FirebaseAnalytics.Param.ITEM_NAME, screen_name );

        //Logs an app event.
        firebaseAnalytics.logEvent( FirebaseAnalytics.Event.SELECT_CONTENT, bundle );

        sendEvent(firebaseAnalytics );

        Bundle bundle1 = new Bundle();
        bundle1.putString( "item_category", category );
        bundle1.putString( "item_name", screen_name );
        bundle1.putString( "item_action", action );

        firebaseAnalytics.setCurrentScreen( activity, screen_name, null);
        //Logs an app event.
        firebaseAnalytics.logEvent( "ks_screen_view", bundle1 );

        sendEvent(firebaseAnalytics );

        /*Tracker t = getGoogleAnalyticsTracker();

        // Set screen name.
        t.setScreenName( screen_name );

        // Send a screen view.
        t.send( new HitBuilders.ScreenViewBuilder().build() );

        // Get tracker.
        t = getGoogleAnalyticsTracker();
        // Build and send an Event.
        t.send( new HitBuilders.EventBuilder()
                .setCategory( category )
                .setAction( action )
                .setLabel( screen_name )
                .build() );

        try {
            GoogleAnalytics.getInstance( this ).dispatchLocalHits();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }

    /**
     * sendEvent of StoryApplication
     * @param firebaseAnalytics
     */
    private void sendEvent(FirebaseAnalytics firebaseAnalytics) {
        //Sets whether analytics collection is enabled for this app on this device.
        firebaseAnalytics.setAnalyticsCollectionEnabled( true );

        //Sets the minimum engagement time required before starting a session.
        // The default value is 10000 (10 seconds). Let's make it 20 seconds just for the fun
        //firebaseAnalytics.setMinimumSessionDuration(2000);

        //Sets the duration of inactivity that terminates the current session.
        // The default value is 1800000 (30 minutes).
        firebaseAnalytics.setSessionTimeoutDuration( 500 );
    }

    /***
     * Tracking screen view of StoryApplication
     *
     * @param action to be displayed on GA dashboard
     */
    public void trackCategoryView(final String action, final String category, final Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString( FirebaseAnalytics.Param.ITEM_CATEGORY, category );
        //bundle.putString( FirebaseAnalytics.Param.METHOD, action);

        //Logs an app event.
        firebaseAnalytics.logEvent( FirebaseAnalytics.Event.SELECT_CONTENT, bundle );
        //firebaseAnalytics.setCurrentScreen( activity, action, category);
        sendEvent( firebaseAnalytics );

        Bundle bundle1 = new Bundle();
        bundle1.putString( "item_category", category );
        bundle1.putString( "item_action", action );
        //bundle.putString( FirebaseAnalytics.Param.METHOD, action);

        //Logs an app event.
        firebaseAnalytics.logEvent( "category_view", bundle1 );
        firebaseAnalytics.setCurrentScreen( activity, category, null);
        sendEvent( firebaseAnalytics );

        // Get tracker.
        /*Tracker t = getGoogleAnalyticsTracker();
        // Build and send an Event.
        t.send( new HitBuilders.EventBuilder()
                .setCategory( category )
                .setAction( action )
                .build() );

        GoogleAnalytics.getInstance( this ).dispatchLocalHits();*/

    }

    /***
     * Tracking event of StoryApplication
     * @param category event category
     * @param action   action of the event
     * @param label    label
     */
    public void trackEvent(String category, String action, String label, Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString( FirebaseAnalytics.Param.ITEM_CATEGORY, category );
        //bundle.putString( FirebaseAnalytics.Param.METHOD, action);
        bundle.putString( FirebaseAnalytics.Param.ITEM_NAME, label );

        //Logs an app event.
        firebaseAnalytics.logEvent( FirebaseAnalytics.Event.SELECT_CONTENT, bundle );
        sendEvent( firebaseAnalytics );

        Bundle bundle1 = new Bundle();
        bundle1.putString( "item_category", category );
        bundle1.putString( "item_action", action);
        bundle1.putString( "item_label", label );

        //Logs an app event.
        firebaseAnalytics.logEvent( "ks_event", bundle1 );
        firebaseAnalytics.setCurrentScreen( activity, label, null);
        sendEvent( firebaseAnalytics );

        /*Tracker t = getGoogleAnalyticsTracker();

        // Build and send an Event.
        t.send( new HitBuilders.EventBuilder().setCategory( category ).setAction( action ).
                setLabel( label ).build() );*/

    }

    /**
     * trackEventNew of StoryApplication
     * @param category
     * @param action
     * @param label
     * @param activity
     */
    public void trackEventNew(String category, String action, String label, Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString( FirebaseAnalytics.Param.ITEM_CATEGORY, category );
        //bundle.putString( FirebaseAnalytics.Param.METHOD, action);
        bundle.putString( FirebaseAnalytics.Param.ITEM_NAME, label );

        //Logs an app event.
        firebaseAnalytics.logEvent( FirebaseAnalytics.Event.SELECT_CONTENT, bundle );
        sendEvent( firebaseAnalytics );

        Bundle bundle1 = new Bundle();
        bundle1.putString( "item_category", category );
        bundle1.putString( "item_action", action);
        bundle1.putString( "item_label", label );

        //Logs an app event.
        firebaseAnalytics.logEvent( "ks_event", bundle1 );
        firebaseAnalytics.setCurrentScreen( activity, category, null);
        sendEvent( firebaseAnalytics );
    }


    /**
     * attachBaseContext of StoryApplication
     * @param context
     */
    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext( context );
        //MultiDex.install( this );
    }

}