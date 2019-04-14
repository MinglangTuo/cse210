/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse210.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author 13982
 */
public class iterating_over_arraylist {
    
    /*for loop*/
    public void for_loop(){
     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        
        for(int i = 0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
    }
    }
     /*for each-loop*/
    public void each_loop(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        for(Integer i: numbers)
            System.out.print(i+" ");
    }
    
    /*Iterator*/
    public void Iterator(){
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
    Iterator it = numbers.iterator();
    while(it.hasNext())
        System.out.print(it.next()+" ");
    }
    
    /*ListIterator*/
    public void ListIterator(){
    
       ArrayList<String> list = new ArrayList<String>();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       
       ListIterator iterator = list.listIterator();
       
       while(iterator.hasNext())
           System.out.print(iterator.next()+" ");   //forward direction for list element
       
       while(iterator.hasPrevious())
            System.out.print(iterator.previous()+" ");
       
       
    }
    
    /*convert an iterator to a list in java*/
    public static <T> List<T>getListFromIterator(Iterator<T> iterator){
        List<T> list = new ArrayList<>();
        
        // Add each element of iterator to the List 
        iterator.forEachRemaining(list::add);
        
        return list;
    
    }
    
    
    
    
    
    public static void main(String[] args){
       
        }
    }
}
