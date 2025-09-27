package automationClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/* Method 01 if Select of checklist */
//		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
//
//		for (WebElement ele : checkbox) {
//			ele.click();
//		}

		/* Method 02 if Select of conition base */

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));

		for (WebElement ele : checkbox) {
			String id = ele.getAttribute("id");
			if (id.equals("englishchbx") || id.equals("hindichbx")) {

				ele.click();
//				break;
			}

		}

		/* Method 03 if Select of conition base */

//		List<WebElement> checkbox1 = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
//
//		for (WebElement ele : checkbox1) {
//
//			if (!ele.isSelected()) {
//				ele.click();
//			}
//
//		}

	}

}
