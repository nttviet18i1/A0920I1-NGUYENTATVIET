package _12_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new TreeMap<>();
        myMap.put(new Student(3, "D"), "two");
        myMap.put(new Student(1, "A"), "one");
        myMap.put(new Student(2, "Y"), "three");
        myMap.put(new Student(4, "Z"), null);

        System.out.println(myMap.size());

        for (Student key : myMap.keySet()) {
            System.out.println("key: " + key + " value: " + myMap.get(key));
        }
    }
}
