//program to check whether a number is positive or negative or zero

import java.util.Scanner;

class sign_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println(n + " is POSITIVE NUMBER");
        else if (n < 0)
            System.out.println(n + " is NEGATIVE NUMBER");
        else
            System.out.println("IT's ZERO");

    }
}