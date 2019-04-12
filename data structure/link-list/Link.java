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
public class Link {
    public String bookName;
    public int millionsSold;
    
    public Link next;
    
    public Link(String bookname, int millionsSold){
        
        this.bookName = bookname;
        this.millionsSold = millionsSold;
    }
    
    public void display(){
        System.out.println(bookName +": "+millionsSold+",000,000");
    }
    
    public String toString(){
        return bookName;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkList newLinkedList = new LinkList();
        newLinkedList.insertFirstLink("Don quixote", 500);
        newLinkedList.insertFirstLink("a tale of two cities",200);
        newLinkedList.insertFirstLink("the lord of the rings",400);
        newLinkedList.insertFirstLink("hello-hello",700);
        
        //newLinkedList.display();
        //System.out.println(newLinkedList.isEmpty());
        newLinkedList.removeFirst();
        //newLinkedList.display();
        
        //System.out.println(newLinkedList.find("a tale of two cities").bookName);
        
        newLinkedList.removeLink("Don quixote");
        newLinkedList.display();
        
        
        
        

// TODO code application logic here
    }
    
}
