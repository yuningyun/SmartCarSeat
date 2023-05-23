package com.example.smartcarseat.ui.voice;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VoiceViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VoiceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is voice fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}