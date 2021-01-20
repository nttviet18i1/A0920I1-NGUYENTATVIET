package _13_search.thuc_hanh;

import java.util.Arrays;

public class Binary_seach {
    public  static int Seach(int[]Myarr, int value){
        int head = 0;
        int tail = Myarr.length - 1;
        int mid = 0;
        while (head <= tail) {
            mid = (head + tail) / 2;
            if (value == Myarr[mid]) {
                return mid;
            } else if (value > Myarr[mid]) {
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] Arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(Seach(Arr,70));
        System.out.println(Arrays.binarySearch(Arr,79));

    }
}
