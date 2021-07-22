package com.jim.dagger2java.dagger;

import com.jim.dagger2java.car.Engine;
import com.jim.dagger2java.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
