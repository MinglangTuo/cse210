/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tyler.Tuo
 */
public class time {
    
    public static void main(String[] args) throws ParseException{
        String beginTime=new String("2017-06-09 10:22:22");
        String endTime=new String("2017-05-08 11:22:22"); 
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date sd1=df.parse(beginTime);
        Date sd2=df.parse(endTime);

        System.out.println(sd1.before(sd2));System.out.println(sd1.after(sd2));
        
    }
}
