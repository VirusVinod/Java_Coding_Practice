package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screnshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));


		File screnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("abc.png");
		FileUtils.copyFile(screnshot, des);


	}

}
