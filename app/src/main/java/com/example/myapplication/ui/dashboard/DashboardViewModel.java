package com.example.myapplication.ui.dashboard;

import android.widget.CalendarView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;


    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashhhhjjhjhhjjhjhjhboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}