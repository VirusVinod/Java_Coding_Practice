package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));

		for (WebElement allckeck : checkbox) {
			String id = allckeck.getAttribute("id");
			if (id.equals("englishchbx") || id.equals("spanishchbx")) {
				allckeck.click();
			}
		}

	}

}
