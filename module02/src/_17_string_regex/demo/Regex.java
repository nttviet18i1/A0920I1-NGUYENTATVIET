package _17_string_regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static final String REGEX_ID = "\\d{9}";
    public static final String REGEX_NAME = "^([A-Z][a-z]+ )+[A-Z][a-z]+$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher("12345678A123456789");

        System.out.println(matcher.find());
//
//        System.out.println("12345689".matches(REGEX_ID));
//        String name = "Nguyen Viet Tan"; //OK
//        String name_2 = "Nguyen Viet Tan "; //NG
//        String name_3 = " Nguyen Viet Tan"; //NG

        System.out.println("Nguyen Viet Tan".matches(REGEX_NAME));
    }
}
