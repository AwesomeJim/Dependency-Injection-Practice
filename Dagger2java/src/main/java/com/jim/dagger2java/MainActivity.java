package com.jim.dagger2java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jim.dagger2java.car.Car;
import com.jim.dagger2java.dagger.ActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*
       //Works with the Builder
       ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentBuilder()
                .horsePower(100)
                .engineCapacity(1400)
                .build();*/
      /*  ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));*/
        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(123, 1600);
        component.inject(this);
        car.drive();
    }
}