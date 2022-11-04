
package looping;

import java.util.Scanner;


public class FactorialDemo {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int i,n,fact = 1;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i=n;i>=1;i--){
            System.out.print(i+" ");
            fact = fact * i;
            if(i>1)
                System.out.print(" x ");
            
        }
        System.out.println(" Fact = "+fact);
    }
    
    
}
