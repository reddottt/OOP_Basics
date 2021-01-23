package Inharitance;

public class Main {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(15, 10);
        Cylinder cylinder = new Cylinder(3, 3);
        Ball ball = new Ball(5);
        Box box = new Box(1000);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
    }
}
