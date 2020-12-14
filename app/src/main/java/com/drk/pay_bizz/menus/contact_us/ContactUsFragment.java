package com.drk.pay_bizz.menus.contact_us;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.util.PayBizzAppAPI;

/**
 * Created by Mahendra Mewara.
 */
public class ContactUsFragment extends Fragment {

    /**
     * onCreateView of ContactUsFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_contact_us, container, false);

        PayBizzAppAPI.hideKeyboard(getActivity());
        return root;
    }
}