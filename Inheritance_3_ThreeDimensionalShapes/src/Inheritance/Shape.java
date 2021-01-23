package Inheritance;

import java.util.ArrayList;

public interface Shape extends Comparable {
    double getVolume();

    @Override
    default int compareTo(Object object) {
        return Double.compare(getVolume(), ((Shape)object).getVolume()); // return 0 if d1 == d2, return less the 0 if d1 < d2,
        // return greater then 0 if d1 > d2
    }


}

abstract class SolidOfRevolution implements Shape{
    private double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}

class Pyramid implements Shape {
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

    @Override
    public String toString() {
        return "Pyramid{"  + getVolume() + "}";
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

    @Override
    public String toString() {
        return "Cylinder{"  + getVolume() + "}";
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

    @Override
    public String toString() {
        return "Ball{"  + getVolume() + "}";
    }
}

class Box implements Shape{
    private double capacity;
    private ArrayList<Shape> shapesContainer = new ArrayList<>();


    public Box(double capacity) {
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

    @Override
    public double getVolume() {
        return this.capacity;
    }

    public ArrayList<Shape> getShapes() {
        return this.shapesContainer;
    }

}


