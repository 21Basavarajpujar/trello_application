package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsById_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/login");
		// find the user name text field
		WebElement mobilenumberTextfield = driver.findElement(By.className("username"));
		mobilenumberTextfield.sendKeys("9035110872");
		Thread.sleep(5000);
		// WebElement passWordTextfield = driver.findElement(By.name("pwd"));
		// passWordTextfield.sendKeys("0123456789");
		// Thread.sleep(5000);
		driver.quit();

	}

	private static void passwordTextField(String string) {
		// TODO Auto-generated method stub

	}
}
