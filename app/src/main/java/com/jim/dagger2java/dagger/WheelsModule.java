package com.jim.dagger2java.dagger;


import com.jim.dagger2java.car.Rims;
import com.jim.dagger2java.car.Tires;
import com.jim.dagger2java.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return  new Wheels(rims, tires);
    }
}
