package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtab = driver.findElement(By.id("input"));
		searchtab.sendKeys("seleni");
		// List<WebElement> Ele = driver.findElements(By.xpath(""));
		// System.out.println(Ele.size());
		driver.close();

	}
}
