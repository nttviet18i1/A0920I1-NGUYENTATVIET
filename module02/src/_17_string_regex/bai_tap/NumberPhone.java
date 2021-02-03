package _17_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {

    public static boolean checkInputName(String name) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$"; //"84-0\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("Enter the classphone");
            phone= scanner.nextLine();

        } while (!checkInputName(phone));

        if (checkInputName(phone) == true){
            System.out.println("ok");
        }

    }
}