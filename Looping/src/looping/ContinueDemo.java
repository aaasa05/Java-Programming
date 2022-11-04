
package looping;

public class ContinueDemo {
    public static void main(String[] args) {
        int i;
        for( i=1;i<=19;i=i+3){
            if(i==11){
                continue;
            }
           System.out.println(i);
        }
         
    }
    
}
