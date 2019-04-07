/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author 13982
 */
public class LinkList {
    public Link firstLink;
    ArrayList<Integer> topUser = new ArrayList<Integer>();
    MergeSort arrtibute = new MergeSort();
    /*INITIALIZE THE LINKLIST*/
    LinkList(){
        firstLink = null;
    }
    
    
    /*CHECK IS THE LINK IS EMPTY*/
    public boolean isEmpty(){
        
        return(firstLink == null);
    }
    
    /*INSERT THE ELEMENT AFTER THE FIRST LINK*/
    public void insertFirstLink(String Tweet_Id, String Date,String Hour,String User_name, String Nick_name,String Tweet_content,String Favs,String RTs,String Latitude,String Longitude,String Followers){
        
        Link newLink = new Link(Tweet_Id,Date,Hour,User_name,Nick_name,Tweet_content,Favs,RTs,Latitude,Longitude,Followers);
        
        newLink.next = firstLink;
        
        firstLink = newLink;
    }
    
    /*REMOVE THE FIRST ELEMENT IN LINKLIST
    public Link removeFirst(){
        Link linkReference = firstLink;
        
        if(!isEmpty()){
            firstLink = firstLink.next;
        }else{
            System.out.println("Empty LinkedList");
        }
        return linkReference;
    } */
    
    /*display all the element in the LiNK*/
    public void display(){
        Link theLink = firstLink;
        while(theLink !=null){
            theLink.display();
            System.out.println("Next Link: "+theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }
    
    
    public void traverse(){
        Link theLink = firstLink;
        while(theLink != null){
            int Favs_RTs = theLink.getFavs()+theLink.getRTs();
            topUser.add(Favs_RTs);  //use the arraylist to store the value of Favs_RTs
            theLink = theLink.next;
        }·
        String [] oldArray = topUser.toArray(new String[topUser.size()]);   //convert the arraylist to array
        
        /*convert the String(array) to int(array)*/
        int []newArray = new int[topUser.size()];                   //应该要用到泛型和implements或者extends来将数据读出来
         for (int i=0; i<topUser.size(); i++){
             int result = Integer.parseInt(oldArray[i]);
            newArray[i] = result;
        }
        arrtibute.sort(newArray, 0, newArray.length-1);
        
        //print the 
    }
    
  
    public void sortByFar_RTs(){
        
    }
    
    
    
    
    
    
    /*FIND A SPECIFIC ELEMENT IN THE LINK
    public Link find(String Tweet_Id){
        
        Link theLink = firstLink;
        
        if(!isEmpty()){
            while(theLink.getTweet_Id()!=Tweet_Id){
                if(theLink.next == null){
                    return null;
                }else{
                    theLink = theLink.next;
                }
            }
        }
        System.out.println("empty linklist ");
        return theLink;
    }*/
    
    
    /*
    public Link removeLink(String Tweet_Id){
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        
        while(currentLink.getTweet_Id() != Tweet_Id){
            
            if(currentLink.next == null){
                return null;
            }else{
                previousLink = currentLink;
                currentLink =currentLink.next;
            }
        }
        if(currentLink == firstLink){
            firstLink = firstLink.next;
        }else{
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
*/

    
    
}
