package collection_framework.bt_3;

class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Phương thức duyệt tiền tự
    void preOrderTraversal(Node node) {
        if (node == null)
            return;

        // Bước 1: Truy cập nút gốc
        System.out.print(node.key + " ");

        // Bước 2: Duyệt cây con bên trái
        preOrderTraversal(node.left);

        // Bước 3: Duyệt cây con bên phải
        preOrderTraversal(node.right);
    }

    // Gọi hàm duyệt từ ngoài
    void preOrder() {
        preOrderTraversal(root);
    }

    // Thêm node mới vào BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
}
