
package looping;

import java.util.Scanner;


public class EvenOddmultiply {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n,mul = 1;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i = 1;i <= n;i++){
            if(i%2==0){
                System.out.print(i); 
                mul = mul * i;
                if(i<n-1)
                    System.out.print(" x ");
            }
           
        }
        System.out.println(" mul = "+mul);
        System.out.println(" \n ");
        
          for(i = 1;i <= n;i++){
            if(i%2!=0){
                System.out.print(i); 
                mul = mul * i;
                if(i<n-1)
                  System.out.print(" x ");
            }
            
          }
          
        
        System.out.println(" mul = "+mul);
     }
}