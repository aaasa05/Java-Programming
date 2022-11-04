//how to get user input
package GetInput;

import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        
    
     int num;
     String s;
     double d;
     Scanner input = new Scanner(System.in);
     
      System.out.println("enter any name: ");
     s = input.nextLine();
     
     System.out.print("enter integer num: ");
     num = input.nextInt();
     
    
     
    // System.out.println("enter double value: ");
    // d = input.nextDouble();
    
        System.out.println("number = "+num);
        System.out.println("name = "+s);
        //System.out.println("double = "+d);
    }

}