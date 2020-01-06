package tcs;

import org.testng.annotations.*;

public class TC02 {



    @BeforeClass
    void beforeClass(){
        System.out.println("this will execute before every class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this will execute after every class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this will execute before every method");
    }


    @AfterMethod
    void afterMethod(){
        System.out.println("this will execute after every method");
    }

    @Test
    void test3() {
        System.out.println("this is test 3");
    }


    @Test
    void test4() {
        System.out.println("this is test 4");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("this will execute before suite");
    }


    @AfterSuite
    void afterSuite(){
        System.out.println("this will execute after suite");
    }
}
