package studies.FLX.Main.ObjectOrientedPrograming.Hashmaps;

import java.security.Key;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        // Keys are unique but Values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.5); // map.put()  => to add
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        map.remove("coconut"); // map.remove() => to remove

        map.put("orange", 2.55); // override

        System.out.println(map.get("apple")); // map.get() => return the Value

        System.out.println(map.containsKey("orange")); // map.containsKey() => check if exist | (true)
        System.out.println(map.containsValue(0.25)); // map.containsValue() => check if exist | (true)
        System.out.println(map.keySet()); // map.keySet() => return all the keys of the map
        System.out.println(map.size()); // map.size() => return the length (4)

        // to show the hash =>

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }


        // check

        if(map.containsKey("orange")){
            System.out.println("orange: " + map.get("orange"));
        }
        else{
            System.out.println("Orange don't exists in this hashMap");
        }
    }
}
