package org.seleniumautomation.com.ex12_DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class TaskExcel02 {

    public static void main(String[] args) throws IOException {

        //Read the excel file
        FileInputStream inputStream = new FileInputStream("CTD2.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0); //sheet name "Main"

        Iterator<Row> rowIterator = sheet.iterator();

        while(rowIterator.hasNext()) {

            Row row = rowIterator.next();

            Iterator<Cell> cellIterator = row.iterator();

            while(cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                if(cell.getCellType() == CellType.NUMERIC) {
                    System.out.print(cell.getNumericCellValue() + ", ");
                }

                if(cell.getCellType() == CellType.STRING) {
                    System.out.print(cell.getStringCellValue() + ", ");
                }
            }
            System.out.println();
        }



    }
}
