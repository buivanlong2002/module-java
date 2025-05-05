package string_regex.bt_1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ClassNameValidator {

    // Regex: bắt đầu bằng C, A, P + 4 chữ số + kết thúc bằng G, H, I, K
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private static final Pattern CLASS_NAME_PATTERN = Pattern.compile(CLASS_NAME_REGEX);

    public static boolean isValidClassName(String className) {
        Matcher matcher = CLASS_NAME_PATTERN.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCases = {"C0223G", "A0323K", "M0318G", "P0323A", "C12@3G"};

        for (String className : testCases) {
            System.out.println(className + " is valid? " + isValidClassName(className));
        }
    }
}
