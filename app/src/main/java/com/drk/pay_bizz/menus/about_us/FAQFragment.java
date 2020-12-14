package com.drk.pay_bizz.menus.about_us;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.drk.pay_bizz.R;
import com.drk.pay_bizz.adapters.FAQItemAdapter;
import com.drk.pay_bizz.modals.FAQItemModal;
import com.drk.pay_bizz.util.AppConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahendra Mewara.
 */
public class FAQFragment extends Fragment {

    private List<Object> mFAQDataList;
    private FAQItemAdapter mFAQItemAdapter;

    /**
     * onCreateView of FAQFragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_faq, container, false);
        setFAQList(root);
        return root;
    }

    /**
     * setFAQList of FAQFragment
     * @param view
     */
    private void setFAQList(View view) {
        RecyclerView mFaqsList = (RecyclerView) view.findViewById( R.id.faq_list);
        mFAQDataList = new ArrayList<>();
        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq1).toString(),
                getResources().getString(R.string.faqa1).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq2).toString(),
                getResources().getString(R.string.faqa2).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq3).toString(),
                getResources().getString(R.string.faqa3).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq4).toString(),
                getResources().getString(R.string.faqa4).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq5).toString(),
                getResources().getString(R.string.faqa5).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq6).toString(),
                getResources().getString(R.string.faqa6).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq7).toString(),
                getResources().getString(R.string.faqa7).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq8).toString(),
                getResources().getString(R.string.faqa8).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq9).toString(),
                getResources().getString(R.string.faqa9).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq10).toString(),
                getResources().getString(R.string.faqa10).toString()));

        mFAQDataList.add(new FAQItemModal(
                getResources().getString(R.string.faq11).toString(),
                getResources().getString(R.string.faqa11).toString()));

        if (mFAQDataList != null) {
            if (mFAQDataList.size() > AppConstants.ONE) {
                mFaqsList.setVisibility( View.VISIBLE );
            }else{
                mFaqsList.setVisibility(View.GONE);
            }
            mFAQItemAdapter = new FAQItemAdapter(
                    mFAQDataList, getActivity(), new FAQItemAdapter.OnItemClickListener() {
                @Override
                public void setOnViewClickListner(TextView faqa, int position) {
                    if(faqa.getVisibility()== View.VISIBLE){
                        faqa.setVisibility(View.GONE);
                    }else{
                        faqa.setVisibility(View.VISIBLE);
                    }
                }
            });
            mFaqsList.setAdapter( mFAQItemAdapter );
        }
    }
}