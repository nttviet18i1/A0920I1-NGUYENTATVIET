package b2_loop_to_java.bai_tap;

import java.util.Scanner;

public class hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner bp = new Scanner(System.in);
        System.out.println("chieu cao:");

        int h = bp.nextInt();
        System.out.println("chieu rộng:");
        int w = bp.nextInt();

        for (int i = 0; i < h; i++) {
            //in ra dấu sao
            for (int j = 0; j < w; j++) {


                    System.out.print("* ");
                }
                    System.out.println();

        }

    }
}
