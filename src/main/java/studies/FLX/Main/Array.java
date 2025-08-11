package studies.FLX.Main;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // arrays = a collection of values of the same data type

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        Arrays.sort(fruits); // sort by alphabetical order
        Arrays.fill(fruits, "pineapple"); // fill (preenche) array w/ "pineapple"

        //enhanced for loop =>

        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
