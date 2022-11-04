
package inheritence;

import java.util.Scanner;

class c{
    int i,n,sum = 0,r,temp;
    String s;
    
    c(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
        
        
    }
    void x(){
        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(" Sum = "+sum);
        
    }
}

public class SumofDigit extends c  {
    public static void main(String[] args){
        c obj = new c();
        obj.x();
        
        
        
        
    }
    
}
