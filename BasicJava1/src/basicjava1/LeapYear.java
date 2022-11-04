
package basicjava1;

import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("enter any year: ");
        year = input.nextInt();
        
        if(year%400==0){
            System.out.println("Leap year");
        }else if(year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap year");
        }
    }
    
}
