package studies.FLX.Main;
import java.util.Random;

public class userRandom {
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(1, 6); // random num between 1 and 5

        System.out.println(number);
    }
}
