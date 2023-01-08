//print least value of n numbers

import java.util.*;

public class least_num {
    public static void main(String[] args) {

        int min = 0;
        int num;
        System.out.println("enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the elements :");
        num = sc.nextInt();
        min = num;
        for (int i = 1; i < n; i++) {
            num = sc.nextInt();
            if (num < min) {
                min = num;
            }

        }
        System.out.println("the least number : " + min);

    }

}
