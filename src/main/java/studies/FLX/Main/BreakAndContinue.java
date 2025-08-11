package studies.FLX.Main;

public class BreakAndContinue {
    public static void main(String[] args) {

        for(int i = 0; i< 10; i++){

            if(i == 5){
                break; // stops the loop
            }
            System.out.print(i + " ");
        }
        System.out.println("\nThe loop has been stoped!");

        for(int i = 0; i< 10; i++){

            if(i == 5){
                continue; // skips the loop
            }
            System.out.print(i + " ");
        }
        System.out.println("\nThe loop has been stoped!");
    }
}
