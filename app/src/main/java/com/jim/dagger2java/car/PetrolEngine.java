package com.jim.dagger2java.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
    }


    @Override
    public void start() {
        Log.e(TAG, "PetrolEngine started: ");
    }
}
