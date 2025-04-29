package collection_framework.bt_3;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        /* Cây ví dụ
                    50
                   /  \
                 30    70
                / \    / \
              20  40  60  80
        */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Duyệt tiền tự:");
        tree.preOrder();  // Output: 50 30 20 40 70 60 80
    }
}
