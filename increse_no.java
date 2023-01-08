import java.io.*;
import java.util.*;

class increse_no {
    public static void main(String[] args) {
        int a[] = { 10, 12, 5 };

        Arrays.sort(a);
        System.out.println("array elements in increasing order:");
        for (int i = 0; i < 3; i++)
            System.out.print(a[i] + " ");
    }
}