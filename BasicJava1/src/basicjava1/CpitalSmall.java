
package basicjava1;
import java.util.Scanner;

public class CpitalSmall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        
        char ch;
        System.out.println("enter any letter: ");
        ch = input.next().charAt(0);
        
        if(ch>='A' && ch<='Z'){
            System.out.println("Capital");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Small");
        }else{
            System.out.println("not a letter");
        }
    }
    
}
