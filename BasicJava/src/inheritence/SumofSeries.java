
package inheritence;

import java.util.Scanner;

class B{
    int i,n,sum = 0;
    String s;
    B(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
        
        
    }
    void x(){
        for(i=1;i<=n;i = i+2){
            
            System.out.print(i);
            sum = sum + i;
            
            if(i<n-1){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);    
        
    }
    
}


public class SumofSeries extends B {
    public static void main(String[] args) {
        SumofSeries obj = new SumofSeries();
        obj.x();
        
    }

    void y() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
