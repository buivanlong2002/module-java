package collection_framework.bt_2;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        /* Cây ví dụ

        */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Duyệt hậu tự:");
        tree.postOrder();  // Output: 20 40 30 60 80 70 50
    }
}
