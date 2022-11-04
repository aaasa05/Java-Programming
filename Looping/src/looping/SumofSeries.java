
package looping;

import java.util.Scanner;


public class SumofSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,sum=0,n;
        
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i=2;i<=n;i=i+2){
            sum = sum + i;
            System.out.print(" "+i);
            if(i<n-1){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
}
