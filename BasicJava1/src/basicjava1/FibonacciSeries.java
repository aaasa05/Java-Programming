
package basicjava1;

import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int first=0 ,second=1, fibo=0, num;
        
        System.out.println("How many num: ");
        num = input.nextInt();
        
        System.out.print(first+" "+second);
        
        
        for (int i = 3; i <= num; i++) {
            
        

             fibo = first  + second;
             System.out.print(" "+fibo);
             first=second;
             second= fibo;
           
           
        }
        System.out.println(" ");
       
    }
    
}
