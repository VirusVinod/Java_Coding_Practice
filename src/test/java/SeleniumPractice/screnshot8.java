package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screnshot8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		File screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File("screnshot.jpg");
		try {
			FileUtils.copyFile(screnshot, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}
