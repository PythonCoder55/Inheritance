import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Create 3 Worker instances
        workers.add(new Worker("Eddie", "Barch", "1001", "Mr.", 1985, 20.0));
        workers.add(new Worker("Jess", "Snort", "1002", "Ms.", 1988, 18.0));
        workers.add(new Worker("John", "Bruner", "1003", "Dr.", 1990, 22.0));

        ArrayList<SalaryWorker> salaryWorkers = new ArrayList<>();

        // Create 3 SalaryWorker instances
        salaryWorkers.add(new SalaryWorker("Mike", "Hurly", "2001", "Mr.", 1975, 100000));
        salaryWorkers.add(new SalaryWorker("Jim", "Tremble", "2002", "Mr.", 1980, 120000));
        salaryWorkers.add(new SalaryWorker("Sam", "Popner", "2003", "Prof.", 1995, 90000));

        // Simulate 3 weekly pay periods
        for (int i = 1; i <= 3; i++) {
            System.out.println("Week " + i + " Pay:");
            double hoursWorked = (i == 2) ? 50 : 40; // 50 hours for week 2, 40 hours otherwise

            for (Worker worker : workers) {
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }

            for (SalaryWorker salaryWorker : salaryWorkers) {
                System.out.println(salaryWorker.formalName() + ": " + salaryWorker.displayWeeklyPay(hoursWorked));
            }

            System.out.println();
        }
    }
}
