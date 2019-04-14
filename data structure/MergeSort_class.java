/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse210.lecture;

import java.util.ArrayList;
import java.util.List;
import tweet.User;

/**
 *
 * @author 13982
 */
public class MergeSort_class {
    
    
    /*back a list after mergeSort*/
    private ArrayList<User> merge(final ArrayList<User> left,final ArrayList<User> right){
        final ArrayList<User> merged = new ArrayList<>();
        while(!left.isEmpty()&& !right.isEmpty()){  //左右两边任意一边为空，结束循环
            if(left.get(0).compareTo(right.get(0))<=0){
                merged.add(left.remove(0));
            }else{
                merged.add(right.remove(0));
            }
        }
        merged.addAll(left);
        merged.addAll(right);
        return (ArrayList<User>) merged;
    }
    
    
    public void mergeSort(final ArrayList<User>input){
        if(input.size()!=1){                //当大小不为1时
            final ArrayList<User> left = new ArrayList<User>();
            final ArrayList<User> right = new ArrayList<User>();
            boolean logicSwitch = true;
            while(!input.isEmpty()){     //判断list是否为空
                if(logicSwitch){
                    left.add(input.remove(0));   //左边移去第一个
                }else{
                    right.add(input.remove(0)); //右边移去第一个
                }
                mergeSort((ArrayList<User>) left);
                mergeSort((ArrayList<User>) right); 
                input.addAll(merge(left,right));
            }
            
        }
    }
        
        public static void main(String[] args){
         
            
            
        }
        
        
        
    }
    
    
    
    
}
