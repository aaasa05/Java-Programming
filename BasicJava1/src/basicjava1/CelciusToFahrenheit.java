
package basicjava1;

import java.util.Scanner;


public class CelciusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double cels,farn;
        System.out.print("Celcius: ");
        cels = input.nextDouble();
        farn = (1.8 * cels) + 32;
        System.out.println("Fahrenheit: "+farn);
        
    }
    
}
