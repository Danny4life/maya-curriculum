package aston;

import java.util.Scanner;

public class MorgageLoanApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1️⃣ Get inputs from user
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter down payment: ");
        double downPayment = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // 2️⃣ Compute values
        double principal = loanAmount - downPayment;
        double monthlyRate = annualRate / 100 / 12;
        int totalMonths = years * 12;

        // Mortgage formula
        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalMonths))
                / (Math.pow(1 + monthlyRate, totalMonths) - 1);

        System.out.printf("\nMonthly Payment: $%.2f\n", monthlyPayment);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Month", "Interest", "Principal", "Balance");
        System.out.println("-----------------------------------------------------------");

        double balance = principal;

        // 3️⃣ Generate amortization table
        for (int month = 1; month <= totalMonths; month++) {
            double interestPaid = balance * monthlyRate;
            double principalPaid = monthlyPayment - interestPaid;
            balance -= principalPaid;

            if (balance < 0) {
                principalPaid += balance; // Adjust last payment
                balance = 0;
            }

            System.out.printf("%-10d $%-14.2f $%-14.2f $%-14.2f\n", month, interestPaid, principalPaid, balance);

            if (balance <= 0) {
                break;
            }
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Mortgage fully paid off!");
        input.close();


    }
}
