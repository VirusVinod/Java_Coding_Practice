package automationClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		WebElement alertBox = driver.findElement(By.id("alertBox"));
//		alertBox.click();
		
//		Switch to Popup : 
//			accept()
//			dismiss()
//			sendKeys()
		
		
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
		WebElement confirmBox1 = driver.findElement(By.id("promptBox"));
		confirmBox1.click();
		
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Automation Testing By Vinod Singh");
		a1.accept();

		
	}

}
