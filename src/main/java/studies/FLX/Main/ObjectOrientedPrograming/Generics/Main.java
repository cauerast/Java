package studies.FLX.Main.ObjectOrientedPrograming.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface
        // or a method that is compatible with different data types.
        // <T> type parameter(placeholder that gets replaced with a real type
        // <String> type argument (specifies the type)

        Box<Integer> box = new Box<>();

        box.setItem(132);
        System.out.println(box.getItem());


        Product<String, Double> product1 = new Product<>("Apple", 0.5);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        Product<String, Integer> product2 = new Product<>("Ticket", 15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
