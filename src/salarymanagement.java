import java.util.Scanner;
public class salarymanagement
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] employees = new String[n];
        double[] baseSalaries = new double[n];
        double[][] monthlySalaries = new double[n][12];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            employees[i] =  scanner.nextLine();
            System.out.print("Enter base salary for " + employees[i]  + ": ");
            baseSalaries[i] = scanner.nextDouble();
            for (int j = 0; j < 12; j++) {
                System.out.print("Enter salary for month " + (j + 1) + ": ");
                monthlySalaries[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }
        System.out.println("\n--- Employee Salary Report ---");
        double totalAverageSalary = 0;
        double totalsal=0;
        double totalavgsalary=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Employee: " + employees[i]);
            System.out.println("Base Salary: " + baseSalaries[i]);
            for (i = 0; i < n; i++)
            { for (int j=0;j<12;j++)
            {   System.out.println("  Month " + (i + 1) + ": " + monthlySalaries[i][j]);
                 totalsal=totalsal+monthlySalaries[i][j];}
            System.out.println("Total Salary for the year: " + totalsal);
            double avergesal=totalsal/12;
            totalavgsalary=totalavgsalary+avergesal;
            System.out.println("Average monthly salary: " + avergesal);
            double bonus=baseSalaries[i]*0.1;
            System.out.println("Bonus: " + bonus);
        }}
        System.out.println("Average Monthly Salary for All Employees: " + (totalavgsalary / n));
        System.out.println("Thank you for using the Employee salary management system");

    }

}
