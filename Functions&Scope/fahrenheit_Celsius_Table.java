/*Fahrenheit to Celsius Table
 * 
 * Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
 * you need to convert all Fahrenheit values from Start to End at the gap of W, into their 
 * corresponding Celsius values and  print the table.
 */

import java.util.*;

class fahrenheit_Celsisus_Table {

    public static void print_Table(int s,int e,int w) 
    {
        System.out.println("Fahrenheit to Celsius Table");
         for(int i=s;i<=e;i=i+w){
            int result=(i-32)*5/9;
            System.out.println(i+"\t"+result);
         }
    }

    public static void main(String args[]) {
        Scanner take_input = new Scanner(System.in);
        int s = take_input.nextInt();
        int e = take_input.nextInt();
        int w = take_input.nextInt();

        print_Table(s,e,w);
    }
}