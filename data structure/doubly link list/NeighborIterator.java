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
public class NeighborIterator {
    Neighbor currentNeighbor;
    Neighbor previousNeighbor;
    
    DoubleEndedLinkedList theNeighbor;
    
    NeighborIterator(DoubleEndedLinkedList theNeighbor){
        this.theNeighbor = theNeighbor;
        currentNeighbor = theNeighbor.firstLink;
        previousNeighbor = theNeighbor.lastLink;
    }
    
    public boolean hasNext(){
        if(currentNeighbor.next!=null){
            return true;
        }
        return false;
    }
    
    public Neighbor next(){
        if(hasNext()){
            previousNeighbor = currentNeighbor;
            currentNeighbor = currentNeighbor.next;
            return currentNeighbor;
        }
        return null;
    }
    
    public void remove(){/*???*/
        if(previousNeighbor== null){
            theNeighbor.firstLink = currentNeighbor.next;
        }else{
            previousNeighbor.next = currentNeighbor.next;
            
            if(currentNeighbor == null){
                currentNeighbor = theNeighbor.firstLink;
                previousNeighbor = null;
            }else{
                currentNeighbor = currentNeighbor.next;
            }
        }
    }
    
    
}
