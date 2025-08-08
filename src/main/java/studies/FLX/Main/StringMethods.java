package studies.FLX.Main;

public class StringMethods {
    public static void main(String[] args) {
        String name = "FLX loves yumi";
        String empty = "";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf(" "));
        System.out.println(name.lastIndexOf("l"));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("l", "x"));

        if(name.isEmpty()){
            System.out.println("Hello User!");
        } else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains spaces");
        } else{
            System.out.println("Your name DOESN'T contains spaces");
        }

        if(name.equalsIgnoreCase("FLX loves yumi")){
            System.out.println("You really loves yumi");
        } else {
            System.out.println("You must have to love yumi forever");
        }
    }
}
