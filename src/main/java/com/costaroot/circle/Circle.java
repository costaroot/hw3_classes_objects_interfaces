package com.costaroot.circle;

public class Circle {

    private double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double getRadiusCircle() {
        return radiusCircle;
    }

    public void setRadiusCircle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double areaOfCircle() {
        return Math.PI * Math.pow(radiusCircle, 2);
    }
}
