package second;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. set up - open browser and application
2. login
3. close
*/
public class SecondTestCase {

    @Test(priority = 1)
        //@Test
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 2)
        //@Test
    void login() {
        System.out.println("This is the login");
        Assert.assertEquals(1, 2);
    }

    @Test(priority = 3)
        //@Test
    void searchUser() {
        System.out.println("Search User");
    }

    @Test(priority = 4)
        //@Test
    void teardown() {
        System.out.println("closing the browsing");
    }

}
