
package oop;

public class Teacher_Obj {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        
        teacher1.name = "Afroza Asa";
        teacher1.age = 19;
        teacher1.phone = 117351149;
        
        Teacher teacher2 = new Teacher();
        
        teacher2.name = "Asa";
        teacher2.age = 19;
        teacher2.phone = 1147050;
        
        System.out.println("name = "+teacher1.name);
        System.out.println("age = "+teacher1.age);
        System.out.println("Phone = "+teacher1.phone);
        
        System.out.println("name = "+teacher2.name);
        System.out.println("age = "+teacher2.age);
        System.out.println("Phone = "+teacher2.phone);
        
    }
    
}
