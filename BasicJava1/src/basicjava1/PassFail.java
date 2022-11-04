package basicjava1;
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args){
        
      Scanner input = new Scanner(System.in);
      int mark;
        System.out.println("enter any mark: ");
        mark =input.nextInt();
        
        if(mark>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }
    }
    
}
