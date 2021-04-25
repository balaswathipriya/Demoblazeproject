package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup  {
	
	 static WebDriver driver;
	
	public Signup(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(linkText="Sign up")static WebElement signup;
		@FindBy(id="sign-username")static WebElement username;
		@FindBy(id="sign-password")static WebElement password;
		@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")static WebElement signupbutton;


   public static WebElement sign_up() {
	   return signup;
	   
   }

   public static WebElement user_name() {
	   return username;
	   
   }
   
   public static WebElement pass_wrd() {
	   return password;
	   
   }
   public static WebElement signup_button() {
	   return signupbutton;
	   
   }
}	
		
		
		



