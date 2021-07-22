package com.jim.dagger2java.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    //File
    private Engine engine;
    private Wheels wheels;

    /*
    Constructor injector
     */
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    //Method Injection
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    public void drive(){
        engine.start();
        Log.e(TAG, "drive: started=============" );
    }
}
