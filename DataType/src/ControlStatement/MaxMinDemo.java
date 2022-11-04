
package ControlStatement;

import java.util.Scanner;



public class MaxMinDemo {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a: ");
        a = obj.nextInt();
        System.out.println("enter b: ");
        b = obj.nextInt();
        
        if(a>b){
            System.out.println("a is maximum");
        }
        else if(b>a){
            System.out.println("b is maximum");
        }
        else{
            System.out.println("equal");
        }
    }
    
}
