package studies.FLX.Main;

public class VarOverloadMethods {

    // overload methods = methods that share the same name,
    //                   but different parameters

    // signature = name + parameters


    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4));

    }

    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

}
