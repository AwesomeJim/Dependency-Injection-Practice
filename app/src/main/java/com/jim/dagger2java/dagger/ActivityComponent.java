package com.jim.dagger2java.dagger;

import com.jim.dagger2java.MainActivity;
import com.jim.dagger2java.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent( modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);


   /* @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();

    }*/
}
