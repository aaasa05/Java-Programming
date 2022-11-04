
package looping;

import java.util.Scanner;


public class Series3 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int i,sum=0,n;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i = 1;i <= n; i++){
            sum = sum+ i*i;
            System.out.print(i+"*"+i );
            if(i<n){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
    
}
