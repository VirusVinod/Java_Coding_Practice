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

public class BrokenLinks2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        String baseURL = driver.getCurrentUrl();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement e : links) {
            String url = e.getDomAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("⚠️ Skipping empty URL");
                continue;
            }

            try {
                if (!url.startsWith("http")) {
                    url = new URI(baseURL).resolve(url).toString();
                }

                URL u = new URI(url).toURL();
                HttpURLConnection http = (HttpURLConnection) u.openConnection();
                http.setRequestMethod("HEAD");
                http.setConnectTimeout(5000);
                http.setReadTimeout(5000);
                http.connect();

                int responseCode = http.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("Broken link: " + u + " | Response Code: " + responseCode);
                } else {
                    System.out.println("Valid link: " + u + " | Response Code: " + responseCode);
                }

                http.disconnect();
            } catch (URISyntaxException r) {
                System.out.println("Invalid URL: " + url);
            } catch (IOException p) {
                System.out.println("Connection Issue: " + url);
            }
        }
        driver.quit();
    }
}