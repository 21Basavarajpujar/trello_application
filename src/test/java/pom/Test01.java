package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 // WebElement ele = driver.findElement(By.name("q"));
		GooglePage g = new GooglePage(driver);
		driver.navigate().refresh();
		
		//ele.sendKeys("Phone");
		
		g.Search("Phone");
	}
}
