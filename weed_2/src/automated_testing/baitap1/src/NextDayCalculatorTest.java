package automated_testing.baitap1.src;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {

    @Test
    public void testNextDayOfNormalDate() {
        LocalDate input = LocalDate.of(2025, 4, 17);
        NextDayCalculator calc = new NextDayCalculator(input);
        assertEquals(LocalDate.of(2025, 4, 18), calc.getToday());
    }

    @Test
    public void testNextDayEndOfMonth() {
        LocalDate input = LocalDate.of(2025, 1, 31);
        NextDayCalculator calc = new NextDayCalculator(input);
        assertEquals(LocalDate.of(2025, 2, 1), calc.getToday());
    }

    @Test
    public void testNextDayEndOfYear() {
        LocalDate input = LocalDate.of(2024, 12, 31);
        NextDayCalculator calc = new NextDayCalculator(input);
        assertEquals(LocalDate.of(2025, 1, 1), calc.getToday());
    }

    @Test
    public void testNextDayLeapYear() {
        LocalDate input = LocalDate.of(2024, 2, 28); // 2024 là năm nhuận
        NextDayCalculator calc = new NextDayCalculator(input);
        assertEquals(LocalDate.of(2024, 2, 29), calc.getToday());
    }

    @Test
    public void testNextDayAfterLeapDay() {
        LocalDate input = LocalDate.of(2024, 2, 29);
        NextDayCalculator calc = new NextDayCalculator(input);
        assertEquals(LocalDate.of(2024, 3, 1), calc.getToday());
    }
}


