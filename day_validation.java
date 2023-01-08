//date validation program in java

import java.util.*;

public class day_validation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid day month year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (month == 1) {
            month = 13;
            year--;
        }

        if (month == 2) {
            month = 14;
            year--;
        }

        int k = year % 100;
        int j = year / 100;
        int h = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j + 1) % 7;
        switch (h) {
            case 0:
                System.out.println("today is friday");
                break;
            case 1:
                System.out.println("today is saturday");
                break;
            case 2:
                System.out.println("today is sunday");
                break;
            case 3:
                System.out.println("today is monday");
                break;
            case 4:
                System.out.println("today is tuesday");
                break;
            case 5:
                System.out.println("today is wednesday");
                break;
            default:
                System.out.println("today is thursday");
        }
        sc.close();
    }
}
