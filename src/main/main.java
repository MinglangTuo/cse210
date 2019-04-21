/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.flexible.core.QueryNodeException;
import tweet.Tweet;
import tweet.User;
import util.ExcelUtil;
import util.Lucene_MatchEngine;
import util.MatchEngine;
import util.Sort;

/**
 *this class is a test class that is
 * used for run the main method
 */
public class main {
    /**
     *the option is the choice you want to select in the system
     *other parameters is the system parameters.
     */
     private String option;
     private int rank = 1;
     private String key;
     private boolean loop = true;
    
    
    public static void main(String[] args) throws ParseException, IOException, QueryNodeException{
       
        
        ExcelUtil excel = new ExcelUtil();
        ArrayList<User> rankList = new ArrayList();  //list1 for retweet and Favs
        rankList = excel.dealDataset("excel.xlsx");  //the arraylist from deal by excel.
         Sort sort = new Sort();                  //the sort object 
        
        System.out.println("please select options:\n 1.print top 10 tweets(based on the Favs and RTs) and print the relevent information about the tweet"
                + "\n 2.print top 10 users(users are ranked based on followers)\n"+" 3.tweet search engine based on string matching\n"+
                " 4.tweet search engine based on full text searching(using Lucene)\n"+" 5.exit the system!");
        
         
         
         
         
         
     while(loop){   
         Scanner sc = new Scanner(System.in);
         option = sc.next();
     switch(option){
        
        case "1": 
        rankList = sort.sortByFavsRTs(rankList);        //sorted by RTs and Favs
         
         for(int i =rankList.size()-1;i>rankList.size()-11;i--){
            
            System.out.println("the top "+rank+" of the RTs and Favs is------\n"+rankList.get(i));
            System.out.println(" ");
            rank++;
        }
         System.out.println("please select another option");
         
         break;
         
        case "2":
         Tweet tweet = new Tweet();
         rankList = tweet.mergeUsers(rankList);
         rankList = sort.sortByFollows(rankList);
         rank = 1;
         for(int i =rankList.size()-1;i>rankList.size()-11;i--){
            
            System.out.println("the top "+rank+" of followers is------\n"+rankList.get(i));
            System.out.println(" ");
            rank++;
         
            }
         
         System.out.println("please select another option");
            break;
            
       case "3":
         System.out.println("please input what you want to search (common method):");
         Scanner sc1 = new Scanner(System.in);
         key = sc1.next();
         
          MatchEngine engine = new MatchEngine();
          engine.Text_matching(rankList, key);
          
          System.out.println("please select another option");
        break;
          
        case "4":
         System.out.println("please input what you want to search (Lucene):");
         Scanner sc2 = new Scanner(System.in);
         key = sc2.next();
         
         Lucene_MatchEngine LuceneEngine = new Lucene_MatchEngine();
         LuceneEngine.full_textMatching(rankList,key);
         
         System.out.println("please select another option");
        break;
        
        case "5":
            System.out.println("exit");
            loop = false;
            break;
            
        default:
        System.out.println("useless input!");
        System.out.println("please select another option");
        break;
        
     }
    
    }
    }
}
