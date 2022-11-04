
package GetInput;

import java.util.Scanner;


public class CelciustoFarenhite {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double cel,farn;
        System.out.println("enter celcius: ");
        cel = input.nextDouble();
        
        farn = 1.8 * cel + 32;
        System.out.println("fahrenheit: "+farn);
        
    }
    
}
