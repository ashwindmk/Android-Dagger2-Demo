package com.example.dagger2demo;

import javax.inject.Inject;

/**
 * Created by ashwin on 6/11/17.
 */

public class Engine {

    private Motor motor;

    @Inject
    public Engine(Motor motor) {
        this.motor = motor;
    }

    public int getRpm() {
        return motor.getRpm();
    }

    public void accelerate(int value) {
        motor.rotate(value);
    }

    public void brake() {
        motor.stop();
    }

}
