
package basicjava1;

import java.util.Scanner;


public class M_N_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,flag=0,totalprime=0;
        System.out.println("Enter m: ");
        m = input.nextInt();
        System.out.println("Enter n: ");
        n = input.nextInt();
        
        for (int i = m; i <=n; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
                totalprime++;
            }
            flag=0;
        }
        System.out.println("total = "+totalprime);
    }
    
}
