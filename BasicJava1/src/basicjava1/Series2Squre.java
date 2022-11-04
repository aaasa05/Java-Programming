
package basicjava1;
import java.util.Scanner;
public class Series2Squre {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n,sum = 0;
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for(i = 1;i<=n;i++){
            if(i>1 && i<=n){
                System.out.print(" + ");
            }
            System.out.print(i+"X"+i+" ");
            sum = sum + i*i;
        }
        System.out.println(" ");
        System.out.println("sum = "+sum);
                
    }
    
}
