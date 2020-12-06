package b2_loop_to_java.bai_tap;

import java.util.Scanner;

public class tam_giac_hinh_sao {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("nhap tam giac:");
        int n= kb.nextInt();

        for(int i =0 ;i<n;i++) {
            //tao hang (row) *
            for (int j =n; j > i; j--) {
               System.out.print("*");
            }
           System.out.println();
        }

    }

}
