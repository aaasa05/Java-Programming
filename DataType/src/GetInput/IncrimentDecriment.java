
package GetInput;


public class IncrimentDecriment {
    public static void main(String[] args){
     int y, x = 20; 
     
     y = x++;
     System.out.println("y: "+y);//20
     
     y = x;
     System.out.println("y: "+y);//21
     
     y = ++x;
    System.out.println("y: "+y);//22
    
     y = x;
    System.out.println("y: "+y);//22
    
     y = x--;
    System.out.println("y: "+y);//22
    
     y = --x;
        System.out.println("y: "+y);//20
        
     y = x;
     System.out.println("y: "+y);//20
     
     y = x--;
        System.out.println("y: "+y);//20
        
     y = x++;
        System.out.println("y: "+y);//19
     
    }
}
