//Program to reverse the array 

import java.util.Scanner;

public class array_reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n / 2; i++)
            a[i] = a[i] + a[n - i - 1] - (a[n - i - 1] = a[i]);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

}
