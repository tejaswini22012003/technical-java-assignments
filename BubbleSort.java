//Sorting array using Bubble sort 

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 4, 255, 17, 76, 3, 98, 92 };
        // implementing bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j])
                    // swapping array elements
                    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
        // printing the sorted elements
        for (int index = 0; index < arr.length; index++)
            System.out.print(arr[index] + " ");

    }
}