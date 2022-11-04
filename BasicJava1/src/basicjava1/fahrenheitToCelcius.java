
package basicjava1;

import java.util.Scanner;


public class fahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels,farn;
        System.out.println("Fahrenheit: ");
        farn = input.nextDouble();
        cels = (farn-32)/1.8;
        System.out.println("celcius: "+cels);
        
    }
    
}
