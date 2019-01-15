package com.example.wangtsung.mvvmpractice;

import android.databinding.ObservableField;

public class MainViewModel {

    public final ObservableField<String> mData = new ObservableField<String>();
    public final ObservableField<Boolean> isLoading = new ObservableField<Boolean>();

    private DataModel dataModel = new DataModel();

    public void refresh(){

        isLoading.set(true);

        dataModel.retrieveData(new DataModel.onDataReadyCallback() {
            @Override
            public void onDataReady(String Data) {
                mData.set(Data);
                isLoading.set(false);
            }
        });
    }
}
