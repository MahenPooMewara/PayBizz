package com.drk.pay_bizz.menus.home;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.adapters.AgentItemAdapter;
import com.drk.pay_bizz.adapters.PBFeaturesItemAdapter;
import com.drk.pay_bizz.adapters.PartnerItemAdapter;
import com.drk.pay_bizz.adapters.ServiceDescItemAdapter;
import com.drk.pay_bizz.adapters.ServicesItemAdapter;
import com.drk.pay_bizz.adapters.WorkItemAdapter;
import com.drk.pay_bizz.modals.AgentDetailsModal;
import com.drk.pay_bizz.modals.OurPartnersModal;
import com.drk.pay_bizz.modals.PBFeaturesModal;
import com.drk.pay_bizz.modals.ServiceDescItemModal;
import com.drk.pay_bizz.modals.ServiceModal;
import com.drk.pay_bizz.modals.WorkItemModal;
import com.drk.pay_bizz.util.AppConstants;
import com.drk.pay_bizz.util.PayBizzAppAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class LoginHomeFragment extends Fragment {
    private ServicesItemAdapter mServicesItemAdapter;
    private List<Object> mServiceItemDataList;
    private List<Object> mPBFeaturesItemDataList;
    private List<Object> mPBWorkItemDataList;
    private WorkItemAdapter mWorkItemAdapter;
    private List<Object> mPBOurPartnerDataList;
    private PartnerItemAdapter mPartnerItemAdapter;
    private List<Object> mPBAgentDataList;
    private AgentItemAdapter mAgentItemAdapter;
    private PBFeaturesItemAdapter mPBFeaturesItemAdapter;

    /**
     * onCreateView of LoginHomeFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        TextView new_offer = root.findViewById(R.id.new_offer);

        // set the text
        SpannableString s1 = new SpannableString(getResources().getString(R.string.new_offer));
        SpannableString s2 = new SpannableString("  " +
                getResources().getString(R.string.new_offer_str));
        // set the style
        int flag = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
        s1.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s1.length(), flag);
        s1.setSpan(new BackgroundColorSpan(getResources().getColor(R.color.pb_offer_bg)),
                0, s1.length(), flag);
        s2.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s2.length(), flag);

        // build the string
        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append(s1);
        builder.append(s2);


        // set the text view with the styled text
        new_offer.setText(builder);
        // enables clicking on spans for clickable span and url span
        /*new_offer.setMovementMethod(LinkMovementMethod.getInstance());
        new_offer.setMovementMethod(new ScrollingMovementMethod());*/

        new_offer.setSelected(true);

        TextView welcome_str_tv = root.findViewById(R.id.welcome_str_tv);

        // set the text
        SpannableString welcome_str_tv_s1 = new SpannableString(getResources().getString(
                R.string.welcome_str));
        SpannableString welcome_str_tv_s2 = new SpannableString( "  "+
                getResources().getString(R.string.digital_place));
        // set the style
        welcome_str_tv_s1.setSpan(new ForegroundColorSpan(Color.WHITE), 0,
                welcome_str_tv_s1.length(), flag);
        welcome_str_tv_s2.setSpan(new ForegroundColorSpan(getResources().getColor(
                R.color.pay_bizz_green)), 0, welcome_str_tv_s2.length(), flag);

        // build the string
        SpannableStringBuilder welcome_str_builder = new SpannableStringBuilder();
        welcome_str_builder.append(welcome_str_tv_s1);
        welcome_str_builder.append(welcome_str_tv_s2);

        welcome_str_tv.setText(welcome_str_builder);
        welcome_str_tv.setSelected(AppConstants.BOOLEAN_TRUE);

        TextView become_biz_tv = root.findViewById(R.id.become_biz_tv);
        become_biz_tv.setSelected(AppConstants.BOOLEAN_TRUE);

        TextView paybizz_portal_tv = root.findViewById(R.id.paybizz_portal_tv);
        paybizz_portal_tv.setSelected(AppConstants.BOOLEAN_TRUE);

        PayBizzAppAPI.hideKeyboard(getActivity());
        return root;
    }



}