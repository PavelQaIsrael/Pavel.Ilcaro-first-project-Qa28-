import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



    public class OpenGoogle1 {
        WebDriver wd;


        @BeforeMethod
        public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wd.get("https://www.google.com/");


        }

        @Test
        public void searchWebDriver(){

            wd.findElement(By.name("q")).click();
            wd.findElement(By.name("q")).clear();
            wd.findElement(By.name("q")).sendKeys("WebDriver"+ Keys.ENTER);

        }
        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(10000);
            wd.quit();

        }

    }



