/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.regex.Pattern;

/**
 *
 * @author Tyler.Tuo
 */
public class regex {
    public static void main(String args[]){
        String content = "I am noob "+"from runoob.com.";
        
        String pattern = ".*runoob.*";
        
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("is the string contains 'runoob'? "+isMatch);
    }
}
