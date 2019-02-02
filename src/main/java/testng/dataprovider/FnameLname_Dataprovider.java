package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FnameLname_Dataprovider {
    @DataProvider(name = "Authentication")
    public static Object[][] getData() {

        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "gjgkg" }};
    }

    @Test(dataProvider = "Authentication")

    public void test(String x, String y) {
        System.out.println(x+" "+y);

    }

}
