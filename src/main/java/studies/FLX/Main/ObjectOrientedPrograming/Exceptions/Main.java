package studies.FLX.Main.ObjectOrientedPrograming.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // try { danger code }
        // catch (name of the error){ error }

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        finally {
            scanner.close();
            System.out.println("This always executes");
        }


    }
}
