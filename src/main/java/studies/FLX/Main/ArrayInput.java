package studies.FLX.Main;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] x = new String[3]; // empty array but size 3
        String[] foods; // empty array foods w/ no size yet

        System.out.print("size of food list: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size]; // size for a foods array

        for(int i = 0; i < foods.length; i++){
            System.out.print("enter a #" + (i + 1) + " food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.print("\n" + food + " ");
        }
        scanner.close();
    }
}
