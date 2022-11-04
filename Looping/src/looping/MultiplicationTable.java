
package looping;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
       int i,j,n,m;
       Scanner input = new Scanner(System.in);
        System.out.println("enter m: ");
        m = input.nextInt();
         System.out.println("enter n: ");
        n = input.nextInt();
        for(j = m;j<=n;j++){
              for(i =1;i <=10;i++){
           System.out.println(j+" X "+i +" = "+j*i );
       }
               System.out.println("\n\n");
        }
       
     
    }
    
    
}
