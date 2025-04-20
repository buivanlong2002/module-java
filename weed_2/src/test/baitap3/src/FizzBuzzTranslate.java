package test.baitap3.src;
public class FizzBuzzTranslate {
    public static String translate(int number) {
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        }else if (number % 5 == 0) {
//            return "Buzz";
//        } else if (number % 3 == 0) {
//            return "Fizz";
//        }else
//            return String.valueOf(number);

        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Số nhập vào phải là một số nguyên dương nhỏ hơn 100.");
        }else {
            String output = "";
            String strNum = String.valueOf(number);
            if (strNum.contains("3") || number % 3 == 0) {
                output += "Fizz";
            }
            if (strNum.contains("5") || number % 5 == 0) {
                output += "Buzz";
            }
            if (!output.isEmpty()) {
                return output;
            }else {
                return readNumber(number);
            }
        }
    }

    public static String readNumber(int number) {
        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        String[] teens = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};

        if (number >= 0 && number < 10) {
            return ones[number];
        }else if (number >= 10 && number < 20) {
            return teens[number - 10];
        }else if (number >= 20 && number < 100) {
            int tenDigit = number / 10;
            int onesDigit = number % 10;
            if (onesDigit == 0) {
                return tens[tenDigit];
            }else if (onesDigit == 5) {
                return tens[tenDigit] + "Lăm";
            }else {
                return tens[tenDigit] + " " + ones[onesDigit];
            }
        }else {
            return String.valueOf(number);
        }
    }
}