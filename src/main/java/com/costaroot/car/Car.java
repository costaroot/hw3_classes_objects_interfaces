package com.costaroot.car;

import com.costaroot.transports.Transports;

public class Car implements Transports {
    private final String carsModel;
    private double speed;
    private boolean engineIsRun;

    public Car(String carsModel) {
        this.carsModel = carsModel;
        this.engineIsRun = false;
        this.speed = 0;
    }

    public void startEngine() {
        System.out.println("Engine is started");
        engineIsRun = true;
    }

    public void stopEngine() {
        engineIsRun = false;
        speed = 0;
        System.out.println("Engine is stopped");
    }

    public void move(double speed) {
        if (engineIsRun) {
            this.speed = speed;
            System.out.println(carsModel + " is moving with speed " + speed);
        } else {
            System.out.println(carsModel + " can not start move! Engine is'n running");
        }
    }
}
