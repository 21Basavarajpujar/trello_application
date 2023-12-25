package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 {
	public WebDriver driver;

	@BeforeMethod
	public void OpenTheApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void Login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String Title = driver.getTitle();
// example for hard Assert next line of code will not execute
//when actual and expected title are not matching then we get assertion error
//Assert.assertEquals(Title, "abcdef"); 
		SoftAssert s = new SoftAssert();
		s.assertEquals(Title, "cut21121212y");
		Reporter.log(Title, true);
		s.assertAll();

		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
