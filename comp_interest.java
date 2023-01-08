
import java.util.Scanner;

public class comp_interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the compound interest
        double interest = principal * Math.pow(1 + rate, years) - principal;

        System.out.println("Compound interest: " + interest);
    }
}
