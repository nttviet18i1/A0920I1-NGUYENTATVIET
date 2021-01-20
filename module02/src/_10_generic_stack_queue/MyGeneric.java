package _10_generic_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {
    public static void showElement(Object[] objects){
        for(int index = 0; index < objects.length; index++){
            System.out.print(objects[index] + "\t");
        }
    }

    public static <T> void showElement2(T[] objects){
        for(int index = 0; index < objects.length; index++){
            System.out.print(objects[index] + "\t");
        }
    }
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        Double[] doubleArr = {1.1, 2.2, 3.3};
        String[] stringArr = {"one", "two", "three"};

        showElement2(intArr);
        System.out.println();
        showElement2(doubleArr);
        System.out.println();
        showElement2(stringArr);


        List<Integer> myList = new ArrayList();
        myList.add(3);

        Integer a = myList.get(0);
    }
}
