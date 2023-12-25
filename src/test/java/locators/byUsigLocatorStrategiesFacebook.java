package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byUsigLocatorStrategiesFacebook  {
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("basavarajpujar422@gmail.com");
driver.findElement(By.name("pass")).sendKeys("9035110872");
driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("9035110872");
driver.findElement(By.cssSelector("button[value='1']")).click();
	}
}
