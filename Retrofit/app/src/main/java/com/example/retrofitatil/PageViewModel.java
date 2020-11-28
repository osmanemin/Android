package com.example.retrofitatil;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

public class PageViewModel extends ViewModel {

    private MutableLiveData<String> liveData = new MutableLiveData<>();

    public MutableLiveData<String> getLiveData() {
        return liveData;
    }

    public void setLiveData(MutableLiveData<String> liveData) {
        this.liveData = liveData;
    }

    


}
