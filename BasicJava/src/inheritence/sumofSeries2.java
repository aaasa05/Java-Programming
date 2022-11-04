
package inheritence;

import java.util.Scanner;

class a{
    int i,n,sum = 0;
    String s;
    a(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
        
        
    }
    void y(){
        for(i =1;i<=n;i=i+2){
            System.out.print(i+"x"+i);
            sum = sum + i*i;
            if(i<n-1)
                System.out.print(" + ");
        }
        System.out.println(" = "+sum);
        
    }
    
}

public class sumofSeries2 extends a {
    public static void main(String[] args) {
        a obj = new a ();
        obj.y();
        
    }
    
}
