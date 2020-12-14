package com.drk.pay_bizz.menus.paybizz_services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.adapters.PartnerItemAdapter;
import com.drk.pay_bizz.adapters.ServiceDescItemAdapter;
import com.drk.pay_bizz.menus.gallery.GalleryViewModel;
import com.drk.pay_bizz.modals.ServiceDescItemModal;
import com.drk.pay_bizz.modals.ServiceModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class ServicesFragment extends Fragment {


    private List<Object> mServiceDescItemDataList;
    private ServiceDescItemAdapter mServiceDescItemAdapter;

    /**
     * onCreateView of ServicesFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_service, container, false);
        setServicesDescRV(root);
        return root;
    }

    /**
     * setServicesDescRV of ServicesFragment
     * @param view
     */
    private void setServicesDescRV(View view) {
        RecyclerView mServiceItemList = (RecyclerView) view.findViewById( R.id.service_item_rv);
        mServiceItemList.isHorizontalFadingEdgeEnabled();
        mServiceDescItemDataList = new ArrayList<>();
        mServiceDescItemDataList.add(new ServiceDescItemModal(
                getResources().getString(R.string.pan_center).toString(),
                getResources().getString(R.string.pan_center_str).toString(),
                R.drawable.pan_rect));
        mServiceDescItemDataList.add(new ServiceDescItemModal(
                getResources().getString(R.string.aeps_adhar_pay).toString(),
                getResources().getString(R.string.aeps_adhar_pay_str).toString(),
                R.drawable.aeps_rect));
        mServiceDescItemDataList.add(new ServiceDescItemModal(
                getResources().getString(R.string.lic_premium_pt).toString(),
                getResources().getString(R.string.lic_premium_pt_str).toString(),
                R.drawable.lic_rect));
        mServiceDescItemDataList.add(new ServiceDescItemModal(
                getResources().getString(R.string.money_transfer_).toString(),
                getResources().getString(R.string.money_transfer_str).toString(),
                R.drawable.money_transfer_rect));
        mServiceDescItemDataList.add(new ServiceDescItemModal(
                getResources().getString(R.string.e_bill_pay_service).toString(),
                getResources().getString(R.string.e_bill_pay_service_str).toString(),
                R.drawable.electricity_bill_rect));
        mServiceDescItemDataList.add(new ServiceDescItemModal(
                getResources().getString(R.string.itr_service).toString(),
                getResources().getString(R.string.itr_service_str).toString(),
                R.drawable.itr_rect));

        if (mServiceDescItemDataList != null) {
            if (mServiceDescItemDataList.size() > AppConstants.ONE) {
                mServiceItemList.setVisibility( View.VISIBLE );
            }else{
                mServiceItemList.setVisibility(View.GONE);
            }
            mServiceDescItemAdapter = new ServiceDescItemAdapter(
                    mServiceDescItemDataList, getActivity() );
            mServiceItemList.setAdapter( mServiceDescItemAdapter );

        }

    }
}