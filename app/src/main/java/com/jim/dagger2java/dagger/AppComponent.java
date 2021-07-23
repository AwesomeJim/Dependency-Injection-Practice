package com.jim.dagger2java.dagger;

import com.jim.dagger2java.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

   //generated as inner class
   //ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
   ActivityComponent.Factory getActivityComponentFactory();


   @Component.Factory
   interface Factory {
      AppComponent create(DriverModule driverModule);
   }
}
