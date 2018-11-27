package testng.dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FnameLname_Xml {
@Test
@Parameters({ "fname", "lname" })
    public static void testRun(String fname,String lname)
    {
        System.out.println(fname+"  "+lname);
    }
}
