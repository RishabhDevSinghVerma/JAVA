/*You have been given a random integer array/list(ARR) of size N, and an integer X. You need   to search for the integer X in the given array/list using 'Linear Search'.You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1. */

package Arrays;

import java.util.*;

public class LinearSearch {
    public static int linear_search(int arr[], int x, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {

                return i;

            }

        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner take_input = new Scanner(System.in);

        System.out.print("Enter the Size of Array:");
        int size = take_input.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = take_input.nextInt();
        }

        System.out.print("Enter the key which you want to Search:");
        int x = take_input.nextInt();
        int result = linear_search(arr, x, size);
        System.out.print(result);

    }
}
