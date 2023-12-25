package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byUsingXpathByGroupIndex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[maxlength='75']")).sendKeys("9035110872");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Basu@2023");
		driver.findElement(By.xpath("(//div[contains(@class,'x9f619 xjbqb8w')])[3]")).click();
		driver.quit();
	}
}
