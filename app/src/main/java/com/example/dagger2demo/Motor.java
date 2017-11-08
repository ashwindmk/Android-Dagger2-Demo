package com.example.dagger2demo;

/**
 * Created by ashwin on 8/11/17.
 */

public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void rotate(int value) {
        rpm = rpm + value;
    }

    public void stop() {
        rpm = 0;
    }

}
