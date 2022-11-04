//wap to find all even and odd numbers between a given range.
package day1;

import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        int i,x,y;
         String s;
        Scanner input = new Scanner(System.in);
       
        
        s = input.next();
        x = Integer.parseInt(s);
        
         s = input.next();
        y = Integer.parseInt(s);
        
      
        for(i=x;i<=y;i++){
            if(i%2 == 0){
                System.out.println("even:" +i);
            }
          
            else{
                System.out.println("odd:" +i);
            }
        }
     
       
    }  
            }
        
       
  
