package automationClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement drop = driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
		drop.click();

		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));

		for (WebElement ele : allList) {
			String name = ele.getText();
			if (name.equals("JavaScript")) {
				ele.click();
				System.out.println(name);
				break;
			}
		}
		driver.quit();
	}

}
