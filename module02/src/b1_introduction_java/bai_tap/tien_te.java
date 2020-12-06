package b1_introduction_java.bai_tap;

import java.util.Scanner;

public class tien_te {
    public static void main(String[] args) {
        int vnd= 23000;
        int usd;
        Scanner kb =new Scanner(System.in);
        System.out.println("nhiep tien USD");
        usd= kb.nextInt();
        double swap=usd*vnd;
        System.out.println(swap);

    }
}
