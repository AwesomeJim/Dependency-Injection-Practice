package com.jim.dagger2java.car;

import android.util.Log;

import com.jim.dagger2java.car.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.e(TAG, "Remote connected");
    }
}
