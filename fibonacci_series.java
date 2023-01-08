
//fibonacci series
import java.util.*;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        System.out.println("fibonacci series :");
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 2; i < n; i++) {
            int f3 = f1 + f2;

            System.out.print(f3 + " ");

            f1 = f2;
            f2 = f3;
        }

    }
}