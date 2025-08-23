package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screnshot4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		File screnn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("asdsafsd.png");
		try {
			FileUtils.copyFile(screnn, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
