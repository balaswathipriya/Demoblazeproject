package uitesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Extentreport;
import commonmethods.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;
import objrep.Cart;
import objrep.Login;
import objrep.Signup;
import testbase.Browser;



public class Signuptest extends Browser{
	//static WebDriver driver;
	
	@BeforeTest
	public static void esetup() {
		Extentreport.setup();
	}
	
	@BeforeTest
	public static void m() throws Exception  {
	
		// TODO Auto-generated constructor stub
		Browser.invokebrowser();
		
		 }
	@Test(priority=1)
	public static void m1() throws InterruptedException {
	
		Signup su = new Signup(driver);
	     WebDriverWait wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(su.sign_up()));
		 su.sign_up().click();
		 su.user_name().sendKeys("1232mhjvddyu75gjhhfskuu66");
		 su.pass_wrd().sendKeys("123456ppp1112223"); 
		 su.signup_button().click();
         
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Extentreport.repopass();
         
		 }
	@Test(priority=2)
    public static void m2() throws InterruptedException {
		
        Login ln=new Login(driver);
    	ln.log_in().click(); 
    	ln.login_username().sendKeys("123456ppp1112223");
    	ln.login_password().sendKeys("123456ppp1112223");
    	ln.login_button().click();
    	Thread.sleep(1000);
    	ln.monitor_().click();
    	ln.apple_monitor24().click();
    	ln.addto_cart().click();
    	Thread.sleep(2000);
    	driver.switchTo().alert().accept();
    	Extentreport.repopass();
    
}
	@Test(priority=3)
        public static void m3() throws Exception {
		Cart ct=new Cart(driver);
		ct.cart_().click();
		String title= ct.monitor_title().getText();
		System.out.println(title);
		
		if(title.contains("Apple monitor 24")) {
		System.out.println("correct");
		Extentreport.repopass();
		}else {
			Screenshot.schot();
			System.out.println("incorrect");
			Extentreport.repofail();
		}
		ct.place_order().click();
		ct.name_().sendKeys("swathi");
		ct.country_().sendKeys("UK");
		ct.city_().sendKeys("halifax");
		ct.card_().sendKeys("122333");
		ct.month_().sendKeys("september");
		ct.year_().sendKeys("09");
		ct.purchase_().click();
		
	}

}	 

	
	
