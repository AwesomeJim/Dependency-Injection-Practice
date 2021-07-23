package com.jim.dagger2java;

import android.app.Application;

import com.jim.dagger2java.dagger.AppComponent;
import com.jim.dagger2java.dagger.DaggerAppComponent;
import com.jim.dagger2java.dagger.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("Awesome Jim"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
