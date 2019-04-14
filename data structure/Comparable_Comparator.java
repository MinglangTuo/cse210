/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse210.lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author 13982
 */


class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;
    
    
    @Override
    public int compareTo(Movie o) {
        return this.year - o.year; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Movie(String nm,double rt, int yr){
        this.name = nm;
        this.rating =rt;
        this.year = yr;
    }
    
    public double getRating(){
        return rating;
    }
    
    public String getName(){
        return name;
    }
    
    public int getYear(){
        return year;
    }  
    
    
    
    
}

class RatingCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRating()<o2.getRating()) return -1;
        if(o1.getRating()>o2.getRating()) return 1;
        else return 0;
    }
}

class NameCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
      return o1.getName().compareTo(o2.getName());
    }
    
}





public class Comparable_Comparator {
       public static void main(String[] args)
        {
         ArrayList<Movie> list = new ArrayList<Movie>();
         list.add(new Movie("Force Awakens",8.3,2015));
         list.add(new Movie("Star Wars",8.7,1977));
         list.add(new Movie("Empire Strikes Back",8.8,1970));
         list.add(new Movie("Return of the Jedi",8.4,1973));
         
         Collections.sort(list);   //comparable 接口特定使用的方法  --时间排序
         
         System.out.println("Movies after sorting: ");
         
         for(Movie movie: list){
             System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
         }
         
         System.out.println("");
         
         RatingCompare ratingCompare = new RatingCompare();
         Collections.sort(list,ratingCompare);   //comparator implement  ----评定排序
         
         System.out.println("Movies after rating sorting: ");
         
         for(Movie movie: list){
             System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
         }
         
          System.out.println("");
         
          NameCompare nameCompare = new NameCompare();
         Collections.sort(list,nameCompare);   //comparator implement ---名字排序
         
         System.out.println("Movies after name sorting: ");
         
         for(Movie movie: list){
             System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
         }
         
         
        }
}

    
    
    
    
    


