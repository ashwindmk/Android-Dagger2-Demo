package com.example.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ashwin on 6/11/17.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
