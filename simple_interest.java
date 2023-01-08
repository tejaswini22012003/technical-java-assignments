// program to find compound interest

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the simple interest
        double interest = principal * rate * years;

        System.out.println("Simple interest: " + interest);
    }
}
