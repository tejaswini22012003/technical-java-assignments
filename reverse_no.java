
//reversing a number

import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        int rev = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int num = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("the reversal of " + num + " is = " + rev);
    }

}
