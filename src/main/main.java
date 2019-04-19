/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;



import java.util.ArrayList;
import java.util.Scanner;
import tweet.Tweet;
import tweet.User;
import util.ExcelUtil;
import util.MatchEngine;
import util.Sort;

/**
 *
 * @author Tyler.Tuo
 */
public class main {
    public static void main(String[] args){
        int rank = 1;
        
        
        ExcelUtil excel = new ExcelUtil();
        ArrayList<User> rankList1 = new ArrayList();  //list1 for retweet and Favs
        ArrayList<User> rankList2 = new ArrayList();  //list2 for followers
        ArrayList<User> textMatch = new ArrayList();  //list3 for textMatch
        
        rankList1 = excel.dealDataset("excel.xlsx");  //the arraylist from deal by excel.
        rankList2 = rankList1;
        textMatch = rankList1;
        
         Sort sort = new Sort();                  //the sort object
         
         rankList1 = sort.sortByFavsRTs(rankList1);        //sorted by RTs and Favs
         
         for(int i =rankList1.size()-1;i>rankList1.size()-11;i--){
            
            System.out.println("the top "+rank+" of the RTs and Favs is------\n"+rankList1.get(i));
            System.out.println(" ");
            rank++;
        }
         
         /*
         Tweet tweet = new Tweet();
         rankList2 = tweet.mergeUsers(rankList2);
         rankList2 = sort.sortByFollows(rankList2);
         rank = 1;
         for(int i =rankList2.size()-1;i>rankList2.size()-11;i--){
            
            System.out.println("the top "+rank+" of followers is------\n"+rankList2.get(i));
            System.out.println(" ");
            rank++;
         
         
         
         
        }
       */
         Scanner sc = new Scanner(System.in);
         String key = sc.next();
         
          MatchEngine engine = new MatchEngine();
          engine.Text_matching(textMatch, key);
         
         
        
        
    }
}
