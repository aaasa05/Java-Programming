
package looping;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        int i,n,first = 0,second = 1,fibo;
        
        System.out.print("How many numbers: ");
        n = input.nextInt();
        
        System.out.print(first + " "+ second);
        for(i=3;i<=n;i++){
            fibo = first + second;
            
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println();
       
            
    }
           
    
}
