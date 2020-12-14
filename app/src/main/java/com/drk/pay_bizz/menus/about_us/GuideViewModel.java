package com.drk.pay_bizz.menus.about_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/**
 * Created by Mahendra Mewara.
 */
public class GuideViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    /**
     * Constructor of GuideViewModel
     */
    public GuideViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}