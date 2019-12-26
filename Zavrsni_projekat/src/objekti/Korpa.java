package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Korpa {

	public static final String KORPA_XPATH = "//img[@name='img_cart']";
	public static final String ADDTOCHART_XPATH = "//a[@class='Button']";
	public static final String IGUANA_XPATH = "//a[contains(text(),'RP-LI-02')]";
	public static final String SIFRAIGUANA = "//a[contains(text(),'EST-13')]";
	public static final String QUANTITY_XPATH = "//input[@name='EST-13']";
	public static final String UPDATECHART_XPATH = "//input[@name='updateCartQuantities']";
	
	
	public static WebElement getKorpa(WebDriver driver) {
		return driver.findElement(By.xpath(KORPA_XPATH));
	}
	public static void clickKorpa(WebDriver driver) {
		getKorpa(driver).click();
	}
	public static WebElement getIguana(WebDriver driver) {
		return driver.findElement(By.xpath(IGUANA_XPATH));
	}
	public static void clickIguana(WebDriver driver) {
		getIguana(driver).click();
	}

	public static WebElement getAddToChart(WebDriver driver) {
		return driver.findElement(By.xpath(ADDTOCHART_XPATH));
	}
	public static void clickAddToChart(WebDriver driver) {
		getAddToChart(driver).click();
	}

	public static WebElement getQuantity(WebDriver driver) {
		return driver.findElement(By.xpath(QUANTITY_XPATH));
	}
	public static void clickQuantity(WebDriver driver) {
		getQuantity(driver).click();
	}
	public static void clearQuantity(WebDriver driver) {
		getQuantity(driver).clear();
	}
	public static void inputQuantity(WebDriver driver, String broj) {
		getQuantity(driver).sendKeys(broj);
	}
	public static WebElement getUpdate(WebDriver driver) {
		return driver.findElement(By.xpath(UPDATECHART_XPATH));
	}
	public static void clickUpdate(WebDriver driver) {
		getUpdate(driver).click();
	}

}
