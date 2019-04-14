/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tweet.User;

public class ExcelUtil{
    
    public static List<String> TweetIdColumn = new ArrayList<>();
    
    public static List<String> DateColumn = new ArrayList<>();
    
    public static List<String> HourColumn = new ArrayList<>();
    
    public static List<String> UserNameColumn = new ArrayList<>();
    
    public static List<String> NicknameColumn = new ArrayList<>();
    
    public static List<String> TweetContentColumn = new ArrayList<>();
    
    public static List<String> FavsColumn = new ArrayList<>();
    
    public static List<String> RTsColumn = new ArrayList<>();
    
    public static List<String> LatitudeColumn = new ArrayList<>();
    
    public static List<String> LongitudeColumn = new ArrayList<>();
    
    public static List<String> FollowersColumn = new ArrayList<>();
    
    public static ArrayList<User> dealDataset(String filePath){
        readDataSet(filePath);
        ArrayList<User> users = new ArrayList();
        int length = UserNameColumn.size();
        for(int i = 0;i<length;++i){
            String Tweet_Id = TweetIdColumn.get(i);
            String Date =  DateColumn.get(i);
            String Hour = HourColumn.get(i);
            String User_name = UserNameColumn.get(i);
            String Nick_name = NicknameColumn.get(i);
            String Tweet_content = TweetContentColumn.get(i);
            String Favs = FavsColumn.get(i);
            String RTs = RTsColumn.get(i);
            String Latitude = LatitudeColumn.get(i);
            String Longitude = LongitudeColumn.get(i);
            String Followers = FollowersColumn.get(i);
            
            users.add(new User(Tweet_Id,Date,Hour,User_name,Nick_name,Tweet_content,Favs,RTs,Latitude,Longitude,Followers));
            
           
        }
         return users;
    }
        
        @SuppressWarnings("resource")
        public static void readDataSet(String filePath){
            InputStream input;
            try{
                input = new FileInputStream(filePath);
                XSSFWorkbook book = new XSSFWorkbook(input);
                XSSFSheet sheet = book.getSheetAt(0);
                XSSFRow row;
                for(int i = sheet.getFirstRowNum()+1;i<sheet.getPhysicalNumberOfRows();++i){
                    row = sheet.getRow(i);
                    TweetIdColumn.add(row.getCell(0).getStringCellValue());
                     DateColumn.add(row.getCell(1).getStringCellValue());
                    HourColumn.add(row.getCell(2).getStringCellValue());
                    UserNameColumn.add(row.getCell(3).getStringCellValue()); 
                    NicknameColumn.add(row.getCell(4).getStringCellValue()); 
                    TweetContentColumn.add(row.getCell(5).getStringCellValue()); 
                    FavsColumn.add(row.getCell(6).getStringCellValue());
                    RTsColumn.add(row.getCell(7).getStringCellValue()); 
                    LatitudeColumn.add(row.getCell(8).getStringCellValue()); 
                    LongitudeColumn.add(row.getCell(9).getStringCellValue()); 
                    FollowersColumn.add(row.getCell(10).getStringCellValue()); }
           }catch (FileNotFoundException IOE){
                IOE.printStackTrace();
           }catch (IOException IOE){
                IOE.printStackTrace();
            }
        }
                
   
    
    
    
}