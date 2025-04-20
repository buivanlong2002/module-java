package test.baitap2.src;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    public void testTriangleClassifier0() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "equilateral triangle";
        String result = TriangleClassifier.classify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "isosceles triangle";
        String result = TriangleClassifier.classify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "regular triangle";
        String result = TriangleClassifier.classify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "invalid triangle";
        String result = TriangleClassifier.classify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "invalid triangle";
        String result = TriangleClassifier.classify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "invalid triangle";
        String result = TriangleClassifier.classify(a, b, c);
        assertEquals(expected, result);
    }
}