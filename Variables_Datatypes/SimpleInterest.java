/* Simple Interest
 Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

Note: Print the answer as Floor integer value.
Input Format:

The first line of input contains a single integer Principal amount. 
The Second line of input contains a single decimal Rate of interest.
The Third line of input contains a single Integer Time period.
Output Format:

Calculate the Simple Interest and print it.

Sample Input 1:
2000
2.2
4
Sample Output 1:
176


Formula
A = P (1 + rt)
A	=	final amount
P	=	initial principal balance
r	=	annual interest rate
t	=	time (in years)

 */

 import java.util.*;
 class SimpleInterest{

    public static void main(String[] args)
    {
        Scanner take_input=new Scanner(System.in);
        System.out.print("Enter the Principal Amount:");
        int principal =take_input.nextInt();

        System.out.print("Enter the Rate of Interst:");
        float interest=take_input.nextFloat();

        System.out.print("Enter the period of Time:");
        int period=take_input.nextInt();

        double simpleInterest=0;
        simpleInterest=(principal*interest*period)/100;

        System.out.print(simpleInterest);


    }
 }

