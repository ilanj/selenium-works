package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityEx {
    @BeforeTest
    void start()
    {
        System.out.println("Test started");
    }
    @Test(groups="level1")
    void print1() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am print 1");
    }
    @Test(groups="level2")
    void print2() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am print 2");
    }
    @Test(groups="level2")
    void print3() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am print 3");
    }
    @AfterTest
    void stop()
    {
        System.out.println("test stopped");
    }
}
