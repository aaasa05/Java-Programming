
package basicjava1;

import java.util.Scanner;

public class Series3Gunottor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,sum = 1;
        System.out.println("Enter n: ");
        n = input.nextInt();
        
        for ( i = 1; i <= n; i++) {
            if(i>1 && i<=n){
                System.out.print(" X ");
            }
            System.out.print(i);
            System.out.print("^2");
            sum = sum * i*i;
            
        }
        System.out.println(" ");
        System.out.println(sum);
        
    }
    
}
