package studies.FLX.Fundamentos;

import java.util.ArrayList;

public class DecisionAndRepetitionStructure {
    public static void main(String[] args) {
        int number = 10;
        ArrayList<Integer> numberList = new ArrayList<>();

        for(int i = 0; i <= number; i++){
            numberList.add(i);
        }

        ArrayList<Integer> numberListEven = new ArrayList<>();
        ArrayList<Integer> numberListOdd = new ArrayList<>();

        for(int i = 0; i < numberList.size(); i++){
           if(numberList.get(i) % 2 == 0){
               numberListEven.add(numberList.get(i));
           }
           else{
               numberListOdd.add(numberList.get(i));
           }
        }

        System.out.println("Even numbers " + numberListEven);
        System.out.println("Odd numbers " + numberListOdd);

        //or ------------------------------------------------------------

        for(Integer i : numberList){ // or if(int i = 0; i < number; i++)
            if(i % 2 == 0){
                numberListEven.add(i);
            }
            else{
                numberListOdd.add(i);
            }
        }

        System.out.println("Numeros pares: ");
        for(Integer evenNumber : numberListEven){
            System.out.println(evenNumber);
        }

        System.out.println("");
        System.out.println("Numeros impares: ");
        for(Integer oddNumber : numberListOdd){
            System.out.println(oddNumber);
        }


    }
}
