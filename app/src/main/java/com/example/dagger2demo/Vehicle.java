package com.example.dagger2demo;

import javax.inject.Inject;

/**
 * Created by ashwin on 6/11/17.
 */

public class Vehicle {

    private Engine engine;

    @Inject
    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void increaseSpeed(int value) {
        engine.accelerate(value);
    }

    public void stop() {
        engine.brake();
    }

    public int getSpeed() {
        return engine.getRpm();
    }

}
