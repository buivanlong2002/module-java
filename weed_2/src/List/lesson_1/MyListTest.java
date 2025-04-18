package List.lesson_1;



public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        // Thêm phần tử
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Danh sách ban đầu:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] " + list.get(i));
        }

        // Thêm vào vị trí cụ thể
        list.add(1, "Orange");
        System.out.println("\nSau khi thêm 'Orange' vào vị trí 1:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] " + list.get(i));
        }

        // Xóa phần tử
        list.remove(2);
        System.out.println("\nSau khi xóa phần tử tại vị trí 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] " + list.get(i));
        }

        // Kiểm tra contains và indexOf
        System.out.println("\nDanh sách có chứa 'Banana'? " + list.contains("Banana"));
        System.out.println("Vị trí của 'Banana': " + list.indexOf("Banana"));

        // Clone danh sách
        MyList<String> cloneList = list.clone();
        System.out.println("\nClone danh sách:");
        for (int i = 0; i < cloneList.size(); i++) {
            System.out.println("[" + i + "] " + cloneList.get(i));
        }

        // Clear danh sách gốc
        list.clear();
        System.out.println("\nSau khi clear danh sách gốc, size = " + list.size());
    }
}
