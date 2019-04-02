/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse210.linkedlist;

/**
 *
 * @author 13982
 */
public class LinkList {
    public Link firstLink;
    
    
    /*INITIALIZE THE LINKLIST*/
    LinkList(){
        firstLink = null;
    }
    
    
    /*CHECK IS THE LINK IS EMPTY*/
    public boolean isEmpty(){
        
        return(firstLink == null);
    }
    /*INSERT THE ELEMENT AFTER THE FIRST LINK*/
    public void insertFirstLink(String bookName, int millionsSold){
        
        Link newLink = new Link(bookName,millionsSold);
        
        newLink.next = firstLink;
        
        firstLink = newLink;
    }
    
    /*REMOVE THE FIRST ELEMENT IN LINKLIST*/
    public Link removeFirst(){
        Link linkReference = firstLink;
        
        if(!isEmpty()){
            firstLink = firstLink.next;
        }else{
            System.out.println("Empty LinkedList");
        }
        return linkReference;
    }
    
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
    
    
    /*FIND A SPECIFIC ELEMENT IN THE LINK*/
    public Link find(String bookName){
        
        Link theLink = firstLink;
        
        if(!isEmpty()){
            while(theLink.bookName!=bookName){
                if(theLink.next == null){
                    return null;
                }else{
                    theLink = theLink.next;
                }
            }
        }
        System.out.println("empty linklist ");
        return theLink;
    }
    
    public Link removeLink(String bookName){
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        
        while(currentLink.bookName != bookName){
            
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


    
    
}
