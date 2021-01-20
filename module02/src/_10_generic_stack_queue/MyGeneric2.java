package _10_generic_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric2 {
    public static void showElement(List<? super Integer> myList){
        for(int index = 0; index < myList.size(); index++){
            System.out.print(myList.get(index) + "\t");
        }
    }

    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);

        List<Double> myList2 = new ArrayList<>();
        myList2.add(1.1);
        myList2.add(2.2);
        myList2.add(3.3);

        List<String> myList3 = new ArrayList<>();
        myList3.add("one");
        myList3.add("two");
        myList3.add("three");

        showElement(myList1);
        System.out.println();
//        showElement(myList2);
//        System.out.println();
//        showElement(myList3);
    }
}
