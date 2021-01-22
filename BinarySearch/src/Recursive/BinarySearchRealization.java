package Recursive;

public class BinarySearchRealization {

    public double[] generateArray(int length){
        double[] array = new double[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public int simpleFinder(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private int binarySearchRecursively(double[] sortedArray, double key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            return binarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }

    public int binarySearchRecursively(double[] sortedArray, double key) {
        return binarySearchRecursively(sortedArray, key, 0, sortedArray.length);
    }

}
