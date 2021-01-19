package com.example.insideindia.ui.assembley;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AssembleyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AssembleyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Assembley fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}