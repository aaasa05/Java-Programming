
package basicjava1;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.println("enter any three numbers: ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        
        if(a>b && a>c){
            System.out.println("a");
        }else if(b>a && b>c){
            System.out.println("b");
        }else{
            System.out.println("c");
        }
     
       
    }
    
}
