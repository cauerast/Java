package studies.FLX.Main.ObjectOrientedPrograming.MultiThreading;

public class Main {
    public static void main(String[] args) {
        // MultiThreading = enables a program to run multiple threads concurrently
        //  (Thread = a set of instructions that run independently)

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("Game Start!");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Game Over!");


    }
}
