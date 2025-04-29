package test;

// Tài khoản ngân hàng
class BankAccount {
    private int balance = 1000; // Số dư ban đầu

    // Rút tiền - cần đồng bộ để tránh lỗi
    public void withdraw(int amount, String threadName) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(threadName + " đang cố gắng rút " + amount + "...");
                try {
                    Thread.sleep(500); // giả lập thời gian xử lý
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= amount;
                System.out.println(threadName + " đã rút thành công. Số dư còn lại:  " + balance);
            } else {
                System.out.println(threadName + " không thể rút " + amount + " vì số dư không đủ (" + balance + ")");
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Luồng rút tiền
class WithdrawTask implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount, Thread.currentThread().getName());
    }
}

// Chạy chương trình
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();


        Thread user1 = new Thread(new WithdrawTask(account, 700), "User-1");
        Thread user2 = new Thread(new WithdrawTask(account, 500), "User-2");
        Thread user3 = new Thread(new WithdrawTask(account, 300), "User-3");
        Thread user4 = new Thread(new WithdrawTask(account, 100), "User-4");
        Thread user5 = new Thread(new WithdrawTask(account, 900), "User-5");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
    }
}

