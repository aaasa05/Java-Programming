
package inheritence;

import java.util.Scanner;

class A{
    int i,n,m,flag = 0;
    String s;
    A(){
        Scanner input = new Scanner(System.in);
    
        
        System.out.print("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
        
        
    }
    void x(){
        for(i = 2;i < n;i++){
            if(n % i == 0){
                flag = 1;
                break;
                
            }
            
        }
         if(flag == 0){
            System.out.println("prime");
    }else{
            System.out.println("Not Prime");
         }
        
    }
}

public class PrimeNum extends A {
    
  
    public static void main(String[] args) {
        
        PrimeNum obj = new PrimeNum();
        obj.x();

        
    }
    
}
