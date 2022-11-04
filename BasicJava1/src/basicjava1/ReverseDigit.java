
package basicjava1;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int reverse = 0;
        int num,rem;
        
        System.out.println("Enter num: ");
        num = input.nextInt();
        
        while(num>0){
            rem = num%10;
            reverse = reverse * 10 + rem ;
            num = num/10;
        }
        System.out.println("reverse = "+ reverse);
    }
    
}
