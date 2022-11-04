
package looping;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n,i,sum=0;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i=1;i<=n;i++){
            System.out.print(" "+i);
            sum = sum+i;
            if(i<n)
                System.out.print(" + ");
            
        }
        //System.out.println("\n");
        System.out.println(" = "+sum);
        
    }
    
}
