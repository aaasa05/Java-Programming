
package ConditionalOPerator;

public class MathDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = -30;
        int c = 3;
        
        int max = Math.max(a, b);
        System.out.println("maximum = "+max);
        
        int min = Math.min(a, b);
        System.out.println("minimum = "+min);
        
        int abs = Math.abs(b);
        System.out.println("absolute = "+abs);
        
        double pow = Math.pow(a, c);
        System.out.println("a to the power c = "+pow);
        
        int round = Math.round(8.5f);
        System.out.println("round = "+round);
        
        System.out.println("pi = "+Math.PI);
        
        System.out.println("E = "+Math.E);
    }
    
}
