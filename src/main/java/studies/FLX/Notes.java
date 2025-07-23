package studies.FLX;

import java.util.ArrayList;

public class Notes {
    public static void main(String[] args) {
        primitiveTypes();
        conditional();
        array();
        arrayList();
        loop();
        casting();
    }

    private static void primitiveTypes() {

        // byte => 8 bits [-128 a 127]
        byte numberByte = 10;

        // short => 16 bits [-32.768 a 32.767]
        short numberShort = 32400;

        // int => 32 bits [-2.147.483.648 a 2.147.483.647]
        int numberInt = 102039;

        // long => 64 bit [-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807]
        // numero precisa terminar com o char 'L'
        long numberLong = 93912309L;

        // float => 32 bits => [numeros decimais simples (ate 2 apos a virgula)]
        // numero precisa terminar com o char 'f'
        float numberFloat = 1.43f;

        // double => 64 bits => [numeros decimais complexos]
        double numberDouble = 123.2321;

        // String => represents words and chars
        String name = "caue";

        // char => represents chars [use 'x', single quotes]
        char initial = 'a';

        //boolean => true or false
        boolean isStudent = true;

    }

    private static void conditional() {

        String str = "caue";

        if(str.isBlank()){
            System.out.println("the string is empty");
        } else if(str == "caue"){
            System.out.println("the name is: " + str);
        } else{
            throw new Error();
        }

    }

    private static void array() {

        // index =>              0, 1, 2, 3, 4
        int[] collectionOfInt = {1, 2, 3, 4, 5}; // fixed size array
        System.out.println(collectionOfInt[0]); // 1

        // or =>
        int[] collectionOfInt2 = new int[7]; // Array with size 7 (length = 7)
        collectionOfInt2[0] = 10;
        collectionOfInt2[1] = 32;
        collectionOfInt2[2] = 53;
        collectionOfInt2[3] = 27;
        collectionOfInt2[4] = 52;
        collectionOfInt2[5] = 43;

    }

    private static void arrayList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Caue");
        names.add("Laura");
        names.add("Snoopy");
        names.add("Snoopy2");

        names.remove(3);
        System.out.println(names.get(0));
    }

    private static void loop() {

        // FOOR LOOP IN ARRAYLIST
        ArrayList<String> names = new ArrayList<>();
        names.add("Caue");
        names.add("Laura");
        names.add("Snoopy");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // FOR LOOP IN ARRAY (FIXED)
        String[] stringList = new String[2];
        stringList[0] = "Java";
        stringList[1] = "intellij";

        for(int i = 0; i < stringList.length; i++){
            System.out.println(stringList[i]);
        }

                    //or

        for (String s : stringList) { // for each "s" in stringList
            System.out.println(s); // print
        }

        // WHILE LOOP
        int i = 0;
        while(i < names.size()){
            System.out.println(names.get(i));
            i++;
        }

        // DO WHILE LOOP
        int j = 0;
        do{
            System.out.println(names.get(j));
            j++;
        } while(j < names.size());
    }

    private static void casting() {

    }

}
