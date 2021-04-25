package uitesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objrep.Login;
import testbase.Browser;

public class Logintest extends Browser {
	//static WebDriver driver;
	@BeforeTest
	public static void l1() throws Exception {
		Browser.invokebrowser();
		
	}
	@Test
    public static void l2() throws InterruptedException {
    
		Login ln=new Login(driver);
    	ln.log_in().click(); 
    	ln.login_username().sendKeys("swathi123");
    	ln.login_password().sendKeys("swathi123");
    	ln.login_button().click();
    	Thread.sleep(1000);
    	ln.monitor_().click();
    	ln.apple_monitor24().click();
    	ln.addto_cart().click();
    }
}
