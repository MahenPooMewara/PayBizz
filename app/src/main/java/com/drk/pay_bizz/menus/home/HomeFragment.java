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
import com.drk.pay_bizz.adapters.ServicesItemAdapter;
import com.drk.pay_bizz.adapters.WorkItemAdapter;
import com.drk.pay_bizz.modals.AgentDetailsModal;
import com.drk.pay_bizz.modals.OurPartnersModal;
import com.drk.pay_bizz.modals.PBFeaturesModal;
import com.drk.pay_bizz.modals.ServiceModal;
import com.drk.pay_bizz.modals.WorkItemModal;
import com.drk.pay_bizz.util.AppConstants;
import com.drk.pay_bizz.util.PayBizzAppAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class HomeFragment extends Fragment {
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
     * onCreateView of HomeFragment
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

        setSevicesRecyclerView(root);

        setFeaturesRecyclerView(root);

        setHowDoesWorkRV(root);

        setOurPartnerRV(root);

        setAgentSayRV(root);

        PayBizzAppAPI.hideKeyboard(getActivity());
        return root;
    }

    /**
     * setAgentSayRV of HomeFragment
     * @param view
     */
    private void setAgentSayRV(View view) {
        RecyclerView mFeaturesList = (RecyclerView) view.findViewById( R.id.pb_agent_say_rv);
        mPBAgentDataList = new ArrayList<>();
        mPBAgentDataList.add(new AgentDetailsModal(
                R.drawable.pb_profile_1,
                getResources().getString(R.string.surendra).toString(),
                getResources().getString(R.string.surendra_desc).toString()));

        mPBAgentDataList.add(new AgentDetailsModal(
                R.drawable.rajaram,
                getResources().getString(R.string.raja_ram).toString(),
                getResources().getString(R.string.raja_ram_desc).toString()));

        mPBAgentDataList.add(new AgentDetailsModal(
                R.drawable.pb_profile_3,
                getResources().getString(R.string.naresh_choudhary).toString(),
                getResources().getString(R.string.naresh_choudhary_desc).toString()));

        mPBAgentDataList.add(new AgentDetailsModal(
                R.drawable.pb_profile_5,
                getResources().getString(R.string.mukesh).toString(),
                getResources().getString(R.string.mukesh_desc).toString()));

        mPBAgentDataList.add(new AgentDetailsModal(
                R.drawable.jitendra,
                getResources().getString(R.string.jitendra).toString(),
                getResources().getString(R.string.jitendra_desc).toString()));

        if (mPBAgentDataList != null) {
            if (mPBAgentDataList.size() > AppConstants.ONE) {
                mFeaturesList.setVisibility( View.VISIBLE );
            }else{
                mFeaturesList.setVisibility(View.GONE);
            }
            mAgentItemAdapter = new AgentItemAdapter(
                    mPBAgentDataList, getActivity() );
            mFeaturesList.setAdapter( mAgentItemAdapter );
        }

    }

    /**
     * setOurPartnerRV of HomeFragment
     * @param view
     */
    private void setOurPartnerRV(View view) {
        RecyclerView mFeaturesList = (RecyclerView) view.findViewById( R.id.pb_our_partner_rv);
        mPBOurPartnerDataList = new ArrayList<>();
        mPBOurPartnerDataList.add(new OurPartnersModal(
                R.drawable.icici_partner));
        mPBOurPartnerDataList.add(new OurPartnersModal(
                R.drawable.nsdl_partner));
        mPBOurPartnerDataList.add(new OurPartnersModal(
                R.drawable.payu_partner));
        mPBOurPartnerDataList.add(new OurPartnersModal(
                R.drawable.tax_consult_partner));
        mPBOurPartnerDataList.add(new OurPartnersModal(
                R.drawable.yes_bank_partner));
        mPBOurPartnerDataList.add(new OurPartnersModal(
                R.drawable.airtel_payment_partner));

        if (mPBOurPartnerDataList != null) {
            if (mPBOurPartnerDataList.size() > AppConstants.ONE) {
                mFeaturesList.setVisibility( View.VISIBLE );
            }else{
                mFeaturesList.setVisibility(View.GONE);
            }
            mPartnerItemAdapter = new PartnerItemAdapter(
                    mPBOurPartnerDataList, getActivity() );
            mFeaturesList.setAdapter( mPartnerItemAdapter );

        }
    }

    /**
     * setHowDoesWorkRV of HomeFragment
     * @param view
     */
    private void setHowDoesWorkRV(View view) {
        RecyclerView mFeaturesList = (RecyclerView) view.findViewById( R.id.pb_work_rv);
        mPBWorkItemDataList = new ArrayList<>();
        mPBWorkItemDataList.add(new WorkItemModal(
                getResources().getString(R.string.create_an_account).toString(),
                R.drawable.pay_bizz_logo));

        mPBWorkItemDataList.add(new WorkItemModal(
                getResources().getString(R.string.instant_start).toString(),
                R.drawable.pay_bizz_logo));

        mPBWorkItemDataList.add(new WorkItemModal(
                getResources().getString(R.string.done).toString(),
                R.drawable.pay_bizz_logo));

        if (mPBWorkItemDataList != null) {
            if (mPBWorkItemDataList.size() > AppConstants.ONE) {
                mFeaturesList.setVisibility( View.VISIBLE );
            }else{
                mFeaturesList.setVisibility(View.GONE);
            }
            mWorkItemAdapter = new WorkItemAdapter(
                    mPBWorkItemDataList, getActivity() );
            mFeaturesList.setAdapter( mWorkItemAdapter );

        }

    }

    /**
     * setFeaturesRecyclerView of HomeFragment
     * @param view
     */
    private void setFeaturesRecyclerView(View view) {
        RecyclerView mFeaturesList = (RecyclerView) view.findViewById( R.id.pb_features_why_choose);
        mFeaturesList.isHorizontalFadingEdgeEnabled();
        mPBFeaturesItemDataList = new ArrayList<>();
        mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.low_cost).toString(),
                getResources().getString(R.string.get_your_recharge).toString(),
                R.drawable.leaf));
        mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.fast).toString(),
                getResources().getString(R.string.fast_str).toString(),
                R.drawable.monitor));
        mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.clean_ui).toString(),
                getResources().getString(R.string.clean_ui_str).toString(),
                R.drawable.color_pallet));
        mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.trust_pay).toString(),
                getResources().getString(R.string.trust_pay_str).toString(),
                R.drawable.smile));

        mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.secure_payments).toString(),
                getResources().getString(R.string.secure_payments_str).toString(),
                R.drawable.pencil_alt));

        mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.support).toString(),
                getResources().getString(R.string.support_str).toString(),
                R.drawable.smile));



       /* mPBFeaturesItemDataList.add(new PBFeaturesModal(
                getResources().getString(R.string.support).toString(),
                getResources().getString(R.string.support_str).toString(),
                R.drawable.ic_headphone_));*/


        if (mPBFeaturesItemDataList != null) {
            if (mPBFeaturesItemDataList.size() > AppConstants.ONE) {
                mFeaturesList.setVisibility( View.VISIBLE );
            }else{
                mFeaturesList.setVisibility(View.GONE);
            }
            mPBFeaturesItemAdapter = new PBFeaturesItemAdapter(
                    mPBFeaturesItemDataList, getActivity() );
            mFeaturesList.setAdapter( mPBFeaturesItemAdapter );
        }
    }

    /**
     * setSevicesRecyclerView of HomeFragment
     * @param view
     */
    private void setSevicesRecyclerView(View view) {
        RecyclerView mCategoryList = (RecyclerView) view.findViewById( R.id.service_list);
        mCategoryList.isHorizontalFadingEdgeEnabled();
        mServiceItemDataList = new ArrayList<>();
        mServiceItemDataList.add(new ServiceModal(
                getResources().getString(R.string.pan_service).toString(),
                R.drawable.pan_circle));
        mServiceItemDataList.add(new ServiceModal(
                getResources().getString(R.string.lic).toString(),
                R.drawable.lic_circle));
        mServiceItemDataList.add(new ServiceModal(
                getResources().getString(R.string.aeps).toString(), R.drawable.aeps_circle));
        mServiceItemDataList.add(new ServiceModal(
                getResources().getString(R.string.money_transfer).toString(),
                R.drawable.money_transfer_circle));
        mServiceItemDataList.add(new ServiceModal(
                getResources().getString(R.string.electricity_bill).toString(),
                R.drawable.electricity_bill_circle));
        mServiceItemDataList.add(new ServiceModal(
                getResources().getString(R.string.itr_service).toString(),
                R.drawable.itr_circle));


        if (mServiceItemDataList != null) {
            if (mServiceItemDataList.size() > AppConstants.ONE) {
                mCategoryList.setVisibility( View.VISIBLE );
            }
            mServicesItemAdapter = new ServicesItemAdapter(
                    mServiceItemDataList, getActivity() );
            mCategoryList.setAdapter( mServicesItemAdapter );

        }
    }

}