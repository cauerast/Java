package studies.FLX.Main.ObjectOrientedPrograming.WrapperClasses;

public class Main {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        // to be used as objects. "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of Collections Framework and static Utility Methods.


        //Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";

        //Unboxing / unWrap
        int x = a;
        double xx = b;
        char xxx = c;
        boolean xxxx = d;

        // converts methods to string
        String aa = Integer.toString(123);
        String bb = Double.toString(3.14);
        String cc = Character.toString('@');
        String dd = Boolean.toString(false);

        String i = aa  + " " + bb + " " + cc + " " + dd;

        System.out.println(i);

        // converts methods to its base forms
        int aaa = Integer.parseInt("123");
        double bbb = Double.parseDouble("3.14");
        char ccc = "@".charAt(0);
        boolean ddd = Boolean.parseBoolean("false");

        // chack in wrapper

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));



    }
}
