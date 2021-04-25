package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	static WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}

	@FindBy(xpath="//*[@id=\"login2\"]")static WebElement login;
	@FindBy(id="loginusername")static WebElement loginusername;
	@FindBy(id="loginpassword")static WebElement loginpassword;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")static WebElement loginbutton;
	
	@FindBy(linkText="Monitors")static WebElement monitors;
	@FindBy(linkText="Apple monitor 24")static WebElement applemonitor24;
	@FindBy(linkText="Add to cart")static WebElement addtocard;
	
	public static WebElement log_in() {
		return login;
	}
	
	public static WebElement login_username() {
		return loginusername;
	}
	public static WebElement login_password() {
		return loginpassword;
	}
	public static WebElement login_button() {
		return loginbutton;
	}
	public static WebElement monitor_() {
		return monitors;
	}
	public static WebElement apple_monitor24() {
		return applemonitor24;
	}
	public static WebElement addto_cart() {
		return addtocard;
	}
	}
