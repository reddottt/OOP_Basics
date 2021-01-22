package Recursive;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BinarySearchRealization binarySearchRealization = new BinarySearchRealization();
        double[] array = binarySearchRealization.generateArray(100000000);
        Arrays.sort(array);  // !!!!!!!!!

        long startTime = System.currentTimeMillis();
        binarySearchRealization.simpleFinder(array, 0.5);
        long endTime = System.currentTimeMillis();
        System.out.println("SimpleFinder execution time " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        binarySearchRealization.binarySearchRecursively(array, 0.5);
        endTime = System.currentTimeMillis();
        System.out.println("binarySearchRecursively execution time " + (endTime - startTime) + " ms");

    }
}
