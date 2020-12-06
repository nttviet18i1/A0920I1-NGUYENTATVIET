package b2_loop_to_java.bai_tap;

import java.util.Scanner;

public class snt_dau_tien {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int count=0;
        int num;
        num= kb.nextInt();
        int N=2;
        if(num<=0){
            System.out.println("vui long nhap so khac" );

        }
        while (count<num){
           boolean check= true;
            for(int i=2;i<= Math.sqrt(N); i++) {
                if(N%i==0){
                    check=false;
                    break;

                }
            }
            if(check){
                count++;
                System.out.println(N+" ");
            }

            N++;
        }

    }
}
