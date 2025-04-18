package automated_testing.baitap1.src;
import java.time.LocalDate;

public class NextDayCalculator {
    private LocalDate today;

    public NextDayCalculator(LocalDate today) {
        this.today = today.plusDays(1);
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today.plusDays(1);
    }
}




