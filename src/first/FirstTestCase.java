package first;

import org.testng.annotations.Test;

/*
1. set up - open browser and application
2. login
3. close
*/
public class FirstTestCase {

    @Test(priority = 1)
    //@Test
    void setup(){
        System.out.println("This is setup test");
    }

    @Test(priority = 2)
    //@Test
    void login(){
        System.out.println("This is the login");

    }

    @Test(priority = 3)
    //@Test
    void teardown(){
        System.out.println("closing the browsing");
    }

}
