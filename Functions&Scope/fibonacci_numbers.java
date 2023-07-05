/* Given a number N, figure out if it is a member of fibonacci series or not. Return true if the 
  number is member of fibonacci series else false.
*/
import java.util.*;

public class fibonacci_numbers
 {
    
     public static boolean check_member (int number)
    {
       int i,a,b,result;
       a=0;b=1;result=0;
       for( i=a;i<=number;i++){
         System.out.println(result);
        a=b;
         b=result;
          result=a+b;
       
       }
       if(number==result){
       
        return true;
        
       }
       else{
        return false;
       }
       
    }

    public static void main(String args[])
    {
        int number;
        Scanner take_input=new Scanner(System.in);
        number=take_input.nextInt();
        check_member(number);

    }
}
