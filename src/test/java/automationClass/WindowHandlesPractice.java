package automationClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		WebElement openNewTab = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		openNewTab.click();

		Set<String> handleChildWindow = driver.getWindowHandles();
		for (String e : handleChildWindow) {
			if (!e.equals(parentId)) {
				driver.switchTo().window(e);
				driver.manage().window().maximize();
				break;
			}
		}

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Vinod");

		driver.close();

		driver.switchTo().window(parentId);

		WebElement newTabBtn = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		newTabBtn.click();

	}

}
