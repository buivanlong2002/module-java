package test.test.src;
public class Calculator {
    public int add(int x, int y) {
        if (x / 2 + y / 2 >= Integer.MAX_VALUE / 2) {
            throw new RuntimeException("out of range exception");
        }
        return x + y;
    }
}