/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.List;

/**
 *
 * @author Tyler.Tuo
 */
public class exception {

    public static void main(String args[]){
        
        String str = null;  
        
        try{
        System.out.println(str.length());
        }catch(NullPointerException IOE)
        {
            //IOE.printStackTrace();
            //System.out.println("the type is wrong");
        }
        
         judgeString();
        
    }
    
 public static void judgeString(){
    String a = "➰";
    System.out.println(a);
}
 
 public static void one(){
     int[] i = new int[6]; 
 }
 
 
 
}