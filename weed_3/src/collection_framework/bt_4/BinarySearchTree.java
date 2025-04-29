package collection_framework.bt_4;

public class BinarySearchTree {
    TreeNode root;

    // Phương thức tìm kiếm một phần tử trong cây
    public boolean search(int element) {
        TreeNode current = root;

        while (current != null) {
            if (element < current.element) {
                current = current.left;
            } else if (element > current.element) {
                current = current.right;
            } else {
                return true; // Tìm thấy phần tử
            }
        }

        return false; // Không tìm thấy phần tử
    }

    // Phương thức thêm phần tử (để tạo cây phục vụ kiểm tra)
    public void insert(int element) {
        root = insertRec(root, element);
    }

    private TreeNode insertRec(TreeNode node, int element) {
        if (node == null) {
            return new TreeNode(element);
        }
        if (element < node.element) {
            node.left = insertRec(node.left, element);
        } else if (element > node.element) {
            node.right = insertRec(node.right, element);
        }
        return node;
    }
}

