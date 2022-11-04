
package basicjava1;

import java.util.Scanner;


public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int n,m;
        System.out.println("enter n");
        n = input.nextInt();//17
        
        System.out.println("enter m");
        m = input.nextInt();//20
       
       
        for (int j = n; j <= m; j++) {
             for (int i = 1; i <= 10; i++) {
         
                System.out.println(j +" X "+i+" = "+ j*i);
         
        } 
             System.out.println(" ");
        }
        
      
    }
    
}
