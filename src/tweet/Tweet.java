/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tweet;

import tweet.User;
import java.util.LinkedList;

/**
 *
 * @author Tyler.Tuo
 */
public class Tweet {
private LinkedList<User> users;
private int Favs_RTs = 0;



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


public void FindTop(){
    User temporary = new User();
    for(int i=0;i<users.size();i++){
        
        temporary = users.get(i);
        Favs_RTs = temporary.getFavs()+temporary.getRTs();
    }
    
    
    
}



}
