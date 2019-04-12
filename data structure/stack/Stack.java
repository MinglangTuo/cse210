/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.adt;

/**
 *
 * @author 13982
 */
public class Stack{

    private int top = 0;
    
    int stack[] = new int[5];
            
    public void push(int data){
        if(top == 5){
            System.out.println("overflow");
        }else{
        
        stack[top] = data;
        System.out.println("the "+top+" element ("+data+") has push!");
        top++;}
    }
    
    public void pop(){
        if(isEmpty()){
            System.out.println("there is no element in the stack");
        }else{
        int data;
        data = stack[top-1];
        stack[top-1] = 0;
        System.out.println("the element ("+data+") has pop!");
        top--;}
    }
    
    public int peek(){
        int data;
        data = stack[top-1];
        System.out.println("the"+" peek is "+data);
        return data;
        
    }
    
    public int size(){
        System.out.println(top);
        return size();
    }
    
    public boolean isEmpty(){
        if(top == 0){
            System.out.println("The stack is empty");
            return true;
        }
        System.out.println("the stack is not empty");
        return false;
    }
    
    public void show(){
        System.out.println("all the elements in the stack: ");
        for(int n:stack){
            System.out.print(n+" ");
        }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
  
    
}
