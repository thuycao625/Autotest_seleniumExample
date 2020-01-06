package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

import static java.lang.Thread.sleep;

public class TC_001 {

    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "http://localhost:8080/demo/#!/login";


    //-----------------------------------Test Setup-----------------------------------
    @BeforeClass
    public void setupTest () throws InterruptedException{
        //Create a new chrome

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//driver//geckodriver.exe");
        driver = new FirefoxDriver();



        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
        driver.manage().window().maximize();
        sleep(2000);
    }

    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () throws InterruptedException {
        //find username and password to login
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");

        // find login button
        driver.findElement(By.xpath("//div[3]/button")).click();
        sleep(2000);

        // scroll to find management tab
        WebElement element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[14]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(2000);

        // click on management tab
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[14]/a")).click();

        // in management tab find the application tab
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[14]/ul/li[1]/a")).click();
        sleep(2000);

    }

    //Update app
    @Test(priority = 1)
    public void addApp () throws InterruptedException {

            driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div/div/button")).click();
          WebElement name =   driver.findElement(By.xpath("//*[@id=\"appName\"]"));
          name.sendKeys("Thuy Cao");

          WebElement id = driver.findElement(By.xpath("//*[@id=\"sessionExpiration\"]"));
          id.sendKeys("30");
          driver.findElement(By.xpath("//*[@id=\"userBase\"]")).click();

          WebElement userBase = driver.findElement(By.xpath("//*[@id=\"userBase\"]/option[2]"));
          userBase.click();

            driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/form/div[4]/button")).click();

            sleep(5000);

            WebElement table = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div/div/table"));

            List<WebElement> listTr = table.findElements(By.tagName("tr"));


            for(int i = 1; i < listTr.size(); i++){
                List<WebElement> listTd = listTr.get(i).findElements(By.tagName("td"));
                    if(listTd.get(0).getText().equals("Thuy Cao") && listTd.get(2).getText().equals("30") && listTd.get(3).getText().equals("User By Location Sharing") ){
                        System.out.println("Add application successfully !!!" );
                        break;
                    }

                }

            System.out.println("Add application unsuccessfully !!!" );
            }






    



    //-----------------------------------Test TearDown-----------------------------------
    @AfterClass
    public void teardownTest (){
        //Close browser and end the session
        driver.quit();
    }



}
