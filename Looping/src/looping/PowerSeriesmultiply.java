
package looping;

import java.util.Scanner;


public class PowerSeriesmultiply {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n,mul = 1;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i=1;i<=n;i++){
            System.out.print(i);
            mul = mul * i*i;
            if(i<n){
                System.out.print(" x ");
                
            }
        }
        System.out.println(" mul : "+mul);
        
    }
    
}
