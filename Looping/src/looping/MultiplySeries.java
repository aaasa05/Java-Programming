
package looping;

import java.util.Scanner;


public class MultiplySeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,result = 1;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i = 1; i <= n; i++){
          
                System.out.print(i);
                result = result * i;
         
            if(i<n)
                System.out.print (" x ");
            
        }
        System.out.println();
        System.out.println("result = "+result);
        
               
        
    }
    
}
