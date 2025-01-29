package org.seleniumautomation.com.ex12_DataDrivenTesting;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskExcel01 {

    public static void main(String[] args) throws IOException {
        //workbook
        //sheet
        //row,cell
        //XSSFWORKBOOK ->xlsx > 2008
        // HSSWORKBOOK -> xls < 2008

        //Task 1 - create excel file and add data

        Map<String, Object> data = new TreeMap<>();

        data.put("1", new Object[]{"Login", "Email", "Password"});
        data.put("2", new Object[]{"1", "sachin@live.com", "12345"});
        data.put("3", new Object[]{"2", "test@gmail.com", "34567"});

        String excelFilename = createExcel("CTD2.xlsx", data);

    }

    static String createExcel(String fileName, Map<String, Object> data) throws IOException {

        Set<String> keyset = data.keySet();

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet  sheet = workbook.createSheet("Main");

        int rownum=0;

        for(String key:keyset){
            Row r = sheet.createRow(rownum++);
            Object[] objectA = (Object[]) data.get(key);

            int cellnum=0;

            for(Object o:objectA){
                Cell cell = r.createCell(cellnum++);

                if(o instanceof String) {
                    cell.setCellValue((String) o);
                }

                if(o instanceof Integer) {
                    cell.setCellValue((Integer) o);
                }

            }

        }


        FileOutputStream outputStream = new FileOutputStream(new File(fileName));

        workbook.write(outputStream);
        outputStream.close();

        return fileName;

    }
}
