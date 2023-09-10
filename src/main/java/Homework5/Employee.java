package Homework5;

public class Employee extends Person {
     double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            return 0;
        } else {
            double hourlyRate = daySalary / 8;
            return hours * 1.5 * hourlyRate;
        }
    }

    public void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println("Dnevna zaplata " + daySalary);
    }

}
