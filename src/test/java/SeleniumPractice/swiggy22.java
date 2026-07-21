package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy22 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");

		WebElement signinClick = driver.findElement(By.xpath("//div[@class='_3chg9']"));
		signinClick.click();

		WebElement mobileNo = driver.findElement(By.id("mobile"));
		mobileNo.sendKeys("8802867320");

		WebElement loginButtonclick = driver.findElement(By.xpath("//div[@class='_1cmcE _3R9Dd']"));
		loginButtonclick.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement otp = driver.findElement(By.id("otp"));
		otp.sendKeys("000000");
		
		WebElement veryfyOtp = driver.findElement(By.xpath("//div[@class='_1cmcE _3R9Dd']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		veryfyOtp.click();

	}

}
