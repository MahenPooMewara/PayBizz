package com.drk.pay_bizz.menus.master;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.menus.gallery.GalleryViewModel;
import com.google.android.material.textfield.TextInputEditText;

/**
 * Created by Mahendra Mewara.
 */
public class PayUGatewayFragment extends Fragment {


    /**
     * onCreateView of PayUGatewayFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_payu_gateway, container, false);

        initRegesteredID(root);
        return root;
    }

    /**
     * initRegesteredID of PayUGatewayFragment
     * @param view
     */
    private void initRegesteredID(View view) {
        TextInputEditText amt = view.findViewById(R.id.amount);
        amt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                amt.setText("+91"+editable.toString());
            }
        });
        //afterTextChanged(amt.getEditableText());
    }

    /**
     * afterTextChanged of PayUGatewayFragment
     * @param s
     */
    public void afterTextChanged(Editable s) {
        if(!s.toString().startsWith("+91")){
            s.insert(0, "+91");
        }
    }
}