package studies.FLX.Main.ObjectOrientedPrograming.Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //  helps improve performance with time-consuming operations
        // op1. extend the thread class (simpler)
        // op2. implement the runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name! ");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
