/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tweet;

import java.util.ArrayList;
import java.util.HashMap;
import tweet.User;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Tyler.Tuo
 */
public class Tweet {
private LinkedList<User> users;
public Map<String,User> map = new HashMap<String,User>();  //judge the same name


public Tweet(){
    users = new LinkedList<User>();
}


public Tweet(LinkedList<User> users){
        users = this.users;
}


public LinkedList<User> getAllTweet(){
    return this.users;
}

public void addTweet(User user){
    users.add(user);
}

    /* the method is merge the same users*/
    public ArrayList<User>mergeUsers(ArrayList<User> users){
        
        
        for(User i: users){
            String key = i.getUser_name()+i.getNick_name();
            if(map.containsKey(key)){
                User user = map.get(key);
                int Followers = user.GetFollowers();
                int anotherFollowers = i.GetFollowers();
                if(Followers>anotherFollowers){
                    i = user;
                }
            }
            map.put(key, i);
        }
        
        users.clear();
        users.addAll(map.values());
        
        return users;
        
}
    





}
