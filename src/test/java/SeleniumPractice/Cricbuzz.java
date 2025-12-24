package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/women/batting");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String expectedRes = "Ashleigh Gardner";

		List<WebElement> allList = driver.findElements(By.xpath("//div[@class='text-base font-medium']"));

		for (WebElement getName : allList) {

			String name = getName.getText().trim();
			if (name.equals(expectedRes)) {

				WebElement row = getName.findElement(By.xpath(".//ancestor::div[contains(@class,'grid grid-cols-4')]"));

				WebElement points = row.findElement(By.xpath(".//div[@class='col-span-1 text-base text-right mr-1']"));

				System.out.println("Player: " + name + " | Points: " + points.getText());
				break;

			}
		}
	}

}
