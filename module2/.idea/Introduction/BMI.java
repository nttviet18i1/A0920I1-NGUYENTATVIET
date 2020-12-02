package Introduction;
import  java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap height:");
        height = scanner.nextInt();
        System.out.println("nhap weight:");
        weight = scanner.nextInt();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
