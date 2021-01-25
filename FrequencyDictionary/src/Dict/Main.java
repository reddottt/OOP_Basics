package Dict;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrequencyDictionary frequencyDictionary = new FrequencyDictionary();
        System.out.println("Enter text: ");
        frequencyDictionary.buildDictionary(scanner.nextLine());
    }
}
