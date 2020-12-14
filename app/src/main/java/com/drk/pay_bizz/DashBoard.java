package com.drk.pay_bizz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.drk.pay_bizz.util.ArrayListConstants;
import com.google.android.material.navigation.NavigationView;

/**
 * Created by Mahendra Mewara
 */
public class DashBoard extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    /**
     * onCreate of DashBoard
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //noinspection deprecation
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_services, R.id.about, R.id.company_profile,
                R.id.terms_and_conditions, R.id.faq, R.id.guide, R.id.nav_contact_us,
                R.id.login, R.id.forget_password, R.id.register)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this,
                R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();

        handleIntent(getIntent());
    }

    /**
     * onNewIntent of DashBoard
     * @param intent
     */
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    /**
     * handleIntent of DashBoard
     * @param intent
     */
    private void handleIntent(Intent intent) {
        String appLinkAction = intent.getAction();
        Uri appLinkData = intent.getData();
        if (Intent.ACTION_VIEW.equals(appLinkAction) && appLinkData != null){
            String referal_id = appLinkData.getLastPathSegment();
            String array1[]= referal_id.split("=");
            for (String temp: array1){
                System.out.println(temp);
            }
            if( !referal_id.equalsIgnoreCase(ArrayListConstants.EMPTY_STR)){
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY", array1[1]);
                    Navigation.findNavController(this, R.id.nav_host_fragment).
                            navigate(R.id.register, bundle);
                }catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * onCreateOptionsMenu of DashBoard
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * onSupportNavigateUp of DashBoard
     * @return
     */
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


}