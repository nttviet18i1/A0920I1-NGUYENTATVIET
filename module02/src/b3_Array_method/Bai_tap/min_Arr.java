package b3_Array_method.Bai_tap;



import java.util.Scanner;

public class min_Arr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("so phan tu trong mang:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("so luong man vuot qua 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("phan tu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("danh sach : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] <min) {
                min = array[j];
                index = j ;
            }
        }
        System.out.println("gia tri nho nhat trong mang la " +min + " vi tri " + index);
    }
}