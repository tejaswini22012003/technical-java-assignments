/*  java program:
statement: You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?  */

import java.util.*;

public class step_Count {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int p = 1;
        int q = 1;
        for (int i = 2; i <= n; i++) {
            int r = p + q;
            q = p;
            p = r;
        }
        System.out.println(p);
    }

}