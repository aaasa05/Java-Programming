
package ControlStatement;
import java.util.Scanner;
public class CapitalSmall {
    public static void main(String[] args) {
        char ch;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any letter: ");
        ch = obj.next().charAt(0);
        
        if (ch>='A' && ch<='Z'){
            System.out.println("Capital letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Small letter");
        }
        else{
            System.out.println("Not a letter");
        }
     
    }
    
}
