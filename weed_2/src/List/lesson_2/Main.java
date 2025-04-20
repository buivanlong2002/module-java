package List.lesson_2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        // Thêm phần tử vào đầu, giữa và cuối
        list.addFirst("C");
        list.addLast("D");
        list.add(1, "B");
        list.add(0, "A");
        list.add(list.size(), "E");

        // In danh sách hiện tại
        System.out.println("Danh sách sau khi thêm:");
        list.printList();

        // Xoá phần tử ở đầu, giữa và cuối
        list.remove(0); // A
        list.remove(2); // D
        list.remove(list.size() - 1); // E

        System.out.println("\nDanh sách sau khi xoá:");
        list.printList();

        // Kiểm tra contains
        System.out.println("\nDanh sách có chứa 'B'? " + list.contains("B"));
        System.out.println("Danh sách có chứa 'Z'? " + list.contains("Z"));

        // Kiểm tra indexOf
        System.out.println("Vị trí của 'B': " + list.indexOf("B"));

        // Thêm phần tử và kiểm tra add(E e)
        list.add("F");
        System.out.println("\nDanh sách sau khi add(\"F\"):");
        list.printList();

        // Lấy phần tử theo vị trí
        System.out.println("\nPhần tử tại vị trí 1: " + list.get(1));

        // Lấy phần tử đầu và cuối
        System.out.println("Phần tử đầu tiên: " + list.getFirst());
        System.out.println("Phần tử cuối cùng: " + list.getLast());

        // Clone danh sách
        MyLinkedList<String> clonedList = list.clone();
        System.out.println("\nDanh sách clone:");
        list.printList();

        // Xoá phần tử theo giá trị
        list.remove("F");
        System.out.println("\nDanh sách sau khi xoá phần tử \"F\":");
        list.printList();

        // Xoá toàn bộ
        list.clear();
        System.out.println("\nDanh sách sau khi clear:");
        list.printList();
    }

}
