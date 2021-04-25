package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
static WebDriver driver;
	
	public Cart (WebDriver driver) {
		
		Cart.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath="//*[@id=\"cartur\"]")static WebElement cart;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/tr/td[2]")static WebElement monitortitle;
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")static WebElement placeorder;
	
	@FindBy(id="name")static WebElement name;
	@FindBy(id="country")static WebElement country;
	@FindBy(id="city")static WebElement city;
	@FindBy(id="card")static WebElement card;
	@FindBy(id="month")static WebElement month;
	@FindBy(id="year")static WebElement year;
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")static WebElement purchase;
	
	public static WebElement cart_() {
		return cart;
	}
	public static WebElement monitor_title() {
		return monitortitle;
	}
	public static WebElement place_order() {
		return placeorder;
	}
	
	public static WebElement name_() {
		return name;
	}
	public static WebElement country_() {
		return country;
		
	}
	public static WebElement city_() {
		return city;
		
	}
	public static WebElement card_() {
		return card;
		
	}
	public static WebElement month_() {
		return month;
		
	}
	public static WebElement year_() {
		return year;
		
	}
	public static WebElement purchase_() {
		return purchase;
		
	}
}
