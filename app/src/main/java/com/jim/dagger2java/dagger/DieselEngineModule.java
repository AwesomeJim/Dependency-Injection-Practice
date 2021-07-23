package com.jim.dagger2java.dagger;


import com.jim.dagger2java.car.DieselEngine;
import com.jim.dagger2java.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesEngine() {
        return new DieselEngine(horsePower);
    }
}
