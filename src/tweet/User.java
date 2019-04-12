/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweet;

/**
 *
 * @author 13982
 */
public class User {
    private String Tweet_Id;
    private String Date;
    private String Hour;
    private String User_name;
    private String Nick_name;
    private String Tweet_content;
    private String Favs;
    private String RTs;
    private String Latitude;
    private String Longitude;
    private String Followers;
    
    
   public User(){}
    
    
    
    
    /*the construct to generate the link*/
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
    
    
    
    public String getTweet_Id(){
        return Tweet_Id;
    }
    
    /*get the number of Favs*/
    public int getFavs(){
        int numberFavs = Integer.parseInt(Favs);
        return numberFavs;
    }
    
    /*get the number of RTs*/
    public int getRTs(){
         int numberRTs = Integer.parseInt(RTs);
         return numberRTs;
    }
    
    /*get the number of followers*/
    public int GetFollowers(){
         int numberFollowers = Integer.parseInt(Followers);
         return numberFollowers;
    }
    
    
        @Override
    public String toString(){
        return "Tweet_Id: "+Tweet_Id+"\nDate: "+Date+"\nHour: "+Hour+"\nUser_name: "+User_name+"\nNick_name: "+Nick_name+"\nTweet_content: "+Tweet_content+"\nFavs: "+Favs+"\nRTs: "+RTs+"\nLatitude: "+Latitude+"\nLongitude: "+Longitude+"\nFollowers: "+Followers;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */

    
}