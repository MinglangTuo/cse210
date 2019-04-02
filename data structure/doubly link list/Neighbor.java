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
public class Neighbor {
        
    public String homeOwnerName;
    public int houseNumber;
    
    public Neighbor next;
    public Neighbor previous;
    
    public Neighbor(String homeOwnerName,int houseNumber){
        this.homeOwnerName = homeOwnerName;
        this.houseNumber = houseNumber;
    }
    
    public void display(){
        System.out.println(homeOwnerName + " : "+houseNumber+" privet drive");
    }

    public String toString(){
        return homeOwnerName;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DoubleEndedLinkedList theList = new DoubleEndedLinkedList();
      /*theList.insertInFirstPosition("Mark Evans", 7);
      theList.insertInFirstPosition("piers polkiss", 9);
      theList.insertInLastPosition("Doreen Figg", 0);
      theList.insertInLastPosition("petunia Dursley", 0);*/
      
      theList.insertInOrder("Mark Evans", 7);
      theList.insertInOrder("piers polkiss", 9);
      theList.insertInOrder("Doreen Figg", 0);
      theList.insertInOrder("petunia Dursley", 0);
      
      //theList.display();
      NeighborIterator neighbor = new NeighborIterator(theList);
      
      neighbor.currentNeighbor.display();
      
      neighbor.next();
      
      neighbor.currentNeighbor.display();
      
      neighbor.remove();
       neighbor.remove();
     
     
      neighbor.currentNeighbor.display();
    }
    
    
    
    
    
}
