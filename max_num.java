//print max value of n numbers

import java.util.*;

public class max_num {
    public static void main(String[] args) {

        int max = 0;
        int num;
        System.out.println("enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the elements :");
        num = sc.nextInt();
        max = num;
        for (int i = 1; i < n; i++) {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }

        }
        System.out.println("the greatest number : " + max);

    }

}
