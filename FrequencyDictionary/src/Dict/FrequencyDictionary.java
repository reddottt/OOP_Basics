package Dict;

import java.util.ArrayList;

public class FrequencyDictionary {

    public void buildDictionary(String text) {
        ArrayList<Character> enAlphabet = new ArrayList<>();
        text = text.toLowerCase();

        for (char character = 'a'; character <= 'z'; character++) {
            enAlphabet.add(character);
        }
        display(enAlphabet);

        int[] countArray = new int[enAlphabet.size()];

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= enAlphabet.get(0) && character <= enAlphabet.get(25)) {
                countArray[character - 'a']++;
            }
        }

        for (int i = 0; i < enAlphabet.size(); i++) {
            System.out.println(enAlphabet.get(i) + " = " + countArray[i]);
        }

    }

    public static void display(ArrayList alphabet) {
        System.out.println(alphabet);
    }
}
