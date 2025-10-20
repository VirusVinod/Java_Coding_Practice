package automationClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "./src/test/java/automationClass/env.properties");
			Properties prop = new Properties();
			prop.load(file);
			String urlName = prop.getProperty("browser");
			System.out.println(urlName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
