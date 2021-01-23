package Inheritance;

import java.util.ArrayList;

public class Shape {

    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super(h * s * 4 / 3);
        this.s = s;
        this.h = h;
        System.out.println("Pyramid volume: " + this.getVolume());
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(height * Math.PI * Math.pow(radius, 2), radius);
        this.height = height;
        System.out.println("Cylinder volume: " + this.getVolume());
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(4 / 3 * Math.PI * Math.pow(radius, 3), radius);
        System.out.println("Ball volume: " + this.getVolume());
    }
}

class Box extends Shape {

    private double capacity;
    private ArrayList<Shape> shapesContainer = new ArrayList<>();

    public Box(double capacity) {
        super(capacity);
        this.capacity = capacity;
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
