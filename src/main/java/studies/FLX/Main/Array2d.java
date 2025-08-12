package studies.FLX.Main;

public class Array2d {
    public static void main(String[] args) {
        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef"}}; // 2d array

        groceries[0][0] = "Pineapple"; // row 0 column 0 is now a pineapple
        groceries[1][0] = "celery"; // row 1 column 0 is now a celery
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food + " ");
            }
            System.out.println();
        }

        //

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char icon : row){
                System.out.print(icon + " ");
            }
            System.out.println();
        }


    }

}
