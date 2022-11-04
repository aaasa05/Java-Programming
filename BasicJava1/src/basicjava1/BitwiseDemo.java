
package basicjava1;


public class BitwiseDemo {
    public static void main(String[] args){
        int a = 32;
        int b = 12;
        int c;
        
        c = a & b;
        System.out.println("a & b = "+c);
        
        c = a | b;
        System.out.println("a | b = "+c);
        
        c = a ^ b;
        System.out.println("a ^ b = "+c);
        
        c = b>>3;
        System.out.println("a ^ b = "+c);
        
        c = a<<2;
        System.out.println("a ^ b = "+c);
        
        
                
    }
}
