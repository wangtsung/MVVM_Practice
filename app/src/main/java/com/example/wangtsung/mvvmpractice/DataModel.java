package com.example.wangtsung.mvvmpractice;

import android.os.Handler;

public class DataModel {

    interface onDataReadyCallback{
        void onDataReady(String Data);
    }

    public void retrieveData(final onDataReadyCallback callback){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onDataReady("New Data");
            }
        },1500);
    }

}
