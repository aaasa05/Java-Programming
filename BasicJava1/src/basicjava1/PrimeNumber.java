
package basicjava1;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,flag = 0;
        System.out.println("Enter any  positive num: ");
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                flag = 1;
                break;
                
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }else
            {
            System.out.println("Not Prime");
                    }
        
    }
    
}
