
package ControlStatement;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter num: ");
        num = input.nextInt();
        
        if(num%2==0){
        System.out.println("even");
        }
        else{
        System.out.println("odd");
        }
        
    }
    
}
