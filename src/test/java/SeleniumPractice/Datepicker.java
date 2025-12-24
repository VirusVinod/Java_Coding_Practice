package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement monthDropDown = driver.findElement(By.xpath(" //select[@class='react-datepicker__month-select']"));
		Select s = new Select(monthDropDown);
		s.selectByVisibleText("October");

		WebElement yearDropDown = driver.findElement(By.xpath(" //select[@class='react-datepicker__year-select']"));
		Select y = new Select(yearDropDown);
		y.selectByVisibleText("2023");
		
		
		String expected = "24";
		List<WebElement> alldate = driver.findElements(By.xpath("//div[@role='option']"));

		for (WebElement a : alldate) {
			String date = a.getText();

			if (date.equals(expected)) {
				a.click();
				break;
			}
		}

	}

}
