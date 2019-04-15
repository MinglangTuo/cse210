/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Tyler.Tuo
 */
public class Student {
    private String name;
    private int money;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getMoney(){
        return money;
        
    }
    
    public void setMoney(int money){
        this.money = money;
    }
    
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+money;
        result = prime*result+((name==null)?0:name.hashCode());
        return result;
        
    }
    
    @Override
    public boolean equals(Object obj){
            if(this == obj){
                return true;
            }
            
            if(obj == null){
                return false;
            }
            
            if(getClass()!=obj.getClass())
                return false;
            Student other = (Student) obj;
            
            if(name == null){
                if(other.name!=null)
            }
            
    }
    
    
    
    
    
    
}
