
package looping;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
        int i,m,n,sum=0;
        
        System.out.println("enter m: ");
        m = input.nextInt();
        
        System.out.print("enter n: ");
        n = input.nextInt();
       
        for(i=m;i<n;i++){
           if(i%2!=0){
                System.out.println(i);
                sum = sum + i;
        }
            
        }
        System.out.println("sum = "+sum);
        
    }
}
