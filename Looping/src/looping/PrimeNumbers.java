
package looping;

import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,j,m,n,flag = 0,totaldigit=0,total=0;
        
        System.out.println("enter m: ");
        m = input.nextInt();
        
        System.out.println("Enter n: ");
        n = input.nextInt();
        
        for(i = m;i <= n;i++){
            flag = 0;
            for(j = 2 ; j<i;j++){
                if(i%j ==0){
                 flag = 1;
                 break;
                }
            }
            if(flag==0){
                System.out.print(i + " ");
                totaldigit++;
                
            } else {
           
                //System.out.println(i+" ");
                total++;
            }
           
        }
         System.out.println(" total prime: "+totaldigit);
         System.out.println(" \n ");
        
         System.out.println(" not prime: "+total);
        
           // flag = 0; 
    }
    
}
