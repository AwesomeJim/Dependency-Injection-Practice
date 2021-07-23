package com.jim.dagger2java.car;

import android.util.Log;

import com.jim.dagger2java.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    //File
    private Driver driver;
    private Engine engine;
    private Wheels wheels;


    /*
    Constructor injector
     */
    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
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
        Log.e(TAG, driver + " drives " + this);
    }
}
