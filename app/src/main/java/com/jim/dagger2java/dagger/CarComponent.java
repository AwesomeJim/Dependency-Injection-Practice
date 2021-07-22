package com.jim.dagger2java.dagger;

import com.jim.dagger2java.MainActivity;
import com.jim.dagger2java.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
