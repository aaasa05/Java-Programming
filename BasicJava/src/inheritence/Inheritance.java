package inheritence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zawad
 */


class GrandFather1 {
    void gfwealth() {
        System.out.println("GF Wealth");
    }
}
class Father1 extends GrandFather1 {
    Father1() {
        System.out.println("Father1 Constructor Called");
    }
    void fatwealth() {
        System.out.println("Fat Wealth");
    }
}
class Son1 extends Father1 {
    Son1() {
        System.out.println("Son1 Constructor Called");
    }
    void sonwealth() {
        System.out.println("Son Wealth");
    }
}
public class Inheritance {
    Inheritance(){
        System.out.println("Inheritance Constructor called.");
    }
    public static void main(String[] args) {
        //Inheritance inhObj = new Inheritance();
        Son1 Obj = new Son1();        
        Obj.sonwealth();
        Obj.fatwealth();
        Obj.gfwealth();
    }
}
