package studies.FLX.Main.ObjectOrientedPrograming.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Aplle"); // add
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        System.out.println(fruits); // show all

        fruits.remove(3); // remove
        fruits.set(0, "Pineapple"); // replace
        System.out.println(fruits.get(1)); // show in x index
        System.out.println(fruits.size()); // length or size of the array

        Collections.sort(fruits); // sort in alphabetical order

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //



    }
}
