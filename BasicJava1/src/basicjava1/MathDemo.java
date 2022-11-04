
package basicjava1;


public class MathDemo {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        
        
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.abs(y));
        
        System.out.println(Math.pow(x, y));
        
        int round = Math.round(8.8f);
        System.out.println("round = "+round);
        
        System.out.println("pi = "+Math.PI);
        System.out.println("E = "+Math.E);
        
        
    }
    
}
