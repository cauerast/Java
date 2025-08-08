package studies.FLX.Main;

import java.util.Scanner;

public class MathClassMethods {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result1 = Math.pow(2, 4);
        double result2 = Math.abs(-5); // module
        double result3 = Math.sqrt(9);
        double result4 = Math.round(3.14); // round normaly
        double result5 = Math.ceil(3.14); // round up
        double result6 = Math.floor(3.99); // round down
        double result7 = Math.max(10, 20);
        double result8 = Math.min(10, 20);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the length of a: ");
        double a = scanner.nextDouble();
        System.out.print("enter the length of b: ");
        double b = scanner.nextDouble();
        double hip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("The hip is %.1fcm²", hip);
        scanner.close();
    }
}
