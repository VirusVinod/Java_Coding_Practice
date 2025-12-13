package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assertionval {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
      
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            String expectedRes = "Swag Labs";
            WebElement ele = driver.findElement(By.xpath("//div[@class='login_logo']"));
            String actualRes = ele.getText().trim();

            Assert.assertEquals("Logo text mismatch!", expectedRes, actualRes);

            System.out.println("Assertion passed");

   
            driver.quit();
  
    }
}
