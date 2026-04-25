package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqa2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Test");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Test");
		
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", maleRadio);
		
		WebElement mobileNo = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNo.sendKeys("9801928281");
		
//		DatePicker
		WebElement maleRadatePickerInputdio = driver.findElement(By.id("dateOfBirthInput"));
		js.executeScript("arguments[0].click()", maleRadatePickerInputdio);

		WebElement monthDropDown = driver.findElement(By.xpath(" //select[@class='react-datepicker__month-select']"));
		Select s = new Select(monthDropDown);
		s.selectByVisibleText("October");
		
		
	}

}
