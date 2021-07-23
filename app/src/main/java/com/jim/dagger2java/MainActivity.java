package com.jim.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jim.dagger2java.car.Car;
import com.jim.dagger2java.dagger.CarComponent;
import com.jim.dagger2java.dagger.DaggerCarComponent;
import com.jim.dagger2java.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(100)).build();
        component.inject(this);
        car.drive();
    }
}