package salesForceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
		WebDriver driver;

		String browserType ="1";

		

		//String browser =System.getProperty("Browser.name").toLowerCase();

		

		if(browserType.equals("1"))

		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navya\\Documents\\SeleniumFiles\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");

		}

		

		else

		{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Navya\\Documents\\SeleniumFiles\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://login.salesforce.com/");

		}

		

	//common code

		driver.get("https://www.salesforce.com");

		driver.manage().window().maximize();

	}

}