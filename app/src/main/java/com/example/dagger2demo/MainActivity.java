package com.example.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int speed = 10;
    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView speedTextView = (TextView) findViewById(R.id.textView);

        /*
        Vehicle requires an engine object and the engine requires motor object
        All these dependent objects creation is done by dagger by calling this single line of code
         */
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        speed += 10;
        vehicle.increaseSpeed(speed);

        speedTextView.setText("vehicle speed: " + vehicle.getSpeed());
    }

}
