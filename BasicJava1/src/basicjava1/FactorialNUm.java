
package basicjava1;

import java.util.Scanner;

public class FactorialNUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,fact=1;
        System.out.println("Enterany positive  n: ");
        n = input.nextInt();
        
        for ( i = n; i >= 1; i--) {
            if(i<n && i>=1){
                System.out.print(" X ");
            }
            System.out.print(i);
            fact = fact * i;
            
        }
        System.out.println(" ");
        System.out.println("fact = "+fact);
    }
    
}
