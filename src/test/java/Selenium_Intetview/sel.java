package Selenium_Intetview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();



	}
}