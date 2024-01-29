public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, 0); // Hourly pay rate is not applicable for SalaryWorker
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        // Calculate weekly pay by dividing annual salary by 52 weeks
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = calculateWeeklyPay(hoursWorked);
        double hourlyPayRate = regularPay / 40;
        double overtimePay = 0;
        overtimePay = Math.max(hoursWorked - 40, 0) * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;

        return String.format("Regular Pay (fraction of yearly salary): $%.2f, Overtime Pay: $%.2f, Total Pay: $%.2f", regularPay, overtimePay, totalPay);
    }
}
