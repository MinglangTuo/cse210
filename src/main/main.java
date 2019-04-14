/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.ArrayList;
import tweet.User;
import util.ExcelUtil;

/**
 *
 * @author Tyler.Tuo
 */
public class main {
    public static void main(String[] args){
        ExcelUtil excel = new ExcelUtil();
        ArrayList<User> print = new ArrayList();
         print = excel.dealDataset("excel.xlsx");
        for(int i =0;i<print.size();i++){
            System.out.println(print.get(i));
        }
       
        
    }
}
