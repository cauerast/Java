package studies.FLX.Fundamentos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DecisionStructure {
    public static void main(String[] args) {
        //evenNumber();
        //equalsString();
        //initString();
        //date();
    }

    private static void evenNumber() {
        Integer number = 3;

        if(number % 2 == 0){
            System.out.println("this number is even");
        } else{
            System.out.println("this number is odd");
        }
    }

    private static void equalsString() {
        String frase = "Today is monday";

        if(frase.contains("monday")){
            if(frase.contains("18pm")){
                System.out.println("bad day");
            }
            else{
                System.out.println("HAPPY DAY!");
            }
        }
        else if(frase.contains("friday") || frase.contains("saturnday") || frase.contains("sunday")){
            System.out.println("WEEKEND!!");
        }
        else{
            System.out.println("a normal day");
        }
    }

    private static void initString() {
        String word = "a";

        if(word.startsWith("a")){
            System.out.println("That word starts with `a`");
        }
        else{
            System.out.println("That word starts with another letter");
        }
    }

    private static void date() {
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse("30/08/2006");

            if(data.before(new Date())){
                System.out.println("esse dia ja passou");
            } else{
                System.out.println("esse dia esta por vir");
            }
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data: " + e.getMessage());
        }
    }
}
