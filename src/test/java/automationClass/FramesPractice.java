package automationClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.switchTo().frame("frm1");
		
		WebElement dropdownValue = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		Select s = new Select(dropdownValue);
		s.selectByIndex(1);
		
		driver.switchTo().defaultContent();

		
		driver.switchTo().frame("frm2");
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Vinod");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("test@gmail.com");
		
	}

}
