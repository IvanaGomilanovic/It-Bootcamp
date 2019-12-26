package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	
	public static final String MYACCOUNT_XPATH = "//a[contains(text(),'My Account')]";
	public static final String SAVE_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/h3[2]";
	
	public static WebElement getMyAccount(WebDriver driver) {
		return driver.findElement(By.xpath(MYACCOUNT_XPATH));
	}
	public static void clickMyAccount(WebDriver driver) {
		getMyAccount(driver).click();
	}
	public static WebElement getSave(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_XPATH));
	}
	public static void clickSave(WebDriver driver) {
		getSave(driver).click();
	}
}
