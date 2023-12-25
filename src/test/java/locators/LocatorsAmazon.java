package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAmazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/gp/css/homepage.html/ref=nav_bb_ya");
		driver.findElement(By.id("nav-link-accountList")).click();
//		driver.findElement(By.cssSelector("input[maxlength='128']")).sendKeys("basavarajpujar422@gmail.com");
		driver.findElement(By.name("email")).sendKeys("basavarajpujar422@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("9035110872");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("otp-input-box-container")).sendKeys("708513");
		driver.findElement(By.id("cvf-submit-otp-button-announce")).click();
	}
}
