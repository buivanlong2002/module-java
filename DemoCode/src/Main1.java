public class Main1 {
    public static void main(String[] args) {
        // In số chẵn trước
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Nghỉ 0.5s cho dễ nhìn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Sau khi in xong số chẵn, mới in số lẻ
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Nghỉ 0.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

