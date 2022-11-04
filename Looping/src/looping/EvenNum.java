
package looping;

import java.util.Scanner;



public class EvenNum {
    public static void main(String[] args) {
        int i,n,m;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter m: ");
        m = input.nextInt();
        
        System.out.println("enter n: ");
        n = input.nextInt();
        System.out.println("\n");
        for(i=m;i<=n;i=i=i+2){
           System.out.println(i); 
          
        }
       
    }
}
             
            
      
