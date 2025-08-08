package studies.FLX.Main;

public class printf {
    public static void main(String[] args) {

        // printf() = is a method uded to format output
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";  // %s
        char firstLetter = 'S';     // %c
        int age = 30;               // %d
        double height = 60.5;       // %f
        boolean isEmployed = true;  // %b

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts w/ %c\n", firstLetter);
        System.out.printf("Your are %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n\n", isEmployed);


        // [flags]
        // . = toFixed
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = 4354.01;
        double price4 = -54.01;
        double price5 = 654.9;

        System.out.printf("%.1f\n", price1); // auto round
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%,.1f\n", price3);
        System.out.printf("%(.1f\n", price4);
        System.out.printf("% .1f\n\n", price5);


        // [width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;

        System.out.printf("%04d\n", id1); // padding center in 4 by 0
        System.out.printf("%4d\n", id2); // padding right in 4 by spaces
        System.out.printf("%-4d\n", id3); // padding left in 4 by spaces
    }
}
