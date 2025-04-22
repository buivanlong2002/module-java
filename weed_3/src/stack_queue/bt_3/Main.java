package stack_queue.bt_3;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.displayQueue(); // Output: 10 20 30

        System.out.println("Dequeued: " + queue.deQueue()); // Output: Dequeued: 10
        queue.displayQueue(); // Output: 20 30
    }
}
