
package looping;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i,sum = 0,n;
        System.out.print("Enter n: ");
        n = input.nextDouble();
        
        for ( i = 1 ; i <= n; i++) {
           sum = sum + i;
            System.out.print(" "+i);
            if(i<n){
                System.out.print(" + ");
            }
            
        }
        System.out.println(" = "+sum);
    }
    
}
