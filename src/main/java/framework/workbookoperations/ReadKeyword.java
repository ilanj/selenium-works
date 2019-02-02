package framework.workbookoperations;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadKeyword {
    public static List<String> readKeyword() throws IOException {
        FileInputStream fis=new FileInputStream("readkeyword.xlsx");
        XSSFWorkbook w=new XSSFWorkbook(fis);
        XSSFSheet s=w.getSheetAt(0);
        XSSFRow row;
        List<String> keywords=new ArrayList<>();

        for(int r=0;r<s.getLastRowNum();r++)
        {
            row=s.getRow(r);
            String keyword=row.getCell(0).getStringCellValue();
            keywords.add(keyword);
        }
        fis.close();
        return keywords;
    }
}
