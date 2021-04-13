package Thicuoimodule2.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    private static final String NAME_REGEX = "^[A-Z]{1}[a-z]*";
    public static boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
