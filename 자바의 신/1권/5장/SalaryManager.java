public class SalaryManager {

    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println("monthsalary =" + salaryManager.getMonthSalary(20000000));
    }

    public double getMonthSalary(int yearlySalary) {
        double monthlySalary = yearlySalary/12;
        System.out.println("without tax =" + monthlySalary);

        double tax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double HealthInsurance = calculateHealthInsurance(monthlySalary);
        double totalTax = tax + nationalPension + HealthInsurance;

        System.out.println("tax = " + tax);
        System.out.println("nationalPension = " + nationalPension);
        System.out.println("HealthInsurance = " + HealthInsurance);


        monthlySalary -= totalTax;

        return monthlySalary;
    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary*(12.5/100);
        return tax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationalPension = monthSalary*(8.1/100);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double HealthInsurance = monthSalary*(13.5/100);
        return HealthInsurance;
    }
}
