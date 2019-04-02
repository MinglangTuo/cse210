/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinklist;

/**
 *
 * @author 13982
 */
public class DoubleEndedLinkedList {
    
    Neighbor firstLink;
    Neighbor lastLink;
    
    public void insertInFirstPosition(String homeOwnerName,int houseNumber){
    Neighbor theNewLink = new Neighbor(homeOwnerName,houseNumber);
    
    if(isEmpty()){
        lastLink = theNewLink;
    }else{
        firstLink.previous = theNewLink;
    }
    
    theNewLink.next = firstLink;
    firstLink = theNewLink;
    }
    
    public void display(){
        Neighbor theLink = firstLink;
        while(theLink !=null){
            theLink.display();
            System.out.println("Next Link" + theLink.next);
            theLink = theLink.next;
        }
    }
    
    
    public void insertInLastPosition(String homeOwnerName, int houseNumber){
        Neighbor theNewLink = new Neighbor(homeOwnerName,houseNumber);
        if(isEmpty()){
                firstLink = theNewLink;
        }else{
            lastLink.next = theNewLink;
            
            theNewLink.previous = lastLink;
        }
        lastLink = theNewLink;
        
    }
    
    public boolean isEmpty(){
        return(firstLink == null);
    }
    
    public boolean insertAfterKey(String homeOwnerName,int houseNumber,int key){
    Neighbor theNewLink = new Neighbor(homeOwnerName,houseNumber);
    Neighbor currentNeighbor = firstLink;
    while(currentNeighbor.houseNumber!=key){
        currentNeighbor = currentNeighbor.next;
        if(currentNeighbor == null){
            return false;
        }}
    if(currentNeighbor == lastLink){
        theNewLink.next = null;
        lastLink = theNewLink;
        
    }else{
        theNewLink.next = currentNeighbor.next;
        currentNeighbor.next.previous = theNewLink;
    }
   
    theNewLink.previous = currentNeighbor;
    currentNeighbor.next = theNewLink;
    return true;
    
    
    }
    
    public void insertInOrder(String homeOwnerName, int houseNumber){   //COURSEWORK 会用到
        Neighbor theNewLink = new Neighbor(homeOwnerName,houseNumber);
        
        Neighbor previousNeighbor = null;
        Neighbor currentNeighbor = firstLink;
        
        while((currentNeighbor !=null)&&(houseNumber > currentNeighbor.houseNumber)){
            
            previousNeighbor = currentNeighbor;
            currentNeighbor = currentNeighbor.next;
        }
        if(previousNeighbor == null){
            firstLink = theNewLink;
        }else{
            previousNeighbor.next = theNewLink;
            
        }
        theNewLink.next = currentNeighbor;
    }
    
    
    
    
    
    }
    
    
    

