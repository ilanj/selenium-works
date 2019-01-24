package excelrw.datadriven;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class KeywordFW {
    public static void main(String[] args) throws IOException {
        readWorkbook();
//        writeData();
    }

    public static Map readWorkbook() throws IOException {

        Map<String,String> map=new HashMap<>();
        FileInputStream fis=new FileInputStream("readdata.xlsx");
        XSSFWorkbook w=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);
        for( int r=0;r<s.getLastRowNum();r++)
        {
            XSSFRow row=s.getRow(r);

                String username=row.getCell(0).getStringCellValue();
                String password=row.getCell(1).getStringCellValue();
                map.put(username,password);

            System.out.println();
        }
        fis.close();
        return map;
    }
    public static void writeData() throws IOException {
        File f=new File("newwrite.xlsx");
        FileOutputStream fos=new FileOutputStream(f);
        XSSFWorkbook w=new XSSFWorkbook();
        XSSFSheet s=w.createSheet("test");
        for(int rno=0;rno<10;rno++)
        {
            XSSFRow r=s.createRow(rno);
            for (int cno=0;cno<10;cno++)
            {
                XSSFCell temp=r.createCell(cno);
                temp.setCellValue(UUID.randomUUID().toString().substring(0,4));
            }
        }
        w.write(fos);
        fos.close();
    }
}
