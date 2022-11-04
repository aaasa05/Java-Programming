
package basicjava1;

import java.util.Scanner;


public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,sum=0,r,temp;
        
        System.out.println("Enter n: ");
        num = input.nextInt();
        
        temp = num;
        
        while(num>0){
            r = num%10;
            sum = sum + r * r * r ;
            num = num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
