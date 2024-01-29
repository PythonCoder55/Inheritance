import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Smith", "789012", "Ms.", 1990, 52000.0);
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Smith", "789012", "Ms.", 1990, 52000.0);
        assertEquals("Regular Pay (fraction of yearly salary): $1000.00, Overtime Pay: $0.00, Total Pay: $1000.00", salaryWorker.displayWeeklyPay(40));
        assertEquals("Regular Pay (fraction of yearly salary): $1000.00, Overtime Pay: $187.50, Total Pay: $1187.50", salaryWorker.displayWeeklyPay(45));
    }
}
