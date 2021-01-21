package Dispatcher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomFromArray randomFromArray = new RandomFromArray(new int[]{1, 2, 3}, new int[]{1, 2, 10});
        randomFromArray.findingAmount();
        randomFromArray.fillingRangesArray();
        System.out.println(Arrays.toString(randomFromArray.getValuesArray()));
        System.out.println("Value from range: " + randomFromArray.getRandom());

    }
}

