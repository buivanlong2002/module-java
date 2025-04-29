package collection_framework.bt_2;

class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Phương thức duyệt hậu tự
    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Bước 1: Duyệt cây con bên trái
        postOrderTraversal(node.left);

        // Bước 2: Duyệt cây con bên phải
        postOrderTraversal(node.right);

        // Bước 3: Truy cập nút gốc
        System.out.print(node.key + " ");
    }

    // Phương thức gọi ngoài
    void postOrder() {
        postOrderTraversal(root);
    }

    // Thêm nút mới vào BST
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

