package goodReadScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goodreads.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	driver.findElement(By.className("gr-button gr-button--dark gr-button--auth authPortalConnectButton authPortalSignInButton")).click();
	
}
}
