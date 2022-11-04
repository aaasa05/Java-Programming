
package looping;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int i,n,flag = 0;
     
     System.out.print("Enter n: ");
     n = input.nextInt();
     
     for(i = 2;i < n;i++){
         if(n % i == 0){
            
             flag = 1;
             break;
         }
     }
     if(flag == 0){
         System.out.println("Prime");
     }
     else{
         System.out.println("Not Prime");
     }
    }
    
}
