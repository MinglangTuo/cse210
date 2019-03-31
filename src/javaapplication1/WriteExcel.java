/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javafx.scene.input.DataFormat;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 *
 * @author Tyler.Tuo
 */
public class WriteExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("FirstExcelSheet");
        HSSFRow row = sheet.createRow(0);
       // HSSFCell cell = row.createCell(0);
        //cell.setCellValue("1.cell");
        
        
        /*cell = row.createCell(1);
        HSSFDataFormat format = workbook.createDataFormat();
        CellStyle dataStyle = workbook.createCellStyle();
        dataStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
        cell.setCellStyle(dataStyle);
        cell.setCellValue(new Date());*/
        
        row.createCell(2).setCellValue("3.Cell");
        
        
        
        workbook.write(new FileOutputStream("excel.xls"));
        workbook.close();
        
        
        
        
    }
    
}
