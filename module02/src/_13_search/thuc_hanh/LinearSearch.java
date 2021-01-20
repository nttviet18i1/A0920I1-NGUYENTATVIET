package _13_search;

public class LinearSearch {


    public static int search(int[] array, int value) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {8, 9, 2, 4, 11, 12, 10};
        System.out.println(search(myArray, 10));
    }
}
