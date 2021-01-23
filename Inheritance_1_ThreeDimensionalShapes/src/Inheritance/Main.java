package Inheritance;

public class Main {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(30, 10);
        Cylinder cylinder = new Cylinder(5, 10);
        Ball ball = new Ball(5);
        Box box = new Box(1000);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
    }
}

