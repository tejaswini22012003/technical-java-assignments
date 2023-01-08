//Write a program that takes an unsigned integer and print the number of '1' bits it has

import java.util.Scanner;

public class count_1s {
    public static void main(String[] args) {
        String str = new java.util.Scanner(System.in).next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
            sum += (int) str.charAt(i) - '0';
        System.out.println(sum);
    }
}