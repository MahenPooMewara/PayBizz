package com.drk.pay_bizz.menus.about_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Mahendra Mewara.
 */
public class CompanyProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    /**
     * Constructor of CompanyProfileViewModel
     */
    public CompanyProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}