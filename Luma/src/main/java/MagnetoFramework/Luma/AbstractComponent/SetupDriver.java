package MagnetoFramework.Luma.AbstractComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupDriver {
	WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		// properties class
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\MagnetoFramework\\Luma\\resources\\GlobalData.properties");
		pr.load(fis);
		String browserName = pr.getProperty("browser");

		if (browserName.contains("chrome")) {
//			ChromeOptions op=new ChromeOptions();

			System.setProperty("webdriver.chrome.driver", "E:\\New folder\\BDD\\Luma\\Drivers\\chromedriver.exe");
//			op.addArguments("headless");
			driver = new ChromeDriver();// ChromeDriver(op);
		}

		if (browserName.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\New folder\\BDD\\Luma\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		if (browserName.contains("edge")) {
			System.setProperty("webdriver.edge.driver", "E:\\New folder\\BDD\\Luma\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver launchApplication() throws IOException {
		driver = initializeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		return driver;
	}
	public void closeTheApplication() {
		driver.close();
	}

}
