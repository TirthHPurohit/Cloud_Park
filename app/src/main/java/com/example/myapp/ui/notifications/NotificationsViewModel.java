package com.example.myapp.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    public final MutableLiveData<String> mText;

    public NotificationsViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}
