//Merging two arrays

import java.util.Scanner;

public class Merging_arrays {
    public static void main(String[] args) {
        int[] a = { 3, 12, 45, 22 }, b = { 22, 62, 5, 9 };
        int size1 = 4, size2 = 3, i, j, k;
        int[] c = new int[size1 + size2];
        for (i = 0, j = 0, k = 0; i < size1 && j < size2; k++) {
            if (a[i] > b[j])
                c[k] = b[i++];
            else
                c[k] = a[i++];
        }
        while (i < size1)
            c[k++] = a[i++];
        while (j < size2)
            c[k++] = b[j++];
        for (int index = 0; index < c.length; index++)
            System.out.println(c[index]);
    }

}