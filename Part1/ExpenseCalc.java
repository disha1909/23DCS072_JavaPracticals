import java.util.Scanner;
class ExpenseCalc {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int numOfDays = sc.nextInt();

        double dailyExpenses[] = new double[numOfDays];

        for (int i = 0; i < numOfDays; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            dailyExpenses[i] = sc.nextDouble();
        }

        double totalExpenses = 0;
        for (int i = 0; i < numOfDays; i++) {
            totalExpenses = totalExpenses + dailyExpenses[i];
        }

        System.out.println("Your total expense for the month is: " + totalExpenses);
        sc.close();
    }
}
