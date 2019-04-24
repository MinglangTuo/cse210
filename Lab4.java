/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab4.Queue;



/**
 *
 * @author Minglang.Tuo15
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new Queue();
    Producer p = new Producer(q,10);
 Consumer c1 = new Consumer(q, p, "Tom");
 Consumer c2 = new Consumer(q, p, "Jane"); 
        
 
 
 Thread tp = new Thread(p);
 Thread t1 = new Thread(c1);
 Thread t2 = new Thread(c2);
 t1.start();
 t2.start();
 tp.start();
 System.out.println("main is dead"); 
        
        
        
        
        
    }
}
    
 class Queue{
     private final int[] items = new int[10];
     private int numItems = 0;
     private int firstIndex = -1;
     
        public synchronized void add(int i){ 
            while (numItems > 9) { 
            try{ wait();
                
            }catch(InterruptedException ie){}}
        items[numItems] = i;
        numItems++;
        // at least one value in the queue
        firstIndex = 0;
         notifyAll(); 
 }
        
    public boolean isEmpty() {
 return (numItems == 0);
} 

        public synchronized int next() {
            while (isEmpty()) { try{ wait();
                
            }catch(InterruptedException ie){}} 
 int n = items[firstIndex];
 shift(); 
 numItems--;
 notifyAll(); 
 return n;
} 
        
    private void shift() {
 for (int i=0; i+1 < numItems; i++) {
 items[i] = items[i+1];
 }
 }
}    
        
        
        
        
        
        
 
    
    class Producer implements Runnable{
        private final int tasks;
        private int tasksDone = 0;
        private final Queue q;
        
        Producer(Queue q,int t){
            this.q = q;
            tasks = t;
        }
        
        public boolean moreTasks(){
            return tasksDone<tasks;
        }
        
        
        
        
        
        @Override
        public void run() {
            while(tasksDone<tasks){
                q.add(tasksDone++);
            }
            System.out.println("producer is dead");
        }
       
    }





    
    class Consumer implements Runnable{
        private final Queue qInputs;
        private final Producer prod;
        private final String name;
        
        Consumer(Queue q,Producer p,String s){
            qInputs = q;
            prod = p;
            name = s;
        }
        
        
        
        
        @Override
        public void run() {
           int i;
           
           while(prod.moreTasks()||!qInputs.isEmpty()){
               i = qInputs.next();
               System.out.println(name + ": " + i); 
           }
           System.out.println(name + " is dead"); 
        }
        
    }
    
    
    
    
    
    

