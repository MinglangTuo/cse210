/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweet;


import java.util.Comparator;


/**
 *<h1>print the information about user</h1>
 *<p>this class represnts the relevent information about a user, and by some of get methods to obtain the information. Besides, it 
 implement the Comparable interface to compare the information.</p>
 *@author: Tyler 
 *@version V1.0
 */
public class User implements Comparable<User>{
   /**
    *represent the ID for posting the tweet.
    */
    private String Tweet_Id;
    
    /**
    *represent the date when posting the tweet.
    */
    private String Date;
    
     /**
    *represent the time when posting the specified tweet.
    */
    private String Hour;
    
   /**
    *represent the formal name of user for posting the specified tweet.
    */
    private String User_name;
    
    /**
    *represent the nick name of user for posting the specified tweet.
    */
    private String Nick_name;
    
     /**
    *represent the content of tweet for posting the specified tweet.
    */
    private String Tweet_content;
    
     /**
    *represent the number of favoriate for posting the specified tweet.
    */
    private String Favs;
    
    /**
    *represent the number of re-tweet for posting the specified tweet.
    */
    private String RTs;
    
    /**
    *represent the Latitude of user when posting the specified tweet.
    */
    private String Latitude;
    
      /**
    *represent the Longitude of user when posting the specified tweet.
    */
    private String Longitude;
    
     /**
    *represent the number of followers to the user when posting the specified tweet.
    */
    private String Followers;
    
    
    /**
	 * construct method without parameters.
	 */
   public User(){}
    
    
    
    
    
    /**
	 * construct method with parameters.
	 * @param Tweet_Id Tweet Id for the user.
	 * @param Date Date for user posting the tweet.
	 * @param Hour time for user posting the tweet.
	 * @param User_name the user's real name.
     * @param Nick_name the user's nike name.
     * @param Tweet_content the content of the tweet.
     * @param Favs the number of favourite for the tweet.
     * @param RTs the number of re-tweeting the tweet.
     * @param Latitude the latitude of user posting the tweet.
     * @param Longitude the Longitude of user posting the tweet.
     * @param Followers the number of Followers for the user.
	 */
    public User(String Tweet_Id, String Date,String Hour,String User_name, String Nick_name,String Tweet_content,String Favs,String RTs,String Latitude,String Longitude,String Followers){
        
        this.Tweet_Id = Tweet_Id;
        this.Date = Date;
        this.Hour = Hour;
        this.User_name = User_name;
        this.Nick_name = Nick_name;
        this.Tweet_content = Tweet_content;
        this.Favs = Favs;
        this.RTs = RTs;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Followers = Followers;
        
    }
    
    /**
	 * get the the content of the tweet.
	 * @return the content of the tweet.
	 */
     public String getTweet_content(){
        return Tweet_content;
    }
    
    
      /**
	 * get the ID of the tweet.
	 * @return the ID of the tweet.
	 */
    public String getTweet_Id(){
        return Tweet_Id;
    }
    
      /**
	 * get the date of posting the tweet.
	 * @return the date of posting the tweet.
	 */
    public String getDate(){
        return Date;
    }
    
      /**
	 * get the time of posting the tweet.
	 * @return the time of posting the tweet.
	 */
    public String getTime(){
        return Hour;
    }
    
    
      /**
	 * get the formal name of user.
	 * @return the formal name of user.
	 */
    public String getUser_name(){
        
    return User_name;
    
    }
    
      /**
	 * get the nick name of user.
	 * @return the nick name of user.
	 */
    public String getNick_name(){
        
    return Nick_name;
        
    }
    
    
    
    
       /**
	 * get the number of favourite for the tweet.
	 * @return the number of favourite for the tweet.
	 */
    public int getFavs(){
        int numberFavs = Integer.parseInt(Favs);
        return numberFavs;
    }
    
    /**
	 * get the number of re-tweeting the tweet.
	 * @return the number of re-tweeting the tweet.
	 */
    public int getRTs(){
         int numberRTs = Integer.parseInt(RTs);
         return numberRTs;
    }
    
    /**
	 * get the number of Followers for the user.
	 * @return the number of Followers for the user.
	 */
    public int GetFollowers(){
         int numberFollowers = Integer.parseInt(Followers);
         return numberFollowers;
    }
    
    /*
    public void setFollowers(int number){
        this.Followers =  String.valueOf(number); 
    }*/
    
    /**the method is print the String of all relevent information about user.
    */
    @Override
    public String toString(){
        return "Tweet_Id: "+Tweet_Id+"\nDate: "+Date+"\nHour: "+Hour+"\nUser_name: "+User_name+"\nNick_name: "+Nick_name+"\nTweet_content: "+Tweet_content+"\nFavs: "+Favs+"\nRTs: "+RTs+"\nLatitude: "+Latitude+"\nLongitude: "+Longitude+"\nFollowers: "+Followers;
    }

    
    /**the method is compare by the whole number of re-tweets and favourites.*/
    @Override
    public int compareTo(User o) {
        
        
        return this.getFavs()+this.getRTs()-o.getFavs()-o.getRTs();
    }

    
}
