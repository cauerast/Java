package studies.FLX.Main;

public class VarArgs {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments makes more
        //           flexible, no need for overloaded java will pack the args into
        //           an array. =>    ... (ellipsis)


        System.out.println(add(1, 2, 3, 4));
        System.out.println(avarage(1, 2, 3, 4));
    }

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }

    static double avarage(double... numbers){
        double sum1 = 0;

        for(double number: numbers){
            sum1 += number;
        }

        return sum1 / numbers.length;
    }
}
