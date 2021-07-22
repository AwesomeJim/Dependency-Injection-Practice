package com.jim.dagger2java.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";


    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.e(TAG, "Diesel engine started");
    }
}
