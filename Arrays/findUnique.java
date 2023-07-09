/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list. */

package Arrays;
import java.util.*;
public class findUnique {
    public static void main(String args[])
    {
       Scanner take_input=new Scanner(System.in);
       System.out.print("Enter the Size of the Array");
       int n=take_input.nextInt();

       int arr[]=new int[n];
      
       int m=0;
       for(int i=0;i<n;i++)
       {
          arr[i]=take_input.nextInt();
          m=arr[i];
          for (int j=0;j<n;j++)
          {
              if(m==arr[j])
              {
                  continue;
              }

              else{
                System.out.print(arr[j]);
              }

          }
         
       }
     
       
       

       
    }
    
}















































