package Selenium_Intetview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement e : links) {
			String url = e.getDomAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("Url  is empty");
				continue;
			}
			try {
				URL u = new URI(url).toURL();
				HttpURLConnection http = (HttpURLConnection) u.openConnection();
				if (http.getResponseCode() > 400) {
					System.out.println("Broken link" + u);
				}
			} catch (URISyntaxException r) {
				System.out.println("Invalid URL: " + url);
			} catch (IOException p) {
	            System.out.println("🌐 Connection Issue: " + url);
	        }
		}
	}

}
