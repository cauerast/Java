package studies.FLX.Main;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.print("enter your name: ");
            String name = scanner.nextLine();

            System.out.print("enter your age: ");
            int age = scanner.nextInt();

            System.out.print("enter your gpa: ");
            double gpa = scanner.nextDouble();

            System.out.print("are you a student? (true / false): ");
            boolean isStudent = scanner.nextBoolean();


            System.out.println("\nHello " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("Your gps is " + gpa);
            System.out.println("Is student: " + isStudent);

            if(isStudent){
                System.out.println("You are enrolled as a student!");
            } else{
                System.out.println("You are NOT enrolled as a student");
            }

            //


            System.out.print("\nenter your age: ");
            int age1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("enter your favorite color: ");
            String color = scanner.nextLine();

            System.out.println("You are " + age1 + " years old");
            System.out.println("your favorite color is " + color);


            //

        // calculating an area

            double width = 0;
            double height = 0;
            double area = 0;

            System.out.print("\nEnter the width: ");
                width = scanner.nextDouble();
            System.out.print("Enter the height: ");
                height = scanner.nextDouble();

                area = width * height;

            System.out.print("\nThe area is: " + area + "cm²");
            scanner.close();
    }
}
