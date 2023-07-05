package Arrays;

import java.util.Scanner;

public class FindLargestElement
 {

     public static int[] take_input(int size) {
        Scanner take_input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = take_input.nextInt();
        }

        return arr;
    }

    public static void print_largestElement(int size,int arr[])
    {
        int max=Integer.MIN_VALUE;
          for(int i=0;i<size;i++)
          {
            
            if(arr[i]>max){
                max=arr[i];
            }
            
          }
          System.out.print(max);
    }
     public static void main(String args[])
     {
       
        Scanner take_input = new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int size = take_input.nextInt();
         int arr[] = take_input(size);
         print_largestElement(size,arr);
     }
}
