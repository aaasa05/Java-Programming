
package looping;

public class SumEven {
    public static void main(String[] args){
        
        int i,sum = 0;
        for ( i = 1; i < 10; i++) {
           
            if(i%2==0){
             sum = sum + i;  
            }
        }
        System.out.println("sum = "+sum);
    }
}
   
