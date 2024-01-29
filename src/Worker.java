public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * (hourlyPayRate * 1.5));
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(hoursWorked, 40) * hourlyPayRate;
        double overtimePay = Math.max(hoursWorked - 40, 0) * hourlyPayRate * 1.5;
        double totalPay = calculateWeeklyPay(hoursWorked);

        return String.format("Regular Pay (40 hours): $%.2f, Overtime Pay: $%.2f, Total Pay: $%.2f", regularPay, overtimePay, totalPay);
    }
}
