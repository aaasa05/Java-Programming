
package looping;

public class BreakDemo {
    public static void main(String[] args){
         
        for(int i=1;i<=100;i=i+2){
            if(i==9){
                break;
                
            }
            System.out.println(i);
        }
    }
    
}
