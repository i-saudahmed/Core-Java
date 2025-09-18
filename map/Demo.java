package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        // key value pair
        // ? Hashmap is not synchronized and hashtable is synchronized
        // ? threads concept here
        // Map<String, Integer> students = new HashMap<>();
        // Map<String, Integer> students = new Hashtable<>();
        Map<String, Integer> students = new TreeMap<>();
        students.put("Saud", 98);
        students.put("Ahmed", 87);
        students.put("Hameed", 77);
        students.put("Ali", 99);
        students.put("Hunaib", 23);
        students.put("Hameed", 100); // will replace old

        // System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
