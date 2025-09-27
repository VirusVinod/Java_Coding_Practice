package automationClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		
		WebElement openMultipleTabs = driver.findElement(By.id("newTabsBtn"));
		openMultipleTabs.click();
		
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String window : allwindows ) {
			driver.switchTo().window(window);
			String currtenWindowTitle = driver.getTitle();
			
			
			if(currtenWindowTitle.contains("Basic Controls")){
				break;
				
			}
			
		}
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Vinod Singh");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Singh");
		

		
//		driver.quit();

	}

}
