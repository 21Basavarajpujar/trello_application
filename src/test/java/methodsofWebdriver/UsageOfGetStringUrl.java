package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetStringUrl {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// pass the main Url of the app
		// get() will wait for infinite amount of time until the webpage has got loaded
		// loading is a process will happen
		// - slow Internet connection
		// - poor business logic in the server
		// - computer/machine is busy in processing the request
		driver.get("https://www.facebook.com/");
		// pass the sub URL of the app and check
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	}
}
