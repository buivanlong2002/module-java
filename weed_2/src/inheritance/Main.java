package inheritance;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(3);
        list.add("A");
        list.add("B");
        list.add("C");

        // Truy cập mảng nội bộ bằng reflection (Java 7/8 không bị chặn)
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] oldArray = (Object[]) field.get(list);

        System.out.println("Before add: oldArray length = " + oldArray.length);
        System.out.println("Before add: oldArray[0] = " + oldArray[0]);

        // Gây đầy mảng → ArrayList sẽ tạo mảng mới
        list.add("D");

        Object[] newArray = (Object[]) field.get(list);

        System.out.println("After add: newArray length = " + newArray.length);

        // Kiểm tra xem oldArray còn sống?
        System.out.println("Old array vẫn còn giữ được:");
        for (Object obj : oldArray) {
            System.out.println(obj);
        }
    }
}
