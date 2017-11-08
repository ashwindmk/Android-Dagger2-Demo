package com.example.dagger2demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ashwin on 6/11/17.
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Engine(new Motor()));
    }

}
