
package GetInput;

import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        double farn,cel;
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter fahrenheit: ");
        farn = input.nextDouble();
        
        cel =(farn-32) /1.8;
        System.out.println("celsius: "+cel);
        
        
    }
    
}
