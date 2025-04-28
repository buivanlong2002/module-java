// Lớp in số chẵn
class EvenNumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Nghỉ 0.5s để dễ quan sát
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Lớp in số lẻ
class OddNumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Nghỉ 0.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Hàm main
public class Main {
    public static void main(String[] args) {
        // Tạo hai đối tượng Runnable
        Runnable evenTask = new EvenNumberPrinter();
        Runnable oddTask = new OddNumberPrinter();

        // Tạo hai Thread từ hai Runnable
        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        // Start cả hai thread
        evenThread.start();
        oddThread.start();
    }
}

