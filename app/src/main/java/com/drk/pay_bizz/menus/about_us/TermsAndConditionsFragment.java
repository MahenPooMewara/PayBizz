package com.drk.pay_bizz.menus.about_us;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
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
import com.drk.pay_bizz.util.FontManager;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

/**
 * Created by Mahendra Mewara.
 */
public class TermsAndConditionsFragment extends Fragment {


    /**
     * onCreateView of TermsAndConditionsFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @SuppressLint("WrongConstant")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tc, container, false);
        FontManager fontManager = FontManager.getInstance(getContext());
        final TextView tc_title = root.findViewById(R.id.tc_title);
        tc_title.setTypeface(fontManager.getMediumFont());
        final TextView tc_desc = root.findViewById(R.id.tc_desc);
        tc_desc.setTypeface(fontManager.getRegularFont());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            tc_desc.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }
        //tc_desc.setText(Html.fromHtml(getResources().getString(R.string.tm_cond_str)));
        return root;
    }
}