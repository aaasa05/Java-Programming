
package basicjava1;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,temp,r,reverse = 0;
        
        System.out.println("Enter num: ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp>0){
            r = temp%10;
            reverse = reverse *10 + r;
            temp = temp/10;
        }
        
        if(num==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
}
