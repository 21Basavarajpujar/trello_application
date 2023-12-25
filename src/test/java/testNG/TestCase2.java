package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	public WebDriver driver;

	@BeforeMethod
	public void OpenTheApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void ForgotPassword() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("12345678");
		driver.findElement(By.xpath("//div[text()='Request Login Info']")).click();
		Reporter.log(driver.getTitle(), true);
		Reporter.log(driver.getCurrentUrl(), true);
	}

	@AfterMethod
	public void CloseTheApp() {
		driver.close();
	}
}
