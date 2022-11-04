
package ControlStatement;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("enter year: ");
        year = input.nextInt();
        
        if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
    
}
