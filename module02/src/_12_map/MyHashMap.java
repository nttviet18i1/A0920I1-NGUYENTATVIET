package _12_map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new HashMap<>();
        myMap.put(new Student(1, "A"), "one");
        myMap.put(new Student(2, "B"), "three");
        myMap.put(new Student(3, "C"), "two");
        myMap.put(new Student(4, "Z"), null);
        myMap.put(null, null);
        myMap.put(null, null);

        System.out.println(myMap.size());

        for (Student key : myMap.keySet()) {
            System.out.println("key: " + key + " value: " + myMap.get(key));
        }
    }
}
