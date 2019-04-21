/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;


import java.util.ArrayList;
import java.util.regex.Pattern;

import tweet.User;

/**
 *
 * @author Tyler.Tuo
 */
public class MatchEngine {
    
    public static void main(String[] args){
        MatchEngine engine = new MatchEngine();
        
    }
    
    
    
    /*the method is for Text matching*/
    public void Text_matching(ArrayList<User> user, String key){
        String content = "";
        String pattern = ".*"+key+".*";
        
        for(User i: user){
            content = i.getTweet_content();
            boolean isMatch = Pattern.matches(pattern,content);
            if(isMatch){
                System.out.println("content is"+content);
            }
            isMatch = false;
        }
    }
    

    
    
    
    
}
