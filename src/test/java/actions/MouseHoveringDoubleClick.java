package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringDoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapp.skillrary.com/feedback.php");
		WebElement ele = driver.findElement(By.id("course"));

		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();

		WebElement addbtm = driver.findElement(By.id("add"));
		action.doubleClick(addbtm).perform();
	}
}
