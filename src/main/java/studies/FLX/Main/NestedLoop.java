package studies.FLX.Main;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        //square structure
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();


    }
}
