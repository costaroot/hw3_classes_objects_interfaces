package com.costaroot.car;

import com.costaroot.transport.Transport;

public class Car implements Transport {
    private final String carsModel;
    private double speed;
    private boolean isEngine;

    public Car(String carsModel) {
        this.carsModel = carsModel;
        this.isEngine = false;
        this.speed = 0;
    }

    public void startEngine() {
        System.out.println("Engine is started");
        isEngine = true;
    }

    public void stopEngine() {
        isEngine = false;
        speed = 0;
        System.out.println("Engine is stopped");
    }

    public void move(double speed) {
        if (isEngine) {
            this.speed = speed;
            System.out.println(carsModel + " is moving with speed " + speed);
        } else {
            System.out.println(carsModel + " can not start move! Engine is'n running");
        }
    }
}
