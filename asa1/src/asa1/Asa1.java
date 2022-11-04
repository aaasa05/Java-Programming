
package asa1;

import java.util.Scanner;

class a{
    String s;
    int i,n,b;
    a(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
        
    }
    void x(){
      
       for(i=1;i<=n;i++){
            if(i%2==0){
            System.out.print(i+" ");
            }
        }
          System.out.println("");
       for(i=1;i<=n;i++){
            if(i%2!=0){
            System.out.print(i+" ");
       
          }
       }
       
          
       System.out.println("");
        
        
    }
    void x(int b){ //overloading
       
      
       
         System.out.println(b);
        
    }
}


public class Asa1 extends a{
   
    public static void main(String[] args) {
        a obj = new a();
        obj.x();
        obj.x(3 );
        
     
    }
    
}
