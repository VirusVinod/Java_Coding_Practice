package Selenium_Intetview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");


        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr[position()>1]"));
        for (int i = 1; i < rows.size(); i++) { // start from 1 to skip header
            WebElement row = rows.get(i);
            List<WebElement> columns = row.findElements(By.tagName("td"));

            String country = columns.get(2).getText(); // 3rd column = Country
            if (country.equalsIgnoreCase("UK")) {
                String company = columns.get(0).getText(); // 1st column = Company
                String contact = columns.get(1).getText(); // 2nd column = Contact

                System.out.println("Country: " + country);
                System.out.println("Company: " + company);
                System.out.println("Contact: " + contact);
                break;
            }
        }

	}

}
