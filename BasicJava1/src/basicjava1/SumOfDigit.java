
package basicjava1;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum =0,r,temp,num;
        
        System.out.println("Enter num: ");
        num = input.nextInt();
        //temp = num;
        while(num>0){
            r = num%10;
            sum = sum+ r;
            num = num/10;
        }
        System.out.println("sum = "+sum);
        
    }
            
    
}
