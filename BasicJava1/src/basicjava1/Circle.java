
package basicjava1;

import java.util.Scanner;


public class Circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius,area,pi=3.1416;
        
        System.out.println("Enter radious: ");
        radius = input.nextDouble();
         
        area = pi * radius*radius;
        System.out.println("Area of Circle: "+area);
    }
    
}
