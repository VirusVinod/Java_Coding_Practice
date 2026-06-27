package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy14 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");

		WebElement signinClick = driver.findElement(By.xpath("//div[@class='_3chg9']"));
		signinClick.click();

		WebElement mobileNo = driver.findElement(By.id("mobile"));
		mobileNo.sendKeys("8802867320");
	}

}
