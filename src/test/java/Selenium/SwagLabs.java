package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement email = driver.findElement(By.id("user-name"));
		email.sendKeys("standard_user");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();

		String targetProduct  = "Sauce Labs Bolt T-Shirt";
		List<WebElement> productList  = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        for (WebElement product : productList) {
            String productName = product.findElement(By.xpath(".//div[@class='inventory_item_name ']")).getText();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", product);
            if (productName.equals(targetProduct)) {
                WebElement addToCartButton = product.findElement(By.xpath(".//button[contains(@class,'btn_inventory')]"));
                addToCartButton.click();
                System.out.println("Added to cart: " + productName);
                break;
            }

        }


        WebElement clickaCrad = driver.findElement(By.id("shopping_cart_container"));
        clickaCrad.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Test Build11");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("USA Test1");

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("110095");

        WebElement ccontinue = driver.findElement(By.id("continue"));
        ccontinue.click();

        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();

	}


}
