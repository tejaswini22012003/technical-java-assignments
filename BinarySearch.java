//Sorting an Array using Binary search

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("enter a number to search : ");
        int search_element = new java.util.Scanner(System.in).nextInt();
        for (int lb = 0, ub = arr.length - 1; lb <= ub;) {
            int middle = (lb + ub) / 2;
            if (arr[middle] == search_element) {
                System.out.println(search_element + " Found @ index " + (middle));
                System.exit(0);
            } else if (arr[middle] > search_element)
                ub = middle - 1;
            else
                lb = middle + 1;
        }
        System.out.println(search_element + " Not Found in array ");
    }
}