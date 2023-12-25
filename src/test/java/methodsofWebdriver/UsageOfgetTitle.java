package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitl= " + actualLoginPageTitle);
	}
}
