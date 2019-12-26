package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {

	public static final String URL = "https://petstore.octoperf.com/";
	public static final String JPETSTORE = "//div[@id='LogoContent']//a//img";
	public static final String ENTEREDURL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String SIGNURL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	
	public static final String ENTER_XPATH = "//a[contains(text(),'Enter the Store')]";
	public static final String SIGNIN_XPATH = "//a[contains(text(),'Sign In')]";

	
	public static WebElement getEnter(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_XPATH));
	}
	public static void clickEnter(WebDriver driver) {
		getEnter(driver).click();
	}
	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_XPATH));
	}
	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}
	public static WebElement getJPetStore(WebDriver driver) {
		return driver.findElement(By.xpath(JPETSTORE));
	}
	public static void clickJPetStore(WebDriver driver) {
		getJPetStore(driver).click();
	
	}
	
}
