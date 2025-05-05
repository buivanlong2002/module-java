package string_regex.bt_2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {

    // Regex: (2 chữ số)-(0 + 9 chữ số)
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Matcher matcher = PHONE_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "(84)-(0978489648)",   // hợp lệ
                "(a8)-(22222222)",     // không hợp lệ
                "(84)-(22b22222)",     // không hợp lệ
                "(84)-(9978489648)"    // không hợp lệ (không bắt đầu bằng 0)
        };

        for (String phone : testCases) {
            System.out.println(phone + " is valid? " + isValidPhoneNumber(phone));
        }
    }
}
