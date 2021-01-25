package Dict;

import java.util.ArrayList;

class FrequencyDictionary {

    public void buildDictionary(String text) {
        ArrayList<Character> enAlphabet = new ArrayList<>();
        ArrayList countList = new ArrayList();
        text = text.toLowerCase();

        for (Character character = 'a'; character <= 'z'; character++) {
            enAlphabet.add(character);
        }
        display(enAlphabet);
        addToList(enAlphabet, countList);

        for (int i = 0; i < text.length(); i++) {
            if (enAlphabet.contains(text.charAt(i))){
                int oldVal = (int) countList.get(enAlphabet.indexOf(text.charAt(i)));
                int newVal = oldVal + 1;
                countList.set(enAlphabet.indexOf(text.charAt(i)), newVal);
            }
        }

        display(enAlphabet, countList);

    }

    private static void addToList(ArrayList alphabet, ArrayList countList){
        for (int i = 0; i <= alphabet.size() - 1 ; i++) {
            countList.add(0);
        }
    }

    private static void display(ArrayList alphabet) {
        System.out.println(alphabet);
    }

    private static void display(ArrayList alphabet, ArrayList countList) {
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " = " + countList.get(i));
        }
    }
}
