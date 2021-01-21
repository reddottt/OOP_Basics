package Dispatcher;

public class RandomFromArray {
    private int[] valuesArray;
    private int[] weightsArray;
    private int[] rangesArray;
    private int amount;

    public int[] getValuesArray() {
        return valuesArray;
    }

    public int getAmount() {
        return amount;
    }

    public RandomFromArray(int[] valuesArray, int[] weightArray) {
        this.valuesArray = valuesArray;
        this.weightsArray = weightArray;
        rangesArray = new int[valuesArray.length];
        this.amount = 0;
    }

    public void findingAmount(){
        for (int weight : this.weightsArray) {
            this.amount += weight;
        }
    }

    public void fillingRangesArray(){
        int tempAmount = 0;
        for (int i = 0; i < this.rangesArray.length; i++) {
            rangesArray[i] = tempAmount;
            tempAmount += weightsArray[i];
        }
    }

    public int getRandom(){
        int random = (int) (Math.random() * this.amount);
        int rangeIndex = 0;

        for (int i = 0; i < rangesArray.length; i++) {
            if (rangesArray[i] > random) {
                break;
            }
            rangeIndex = i;
        }
        return this.valuesArray[rangeIndex];
    }



}
