
package basicjava1;

import java.util.Scanner;


public class SumOfNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n,m,sum = 0;
        System.out.println("enter m and n: ");
        n = input.nextInt();
        m = input.nextInt();
        
        for (int i = n; i <= m; i++) {
            if(i%2!=0){
                sum += i; 
                System.out.println(" "+i);
            }
           
        }
        System.out.println(sum);
    }
    
}
