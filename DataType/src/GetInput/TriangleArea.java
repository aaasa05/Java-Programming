
package GetInput;
import java.util.Scanner;

public class TriangleArea 
{
 public static void main(String[] args){
     double area,base,height;
     
     Scanner input = new Scanner(System.in);
     System.out.print("enter base: ");
     base = input.nextDouble();
     
     System.out.print("enter height: ");
     height = input.nextDouble();
     
     area = 0.5 * base * height;
     System.out.println("area of triangle: "+area);
     
 }
    
}
