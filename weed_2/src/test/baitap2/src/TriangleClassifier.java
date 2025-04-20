package test.baitap2.src;
public class TriangleClassifier {
    public static String classify(int a, int b, int c) {
        if (a+b>c && c+b>a && a+c>b){
            if (a == b && b == c) {
                return "equilateral triangle";
            }else if (a == b || b == c || c == a) {
                return "isosceles triangle";
            }else {
                return "regular triangle";
            }
        }
        return "invalid triangle";
    }
}