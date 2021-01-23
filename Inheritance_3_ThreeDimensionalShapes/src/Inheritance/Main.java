package Inheritance;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(5,10);
        Cylinder cylinder = new Cylinder(5,5);
        Ball ball = new Ball(4);
        Box box = new Box(1000);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));

        System.out.println(box.getShapes());

        Collections.sort(box.getShapes());
        System.out.println(box.getShapes());

    }
}
