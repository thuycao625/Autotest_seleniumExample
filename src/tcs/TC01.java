package tcs;

import org.testng.annotations.*;

public class TC01 {



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
    void test1() {
        System.out.println("this is test 1");
    }


    @Test
    void test2() {
        System.out.println("this is test 2");
    }


    @BeforeTest
    void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("after test");
    }


}
