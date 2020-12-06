package b1_introduction_java.bai_tap;
import  java.util.Scanner;
public class hello_word {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner kb= new Scanner(System.in);
                String name= kb.nextLine();
        System.out.println("Hello: " + name);
    }
}
