
package GetInput;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a: ");
        a = obj.nextInt();
        System.out.println("enter b: ");
        b = obj.nextInt();
        
        c = a+b;
        System.out.println("sum = "+c);
        
         c = a-b;
        System.out.println("sub = "+c);
        
         c = a*b;
        System.out.println("mul = "+c);
        
       double c1 = (double)a / b;
        System.out.println("div = "+c1);//Type casting
        
         c = a%b;
        System.out.println("rem = "+c);
    }
    
}
