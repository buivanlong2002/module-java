package loop;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0; // đếm số nguyên tố đã in
        int number = 2; // bắt đầu từ số 2

        while (count < 20) {
            if (laSoNguyenTo(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
