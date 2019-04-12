/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Tyler.Tuo
 */
public class ExcelUtil {
    
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
      
        
        
        DataFormatter formatter = new DataFormatter();
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("excel.xlsx"));
        XSSFSheet sheet = wb.getSheetAt(0);
      /*  HSSFRow row = sheet.getRow(0);
        if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){
            System.out.println(row.getCell(0).getStringCellValue());
        }
        if(row.getCell(1).getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
            System.out.println(row.getCell(1).getDateCellValue());
        }*/
        for(Row row:sheet){
            for(Cell cell:row){
                CellReference cellRef = new CellReference(row.getRowNum(),cell.getColumnIndex());
                String cellLocation = cellRef.formatAsString();
                System.out.print(cellLocation);  // the location of cells
                String column[] = cellLocation.split("")
                
                System.out.print(" - ");
                
                
                //get the text that appears in the cell by getting the cell value and applying  any data format..
                String text =  formatter.formatCellValue(cell);   
                System.out.println(text);             //get the content of cell
                
               
 
                }
            }
    }
    
      public void ChoiceAttribute(String attribute){  // use regular expression to extract the letter
          Link TSlink = new link        
          
        switch(attribute){
            case "A":
                Tweet_Id = attribute;
        }
    }
    
    
    
    
}
        
        
        





           /*    
            //Alternatively, get the value and format it yourself
                switch(cell.getCellType()){
                    case STRING:
                    {
                        System.out.println(cell.getRichStringCellValue().getString());  }
                        break;
                    case NUMERIC:
                        
                        if(DateUtil.isCellDateFormatted(cell)){
                           {
                            System.out.println(cell.getDateCellValue());}
                        }else{
                            System.out.println(cell.getNumericCellValue());
                        }
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                    case FORMULA:
                        System.out.println(cell.getCellFormula());
                        break;
                    case BLANK:
                        System.out.println();
                        break;
                    default:
                        System.out.println();
                        }
                        
                            */
    

