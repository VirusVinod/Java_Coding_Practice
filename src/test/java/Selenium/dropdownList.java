package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		
		WebElement Dropdown = driver.findElement(By.xpath("//button[@id='menu1']"));
		Dropdown.click();
		
		List<WebElement> dropdownlist = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		 for(WebElement we : dropdownlist) {
			 String value = we.getText();	
			 System.out.println(value);
			 if(value.equals("JavaScript")) {
				 we.click();
				 break;
			 }
		 }

	}

}

// How can I get all elements from drop down list in Selenium WebDriver?
