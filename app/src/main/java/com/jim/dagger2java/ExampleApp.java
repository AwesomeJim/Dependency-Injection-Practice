package com.jim.dagger2java;

import android.app.Application;

import com.jim.dagger2java.dagger.AppComponent;
import com.jim.dagger2java.dagger.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
