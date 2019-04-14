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
public class staticBinding_dynamicBinding {

    /**
     * @param args the command line arguments
     */
    
    /*static binding*/
    public static class superclass{
        static void print(){
            System.out.println("print in superclass.");
        }
    }
    
    public static class subclass extends superclass{
        static void print(){
            System.out.println("print in sub class");
        }
    }
    
    /*dynamic binding*/
    public static class superclass_{
         void print() 
        { 
            System.out.println("print in superclass."); 
        } 
    }
    
    
    public static class subclass_ extends superclass_{
        @Override
        void print(){
              System.out.println("print in subclass."); 
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        superclass A = new superclass();
        superclass B = new subclass();   //the print method from superclass
        subclass C = new subclass();      
        
        A.print();
        B.print();
        C.print();   //static binding
        
        superclass_ D = new superclass_();
        superclass_ E = new subclass_();   
        
        D.print();
        E.print();
        
        
    }
    
}
