
package Asa;
import java.util.Scanner;

class e{
    int n,temp,r,reverse = 0;
    String s;
    
    e(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        s = input.next();
        n = Integer.parseInt(s);
     //  n = input.nextInt();
        temp = n;
        
    }
    void y(){
       
        while(temp>0){
            r = temp%10;
            reverse = reverse*10 + r;
            temp =  temp/10;
        }
        if(n==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        
        
        
    }
    void y(int a){
        System.out.println(a);
    }
}


public class Asa {

  
    public static void main(String[] args) {
         e obj = new e();
         obj.y();
         obj.y(4);
    
    
    }
    
}
