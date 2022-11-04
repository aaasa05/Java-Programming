
package looping;

import java.util.Scanner;


public class DecrementSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,sum = 0;
        
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i = 10;i >=n ; i--){
            System.out.print(" "+i);
            if(i>n){
                System.out.print(" + ");
              
            }
            
        }  
        System.out.println( );
    }
    
}
