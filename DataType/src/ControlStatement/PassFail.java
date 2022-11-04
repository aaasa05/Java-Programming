
package ControlStatement;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);
        System.out.println("enter mark: ");
        mark = input.nextInt();
        
        if(mark>=33){
            System.out.println("pass");
        }
        
        else{
            System.out.println("fail");
        }
    }
    
}
