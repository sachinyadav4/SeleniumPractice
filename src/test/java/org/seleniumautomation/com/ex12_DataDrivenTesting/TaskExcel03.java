package org.seleniumautomation.com.ex12_DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskExcel03 {

    public static void main(String[] args) throws IOException {

        //Create cell as specific location
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Main");

        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("Sachin Y");




        FileOutputStream outputStream = new FileOutputStream(new File("CellSpecific.xlsx"));

        workbook.write(outputStream);
        outputStream.close();




    }
}
