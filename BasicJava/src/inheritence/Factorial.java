
package inheritence;

import java.util.Scanner;

class d{
    int i,n,fact = 1;
    String s;
    d(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ener n: ");
        s = input.next();
        n = Integer.parseInt(s);
        
    }
    void x(){
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            
        }
        System.out.println(" = "+fact);
        
        
    
}
}


public class Factorial extends d {
    public static void main(String[] args) {
        d obj = new d();
        obj.x();
        
        
    }
    
    
}
