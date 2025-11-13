package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", maleRadio);

//		DatePicker
		WebElement maleRadatePickerInputdio = driver.findElement(By.id("dateOfBirthInput"));
		js.executeScript("arguments[0].click()", maleRadatePickerInputdio);

		WebElement monthDropDown = driver.findElement(By.xpath(" //select[@class='react-datepicker__month-select']"));
		Select s = new Select(monthDropDown);
		s.selectByVisibleText("October");

		WebElement yearDropDown = driver.findElement(By.xpath(" //select[@class='react-datepicker__year-select']"));
		Select y = new Select(yearDropDown);
		y.selectByVisibleText("2023");

		String ExpectdatedDate = "8";
		List<WebElement> allDates = driver.findElements(By.xpath(" //div[@role='option']"));

		for (WebElement a : allDates) {
			String date = a.getText();
			System.out.println(date);

			if (date.equals(ExpectdatedDate)) {
				a.click();
				break;
			}
		}

//		Select state and city
		WebElement stateDropdown = driver.findElement(By.cssSelector("div#state div.css-yk16xz-control"));
		js.executeScript("arguments[0].click()", stateDropdown);

		WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
		stateInput.sendKeys("NCR");
		stateInput.sendKeys(Keys.ENTER);

//	   Select City
		WebElement cityDropdown = driver.findElement(By.cssSelector("#city div.css-yk16xz-control"));
		js.executeScript("arguments[0].click()", cityDropdown);

		WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
		cityInput.sendKeys("Delhi");
		cityInput.sendKeys(Keys.ENTER);
	}

}
