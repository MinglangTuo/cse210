/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 13982
 */
public class Link {
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
    
    public Link next;   //the link to connect the next link
    
    
  
    
    
    
    
    /*the construct to generate the link*/
    public Link(String Tweet_Id, String Date,String Hour,String User_name, String Nick_name,String Tweet_content,String Favs,String RTs,String Latitude,String Longitude,String Followers){
        
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
    
    /*to display the information to any link*/
    public void display(){
        System.out.println("Tweet_Id: "+Tweet_Id+" Date: "+Date+" Hour: "+Hour+" User_name: "+User_name+" Nick_name: "+Nick_name+" Tweet_content: "+Tweet_content+" Favs: "+Favs+" RTs: "+RTs+" Latitude: "+Latitude+" Longitude: "+Longitude+" Followers: "+Followers);
    }
    
    
    
    public String toString(){
        return Tweet_Id;
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
    
    
    
    
    
    /**
     * @param args the command line arguments
     */

    
}
