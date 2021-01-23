package Inharitance;

import java.util.ArrayList;

public abstract class Shape {
    public abstract double getVolume();
}

abstract class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        System.out.println("Pyramid volume: " + getVolume());
    }

    @Override
    public double getVolume() {
        return h * s * 4 / 3;
    }
}

class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        System.out.println("Cylinder volume: " + getVolume());
    }

    @Override
    public double getVolume() {
        return height * Math.PI * Math.pow(getRadius(), 2);
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
        System.out.println("Ball volume: " + getVolume());
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(getRadius(), 3);
    }
}

class Box extends Shape {
    private double capacity;
    private ArrayList<Shape> shapesContainer = new ArrayList<>();

    public Box(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getVolume() {
        return capacity;
    }

    public boolean add(Shape shape) {
        if (capacity > shape.getVolume()) {
            shapesContainer.add(shape);
            capacity -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
