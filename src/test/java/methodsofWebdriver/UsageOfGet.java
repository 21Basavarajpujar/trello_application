package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// pass the main URL of the application
		// get() will wait for infinite amount of time untill webpage got loaded)
		driver.get("https://www.meesho.com/");
		driver.quit();
	}

}
