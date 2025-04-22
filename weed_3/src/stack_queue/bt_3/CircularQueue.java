package stack_queue.bt_3;

public class CircularQueue {
    private Node front = null;
    private Node rear = null;

    // Thêm phần tử vào hàng đợi
    public void enQueue(int value) {
        Node newNode = new Node(value);  // B1

        if (front == null) {             // B2
            front = rear = newNode;
            rear.next = front;          // Liên kết vòng
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;          // Rear trỏ về front
        }
    }

    // Lấy phần tử ra khỏi hàng đợi
    public Integer deQueue() {
        if (front == null) {            // B1
            return null;                // B2
        }

        int value;

        if (front == rear) {            // Chỉ còn 1 phần tử
            value = front.data;
            front = rear = null;
        } else {
            value = front.data;
            front = front.next;
            rear.next = front;         // Cập nhật rear trỏ lại front
        }

        return value;
    }

    // In các phần tử trong hàng đợi (phục vụ kiểm tra)
    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}
