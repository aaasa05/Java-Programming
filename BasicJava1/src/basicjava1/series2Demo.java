
package basicjava1;

import java.util.Scanner;


public class series2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,sum =1;
        System.out.println("Enter n: ");
        n = input.nextInt();
        
        for(i = 1; i<n ; i=i+1){
            if(i>1 && i<n){
                System.out.print(" X ");
            }
            System.out.print(i);
            sum = sum*i;
            
            
        }
        System.out.println(" ");
        System.out.println(sum);
    
    }
}
