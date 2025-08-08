package studies.FLX.Main;
import java.util.Random;

public class UserRandom {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(1, 6); // random num between 1 and 5
        double number2 = random.nextDouble(0, 1);
        float number3 = random.nextFloat(1, 2);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        boolean isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("heads");
        } else{
            System.out.println("tails");
        }
    }
}
