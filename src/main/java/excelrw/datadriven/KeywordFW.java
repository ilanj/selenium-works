package excelrw.datadriven;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.UUID;

public class KeywordFW {
    public static void main(String[] args) throws IOException {
readWorkbook();
writeData();
    }
    public static void readWorkbook() throws IOException {
        FileInputStream fis=new FileInputStream("./readdata.xlsx");
        XSSFWorkbook w=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);
        for( int r=0;r<s.getLastRowNum();r++)
        {
            XSSFRow row=s.getRow(r);
            for(int c=0;c<row.getLastCellNum();c++)
            {
                String temp=row.getCell(c).getStringCellValue();
                System.out.print("printing"+temp);
            }
            System.out.println();
        }
        fis.close();
    }
    public static void writeData() throws IOException {
        File f=new File("./newwrite.xlsx");
        FileOutputStream fos=new FileOutputStream(f);
        XSSFWorkbook w=new XSSFWorkbook();
        XSSFSheet s=w.createSheet("test");
        int rno,cno;
        for(rno=0;rno<10;rno++)
        {
            XSSFRow r=s.createRow(rno);
            for (cno=0;cno<10;cno++)
            {
                XSSFCell temp=r.createCell(cno);
                temp.setCellValue(UUID.randomUUID().toString());
            }
        }
        w.write(fos);
        fos.close();
    }
}
