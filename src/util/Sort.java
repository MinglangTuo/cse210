/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tweet.User;

/**
 *
 * @author Tyler.Tuo
 */

class Ratingfollowers implements Comparator<User>{

    
    
    /*The method is compare the followers*/
    @Override
    public int compare(User o1, User o2) {
        if(o1.GetFollowers()<o2.GetFollowers()) return -1;
        if(o1.GetFollowers()>o2.GetFollowers()) return 1;
        else return 0;
    }
    
}
public class Sort {

    /**
     * @param args the command line arguments
     */
    
    
        /*the method is compare RTs and retweet*/
        public ArrayList<User>sortByFavsRTs(ArrayList<User> users){
          Collections.sort(users);        //comparable 接口特定使用的方法  --时间排序
         
         System.out.println("tweet after sorting by Fans and RTs: ");
         
         return users;
        }
    
        
        
        
        /*The method is compare the followers*/
        public ArrayList<User>sortByFollows(ArrayList<User> users){
        Ratingfollowers ratingfollowers = new Ratingfollowers();
         Collections.sort(users,ratingfollowers);
       
          System.out.println("tweet after sorting by Followers: ");
            
          return users;
         
         
        }
    
}