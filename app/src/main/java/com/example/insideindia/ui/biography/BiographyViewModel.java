package com.example.insideindia.ui.biography;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BiographyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BiographyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is biography fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}