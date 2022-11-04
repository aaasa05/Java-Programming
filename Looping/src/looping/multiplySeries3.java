
package looping;

import java.util.Scanner;

public class multiplySeries3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i,n,mul = 1;
        System.out.println("Enter n: ");
        n = input.nextDouble();
        
        for ( i = 1.5; i < n; i++) {
            System.out.print(i);
            mul = mul * i;
            if(i<n-1)
                System.out.print(" x ");
            
        }
        System.out.println(" ");
        System.out.println(" mul = "+mul);
    }
    
}
