package testng;


import org.testng.annotations.*;

public class PriorityEx {
    @BeforeClass
    void start()
    {
        System.out.println("Test started");
    }
    @Test(groups="level1")
    void print1() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am print 1");
    }
    @Test(groups="level2",priority = 2)
    void print2() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am print 2");
    }
    @Test(groups="level4",priority = 0)
    void print4() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am group4");
    }
    @Test(groups="level2",priority = 1)
    void print3() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("i am print 3");
    }
    @AfterClass
    void stop()
    {
        System.out.println("test stopped");
    }
}
