package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// pass the main URL of the app
		driver.get("https://www.facebook.com/");
		// capture the page source
		String pageSource = driver.getPageSource();
		// System.out.println(pageSource)
		String sourceTocheck = "Facebook helps you connect and share with the people in your lifeA";
		if (pageSource.contains(sourceTocheck)) {
			System.out.println("pass");
		} else
			System.out.println("Fail");
		driver.manage().window().minimize();
		driver.quit();
	}
}
