import java.util.Scanner;
public class Employee {
    private
     String firstName;
     String lastName;
     double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {

        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }


    public double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        double raiseAmount = monthlySalary * 0.10;
        monthlySalary += raiseAmount;
    }
}
class practical13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Employee 1:");
        System.out.print("First Name: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary1 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("\nEnter details for Employee 2:");
        System.out.print("First Name: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName2 = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary2 = scanner.nextDouble();
        scanner.nextLine();


        Employee emp1 = new Employee(firstName1, lastName1, salary1);
        Employee emp2 = new Employee(firstName2, lastName2, salary2);

        System.out.println("\nEmployee 1:");
        System.out.printf("Yearly Salary: %.2f%n", emp1.calculateYearlySalary());
        System.out.println("Employee 2:");
        System.out.printf("Yearly Salary: %.2f%n", emp2.calculateYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1:");
        System.out.printf("Yearly Salary: %.2f%n", emp1.calculateYearlySalary());
        System.out.println("Employee 2:");
        System.out.printf("Yearly Salary: %.2f%n", emp2.calculateYearlySalary());
        scanner.close();
    }
}
