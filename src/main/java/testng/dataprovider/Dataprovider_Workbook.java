package testng.dataprovider;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dataprovider_Workbook {
    @DataProvider(name = "Authentication")
    public static Object[][] getData() throws IOException {

        Object[][] getData=readWorkbook();
        return getData;
    }
    @Test(dataProvider = "Authentication")

    public void test(String x, String y) {
        System.out.println(x+" "+y);

    }
    public static Object[][] readWorkbook() throws IOException
    {
        String[][] temp=null;
        FileInputStream fis=new FileInputStream("dataprovider.xlsx");
        XSSFWorkbook w=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);
        XSSFRow row;
        XSSFCell cell;
        temp=new String[s.getLastRowNum()][s.getRow(0).getLastCellNum()];
        for (int i=0;i<s.getLastRowNum();i++)
        {
            row=s.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++)
            {
                cell=row.getCell(j);
                temp[i][j]= cell.getStringCellValue();
            }


        }
        return temp;

    }

}
