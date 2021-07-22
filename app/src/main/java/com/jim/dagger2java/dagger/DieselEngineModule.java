package com.jim.dagger2java.dagger;


import com.jim.dagger2java.car.DieselEngine;
import com.jim.dagger2java.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

@Binds
   abstract Engine bindsDieselEngine(DieselEngine engine);
}
