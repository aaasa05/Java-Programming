
package basicjava1;
import java.util.Scanner;

public class POsitiveDemo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("enter num: ");
        num = input.nextInt();
        
        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        
        
    }
    
}
