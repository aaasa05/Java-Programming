
package inheritence1;

import java.util.Scanner;

class Calculation{
    int add(int x,int y){
        return x + y;
    }
    int sub(int x,int y){
        return x - y;
        
    }
    int mul(int a,int b){
        return a * b;
    }
    int div(int a,int b){
        return a / b;
    }
    
}
class Operation extends Calculation{
    int inc(int x,int y,char ch){
      if(ch == '+'){
        return  add(x,y);
      }
      else if(ch == '-'){
          return sub(x,y);
      }
      else if(ch == '*'){
          return mul(x,y);
      }
      else if(ch == '/'){
          return div(x,y);
      }
      else {
          return 0;
      }
      
    }
}

public class CalculatorConsol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,a;
         char ch;
         String s;
        s = input.next();
        x = Integer.parseInt(s);
        
        s = input.next();
        y = Integer.parseInt(s);
        
        s = input.next();
        ch =  s.charAt(0);
          
        Operation obj = new Operation();
        a  = obj.inc(x,y,ch);
        System.out.println(a);
        
        
        
        
    }
}
