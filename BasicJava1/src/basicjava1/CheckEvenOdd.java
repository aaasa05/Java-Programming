
package basicjava1;
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("enter num: ");
        num = input.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
    
}
