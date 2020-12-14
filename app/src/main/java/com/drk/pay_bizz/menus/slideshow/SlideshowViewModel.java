package com.drk.pay_bizz.menus.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Mahendra Mewara.
 */
public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    /**
     * Constructor of SlideshowViewModel
     */
    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    /**
     * LiveData of SlideshowViewModel
     * @return
     */
    public LiveData<String> getText() {
        return mText;
    }
}