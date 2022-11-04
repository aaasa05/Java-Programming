
package basicjava1;

import java.util.Scanner;


public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,sum=0;
        System.out.println("Enter n: ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i++) {
           
            if(  i>1.5 && i<=n){
                System.out.print(" + ");
            }
             System.out.print(" "+i);
             sum+=i;
        }
        System.out.println(" sum = "+sum);
    }
    
}
