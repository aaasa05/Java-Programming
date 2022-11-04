
package basicjava1;

import java.util.Scanner;

public class ArithmaticDemo {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
        int num1,num2,result;
       
        System.out.print("enter two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("sum = "+result);
        
        result = num1 - num2;
        System.out.println("sub = "+result);
        
        result = num1 * num2;
        System.out.println("mul = "+result);
        
     double result2 = (double)num1 / num2;
        System.out.println("div = "+result2);
        
        result = num1 % num2;
        System.out.println("mod = "+result);
        
    }
    
}
