package abstract_class_interface.BT_2;

import inheritance.TH.Circle;
import inheritance.TH.Square;

public class ColorableTest { public static void main(String[] args) {
    // Kiểm tra các đối tượng thực hiện interface Colorable
    Colorable[] colorables = new Colorable[2];

    colorables[0] = (Colorable) new Square(5); // Giả sử Square triển khai Colorable
    colorables[1] = (Colorable) new Circle(3); // Giả sử Circle triển khai Colorable

    // Duyệt qua mảng và gọi phương thức howToColor
    for (Colorable colorable : colorables) {
        System.out.println(colorable.howToColor());
    }
}

}
