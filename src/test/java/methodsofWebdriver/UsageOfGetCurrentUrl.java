package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pib.gov.in/indexd.aspx");
		String actualoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualoginPageUrl =" + actualoginPageUrl);
	}

}
