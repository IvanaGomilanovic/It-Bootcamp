package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	
	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";
	
	public static final String LOGINURL = "//div[@id='WelcomeContent']";
	
	
	public static final String SIGNIN_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	public static final String USER_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	public static final String PASS_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	public static final String LOGINNBUTT_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	public static final String REG_XPATH = "//a[contains(text(),'Register Now!')]";
	public static final String SIGNOUT_XPATH = "//a[contains(text(),'Sign Out')]";
	public static final String WELCOME = "/html[1]/body[1]/div[2]/div[1]/div[1]";
	
	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_XPATH));
	}
	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}
	
	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(USER_XPATH));
	}
	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}
	public static void inputUserName(WebDriver driver, String tekst) {
		getUserName(driver).sendKeys(tekst);
	}
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASS_XPATH));
	}
	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}
	public static void clearPassword(WebDriver driver) {
		getPassword(driver).clear();
	}
	public static void inputPassword(WebDriver driver, String tekst) {
		getPassword(driver).sendKeys(tekst);
	}	
	
	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINNBUTT_XPATH));
	}
	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_XPATH));
	}
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
	public static WebElement getRegistration(WebDriver driver) {
		return driver.findElement(By.xpath(REG_XPATH));
	}
	public static void clickRegistration(WebDriver driver) {
		getRegistration(driver).click();
	}
	public static WebElement getWelcome(WebDriver driver) {
		return driver.findElement(By.xpath(WELCOME));
	}

	
}
