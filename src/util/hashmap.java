/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Tyler.Tuo
 */
public class hashmap {
    
    public static void main(String[] args){
        
        HashMap<String,Integer> map = new HashMap<>();
        
        print(map);
        map.put("vishal",10);
        map.put("sachin",30);
        map.put("vasibh",20);
        
        System.out.println("Size of map is:- "+map.size());
        
        print(map);
        if(map.containsKey("vasibh")){
            Integer a = map.get("vasibh");
            System.out.println("value for key \"vishal\" is:- "+a);
        }
        map.clear();
        print(map);
        
    }
    
    public static void print(Map<String,Integer> map){
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println(map);
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
