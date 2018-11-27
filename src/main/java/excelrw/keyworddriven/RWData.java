package excelrw.keyworddriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RWData {
    public static void readData() throws IOException, InterruptedException {
        FileInputStream fis=new FileInputStream("./readkeyword.xlsx");
        XSSFWorkbook w=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);
        int rowno=0,columnno=0;
        System.out.println("total rows="+s.getLastRowNum());
        for (rowno=0;rowno<s.getLastRowNum();rowno++)
        {
            XSSFRow r=s.getRow(rowno);
            String keyword=r.getCell(columnno).getStringCellValue();
            System.out.println("printing"+keyword);
            ActionFlow.actionsCall(keyword);
        }
        fis.close();
    }
}
