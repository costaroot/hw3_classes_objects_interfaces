package com.costaroot;

import com.costaroot.car.Car;
import com.costaroot.circle.Circle;
import com.costaroot.objectcounter.ObjectCounter;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Circle crl = new Circle(rand.nextInt(15) + 1);
        System.out.println("Area Circle = " + crl.areaOfCircle() + " Radius = " + crl.getRadiusCircle());
        for (int i = 0; i < rand.nextInt(50); i++) {
            new ObjectCounter();
        }
        System.out.println("Amount of created objects = " + ObjectCounter.getObjCount());
        Car car = new Car("Tesla");
        car.move(50);
        car.startEngine();
        car.move(50);
        car.stopEngine();
    }
}
