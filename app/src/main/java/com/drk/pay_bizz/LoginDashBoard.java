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

import com.google.android.material.navigation.NavigationView;

/**
 * Created by Mahendra Mewara
 */
public class LoginDashBoard extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    /**
     * onCreate of LoginDashBoard
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //noinspection deprecation
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.login_home, R.id.nav_payu_gateway, R.id.nav_fund_req, R.id.nav_drk_gift_card,
                R.id.nav_aeps_acc_req, R.id.nav_uti_pan_coupon, R.id.nav_pay_lic,
                R.id.nav_electricity_bill,
                R.id.nav_money_transfer_new, R.id.nav_aeps, R.id.nav_income_tax_return,
                R.id.nav_drk_gift_rep, R.id.nav_money_transfer, R.id.nav_electricity_bill_report,
                R.id.nav_lic_report, R.id.nav_pan_card_report, R.id.nav_income_tax_report,
                R.id.nav_training, R.id.nav_video, R.id.nav_commission_sheet, R.id.nav_submit_tkt)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this,
                R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController,
                mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
    }

    /**
     * onCreateOptionsMenu of LoginDashBoard
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * onSupportNavigateUp of LoginDashBoard
     * @return
     */
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this,
                R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


}