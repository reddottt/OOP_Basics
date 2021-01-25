package Intarfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = scanner.nextDouble();

        System.out.println("temperature in celsius: " + new CelsiusConverter().convertTemperature(temperature));
        System.out.println("temperature in kelvin: " + new KelvinConverter().convertTemperature(temperature));
        System.out.println("temperature in fahrenheit: " + new FahrenheitConverter().convertTemperature(temperature));
    }
}
