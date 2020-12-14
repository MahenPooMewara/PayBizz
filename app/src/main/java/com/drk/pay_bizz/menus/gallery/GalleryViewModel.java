package com.drk.pay_bizz.menus.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Mahendra Mewara.
 */
public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    /**
     * Constructor of GalleryViewModel
     */
    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}