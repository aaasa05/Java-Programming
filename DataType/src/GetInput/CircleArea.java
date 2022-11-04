
package GetInput;

import java.util.Scanner;

        

public class CircleArea {
    public static void main(String[] args){
        
       
        double radius,area;
         Scanner obj = new Scanner(System.in);
       System.out.print("enter radius: ");
        radius = obj.nextDouble();
         area = 3.1416 * radius*radius;
         
         System.out.println("Area of circle: "+area);
        
        
        
        
    }
    
}
