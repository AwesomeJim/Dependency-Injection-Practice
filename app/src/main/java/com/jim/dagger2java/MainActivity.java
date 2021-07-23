package com.jim.dagger2java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jim.dagger2java.car.Car;
import com.jim.dagger2java.dagger.ActivityComponent;
import com.jim.dagger2java.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(100)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();
        component.inject(this);
        car.drive();
    }
}