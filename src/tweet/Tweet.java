/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tweet;


import java.util.HashMap;
import tweet.User;
import java.util.LinkedList;
import java.util.Map;

/**
 *this class represents the content of tweet
 * @author Tyler.Tuo
 * @version V1.0
 */
public class Tweet {
    /**
	 * representing designing a tweet(users) by using linkedlist for users.
	 */
	private LinkedList<User> users;
	//!!!!!!!!!!private LinkedList<User> tweet;
    
    /**
	 * representing one User correspond one number of followers.
	 */
public Map<String,User> map = new HashMap<String,User>();  //judge the same name.

    
    /**
	 * construct method without parameters.
	 */
public Tweet(){
    users = new LinkedList<User>();
}

/**
	 * construct method with parameters
	 * @param users a linkedList that stores tweet(users).
	 */
public Tweet(LinkedList<User> users){  //!!!!!!!!!!!public Tweet(LinkedList<User> tweet){
        users = this.users;
}

    /**
	 * get the list of User.
	 * @return the linked list.
	 */
public LinkedList<User> getAllTweet(){
    return this.users;
}

    /**
	 * add User item to the list.
	 * @param user an User to be appended to the linked list of tweet(users).
	 */
public void addTweet(User user){
    users.add(user);
}
     
     /**
	 * the method is merge the same users in the tweet based on followers.
	 * @param users(tweet) all of the users in the tweet.
     * @return return the new linkedList of users(without the same)
	 */
	public ArrayList<User>mergeUsers(ArrayList<User> users){
        
    //!!!!!!!!!!!!!public LinkedList<User>mergeUsers(LinkedList<User> tweet){
        
        
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
