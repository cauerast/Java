package studies.FLX.Main.ObjectOrientedPrograming.WrapperClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numOfFood; i++){
            System.out.print("Enter the food #" + (i + 1) + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }

}
