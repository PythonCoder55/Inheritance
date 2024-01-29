import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "123456", "Mr.", 1985, 10.0);
        assertEquals(400.0, worker.calculateWeeklyPay(40), 0.01);
        assertEquals(475.0, worker.calculateWeeklyPay(45), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "123456", "Mr.", 1985, 10.0);
        assertEquals("Regular Pay (40 hours): $400.00, Overtime Pay: $75.00, Total Pay: $475.00", worker.displayWeeklyPay(45));
    }
}
