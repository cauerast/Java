package studies.FLX.Main;

public class JavaMethods {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called

        String name = "Spongebob";
        int age = 25;
        happyBirthday(name, age);

        double result = square(3);
        System.out.println(result);

        double resultCube = cube(3);
        System.out.println(resultCube);

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        int age1 = 18;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+");
        }
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s! \n", name);
        System.out.printf("You are %d years old! \n", age);
        System.out.println("Happy Birthday to you!");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age1){
        if(age1 >= 18){
            return true;
        } else {
            return false;
        }
    }
}
