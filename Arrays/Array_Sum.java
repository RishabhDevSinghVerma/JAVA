/*
 * Given an array/list(arr) of size N, you need to find and print the sum of all the elements in * the array/list.
 */

import java.util.*;

public class Array_Sum {

    public static int[] take_input(int size) {
        Scanner take_input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = take_input.nextInt();
        }

        return arr;
    }

    public static void print_sum(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }

        System.out.print("The Sum of Array Elements is :"+sum);

    }

    public static void main(String args[]) {

        Scanner take_input = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int size = take_input.nextInt();
        int arr[] = take_input(size);
        print_sum(arr, size);

    }

}
