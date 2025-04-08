package loop;

public class PrimeNumber_2 {

        public static void main(String[] args) {
            System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

            for (int i = 2; i < 100; i++) {
                if (laSoNguyenTo(i)) {
                    System.out.print(i + " ");
                }
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
