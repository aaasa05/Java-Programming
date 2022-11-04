
package inheritence;

import java.util.Scanner;

class b{
    int i,n,temp,r,reverse = 0;
    String s;
     b(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
        temp = n;
        
    }
     void y(){
       
        while(n>0){
            r = n % 10;
            reverse = r + (reverse*10);
            temp = n / 10;
        }
        if(temp == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        
        
          
     
   
   
}


public class Palindrome extends b{
    
   
    } 
        
         public static void main(String[] args) {
        b obj = new b();
        obj.y();
        
        
}
   
    
}
