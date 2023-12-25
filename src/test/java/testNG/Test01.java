package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test01 {
   @Test(invocationCount = 4)
   public void calls() {
	  Reporter.log("Calls",true);
   }
   @Test(priority = -1,invocationCount = 2,enabled = false)
   public void Settings() {
	   Reporter.log("Settings",true);
   }
   @Test(priority = 1)
   public void Chat() {
	   Reporter.log("Chats",true);
   }
}
