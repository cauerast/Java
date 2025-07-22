package studies.FLX;

import java.util.ArrayList;

public class DecisionAndRepetitionStructure {
    public static void main(String[] args) {
        int number = 256;
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> numberListEven = new ArrayList<>();

        for(int i = 0; i < number; i++){
            numberList.add(i);
        }

        for(int i = 0; i < numberList.size(); i++){
           if(numberList.get(i) % 2 == 0){
               numberListEven.add(numberList.get(i));
           }
        }

        System.out.println("Even numbers " + numberListEven);

    }
}
