/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse210.lecture;

/**
 *
 * @author 13982
 */

    /*Like C++, in Java, an instance of an abstract class cannot be created, we can have references of abstract class type though*/
    
    abstract class Base{
        Base(){ System.out.println("Base Constructor Called"); } // Like C++, an abstract class can contain constructors in Java. And a constructor of abstract class is called when an instance of a inherited class is created. For example, the following is a valid Java program.
        abstract void fun();
    }
    
    class Derived extends Base{
        Derived() { System.out.println("Derived Constructor Called"); } 
        void fun(){
            System.out.println("Derived fun() called");
        }
    }


/* In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.*/
abstract class Base1{
        void fun(){ System.out.println("Base1 fun() called"); }
}

class Derived1 extends Base1{ }


/*Abstract classes can also have final methods (methods that cannot be overridden). For example, the following program compiles and runs fine.*/
abstract class Base2{
       final void fun(){ System.out.println("Base2 fun() Called"); }
}

class Derived2 extends Base2 {} 



    public class abstract_class {
        public static void main(String args[]){
            //Base b = new Base();   cause abstract class cannot instance !
            
            Base b = new Derived();  //we can references of Base type
            b.fun();
            
            Derived1 d = new Derived1(); 
            d.fun();
            
            Base2 e = new Derived2();
            e.fun();
            
        }
    }
    
    
    
    
    
}
