package _13_search;

import java.util.Arrays;

public class BinarySearch {

    public static int search(int[] array, int value) {
        int head = 0;
        int tail = array.length - 1; //8
        int mid = 0;
        while (head <= tail) {
            mid = (head + tail) / 2; // 4 6 7
            if (value == array[mid]) {
                return mid;
            } else if (value > array[mid]) {
                head = mid + 1; // 5 7 8
            } else {
                tail = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(myArray, 5));

        System.out.println(Arrays.binarySearch(myArray, 5));
    }
}
