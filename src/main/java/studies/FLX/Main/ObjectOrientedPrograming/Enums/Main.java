package studies.FLX.Main.ObjectOrientedPrograming.Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that represents
        //  a fixed set of constants. They improve code readability and are
        //  easy to maintain. More efficient with switches comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDayNumber());

            // to don't use Strings in cases, we use Enums, it is more efficient
            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("it is a weekday");

                case SATURNDAY,
                     SUNDAY -> System.out.println("It is a weekend");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }
    }
}
