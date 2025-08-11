package studies.FLX.Main;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // ternaryOperator

        //variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
        String passOrFail = (score >=60) ? "Pass" : "Fail";

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);

        //

        // temp converter

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the temp: ");
        double temp = scanner.nextDouble();

        System.out.print("convert to °F or K: ");
        String unit = scanner.next().toUpperCase();

        double newTemp = (unit.equals("F")) ? ((temp * 1.8) + 32) : (temp + 273);

        if(unit.equals("F")){
            System.out.printf("Your temperature in °%s is °%.1f", unit, newTemp);
        } else {
            System.out.printf("Your temperature in %s is %.1f", unit, newTemp);
        }
        scanner.close();

    }
}
