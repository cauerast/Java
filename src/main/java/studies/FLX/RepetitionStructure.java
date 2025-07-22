package studies.FLX;


import java.util.ArrayList;

public class RepetitionStructure {
    public static void main(String[] args) {
        repetitionABCD();
        invertString();
    }

    private static void repetitionABCD() {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("a");
        wordList.add("b");
        wordList.add("c");
        wordList.add("d");

        for(String word : wordList){
            System.out.println(word);
        }

        //or

        for(int i = 0; wordList.size() > i; i++){
            System.out.println(wordList.get(i));
        }
    }

    private static void invertString(){
        String normal = "ABCD";
        String invertedString = "";
        for(int i = normal.length() - 1; i >= 0; i--){
            invertedString = invertedString + normal.charAt(i);
        }

        System.out.println(normal);
        System.out.println(invertedString);
    }
}
