
package basicjava1;
import java.util.Scanner;
public class UserINput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        String name;
        double d;
        
        System.out.print(" enter  your Name: ");
        name = input.nextLine();
        
         System.out.print("enter any number: ");
         num = input.nextInt();
         System.out.println("Enter any double value: ");
         d = input.nextDouble();
        
       
       
        System.out.println(" Welcome: " + name);
        System.out.println("Number = "+num);
        System.out.println("double = "+d);
       
    }
    
}