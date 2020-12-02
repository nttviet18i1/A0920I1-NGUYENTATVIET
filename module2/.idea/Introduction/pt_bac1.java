package Introduction;
import java.util.*;

public class pt_bac1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a:");
        int a=  scanner.nextInt();
        System.out.println("nhap b");
        int b=scanner.nextInt();
        System.out.println("nhap c");
        int c= scanner.nextInt();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}