package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registracija {

	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	
	public static final String USERID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	public static final String NEWPASS_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	
	public static final String PASS_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
	public static final String FNAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]";
	public static final String LNAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[2]/td[2]/input[1]";
	public static final String EMAIL_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[3]/td[2]/input[1]";
	public static final String PHONE_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[4]/td[2]/input[1]";
	public static final String ADDRESS1_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[5]/td[2]/input[1]";
	public static final String ADDRESS2_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[6]/td[2]/input[1]";
	public static final String CITY_XPATH = "//input[@name='account.city']";
	public static final String STATE_XPATH = "//input[@name='account.state']";
	public static final String ZIP_XPATH = "//input[@name='account.zip']";
	public static final String COUNTRY_XPATH = "//input[@name='account.country']";
	public static final String LANG_XPATH = "//select[@name='account.languagePreference']";
	public static final String FAV_XPATH = "//select[@name='account.favouriteCategoryId']";
	public static final String MYLIYST_XPATH = "//input[@name='account.listOption']";
	public static final String MYBANNER_XPATH = "//input[@name='account.bannerOption']";
	public static final String SAVEACCOUNT_XPATH = "//input[@name='newAccount']";
	
	//User id
	public static WebElement getUserID(WebDriver driver) {
		return driver.findElement(By.xpath(USERID_XPATH));
	}
	public static void clickUserID(WebDriver driver) {
		getUserID(driver).click();
	}
	public static void clearkUserID(WebDriver driver) {
		getUserID(driver).clear();
	}
	public static void inputUserID(WebDriver driver, String tekst) {
		getUserID(driver).sendKeys(tekst);
	}
	//New password
	public static WebElement getNewPass(WebDriver driver) {
		return driver.findElement(By.xpath(NEWPASS_XPATH));
	}
	public static void clickNewPass(WebDriver driver) {
		getNewPass(driver).click();
	}
	public static void clearNewPass(WebDriver driver) {
		getNewPass(driver).clear();
	}
	public static void inputNewPass(WebDriver driver, String tekst) {
		getNewPass(driver).sendKeys(tekst);
	}
	//Repeat password
	public static WebElement getPass(WebDriver driver) {
		return driver.findElement(By.xpath(PASS_XPATH));
	}
	public static void clickPass(WebDriver driver) {
		getPass(driver).click();
	}
	public static void clearPass(WebDriver driver) {
		getPass(driver).clear();
	}
	
	public static void inputPass(WebDriver driver, String tekst) {
		getPass(driver).sendKeys(tekst);
	}
	//First name
	public static WebElement getFName(WebDriver driver) {
		return driver.findElement(By.xpath(FNAME_XPATH));
	}
	public static void clickFName(WebDriver driver) {
		getFName(driver).click();
	}
	public static void clearFName(WebDriver driver) {
		getFName(driver).clear();
	}
	public static void inputFName(WebDriver driver, String tekst) {
		getFName(driver).sendKeys(tekst);
	}
	//Last name
	public static WebElement getLName(WebDriver driver) {
		return driver.findElement(By.xpath(LNAME_XPATH));
	}
	public static void clickLName(WebDriver driver) {
		getLName(driver).click();
	}
	public static void clearLName(WebDriver driver) {
		getLName(driver).clear();
	}
	public static void inputLName(WebDriver driver, String tekst) {
		getLName(driver).sendKeys(tekst);
	}
	//Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}
	public static void clearEmail(WebDriver driver) {
		getEmail(driver).clear();
	}
	public static void inputEmail(WebDriver driver, String tekst) {
		getEmail(driver).sendKeys(tekst);
	}
	//Phone
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(PHONE_XPATH));
	}
	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}
	public static void clearPhone(WebDriver driver) {
		getPhone(driver).clear();
	}
	public static void inputPhone(WebDriver driver, String tekst) {
		getPhone(driver).sendKeys(tekst);
	}
	//Address 1
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS1_XPATH));
	}
	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}
	public static void clearAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}
	public static void inputAddress1(WebDriver driver, String tekst) {
		getAddress1(driver).sendKeys(tekst);
	}
	//Address 2
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS2_XPATH));
	}
	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}
	public static void clearAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}
	public static void inputAddress2(WebDriver driver, String tekst) {
		getAddress2(driver).sendKeys(tekst);
	}
	//City
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(CITY_XPATH));
	}
	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}
	public static void clearCity(WebDriver driver) {
		getCity(driver).clear();
	}
	public static void inputCity(WebDriver driver, String tekst) {
		getCity(driver).sendKeys(tekst);
	}
	//State
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(STATE_XPATH));
	}
	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}
	public static void clearState(WebDriver driver) {
		getState(driver).clear();
	}
	public static void inputState(WebDriver driver, String tekst) {
		getState(driver).sendKeys(tekst);
	}
	//Zip
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ZIP_XPATH));
	}
	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}
	public static void clearZip(WebDriver driver) {
		getZip(driver).clear();
	}
	public static void inputZip(WebDriver driver, String tekst) {
		getZip(driver).sendKeys(tekst);
	}
	//Country
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY_XPATH));
	}
	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}
	public static void clearCountry(WebDriver driver) {
		getCountry(driver).clear();
	}
	public static void inputCountry(WebDriver driver, String tekst) {
		getCountry(driver).sendKeys(tekst);
	}
	//Language drop down list
	public static Select getLang(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANG_XPATH)));
	}
	
	public static void inputLang(WebDriver driver, String tekst) {
		getLang(driver).selectByVisibleText(tekst);
	}
	
	//Favorite drop down list
	public static Select getFav(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(FAV_XPATH)));
	}
	
	public static void inputFav(WebDriver driver, String tekst) {
		getFav(driver).selectByVisibleText(tekst);
	}
	//My list check box
	public static WebElement getMyList(WebDriver driver) {
		return driver.findElement(By.xpath(MYLIYST_XPATH));
	}
	public static void clickMyList(WebDriver driver) {
		getMyList(driver).click();
	}
	//My banner check box
	public static WebElement getMyBanner(WebDriver driver) {
		return driver.findElement(By.xpath(MYBANNER_XPATH));
	}
	public static void clickMyBanner(WebDriver driver) {
		getMyBanner(driver).click();
	}
	//Save account info
	public static WebElement getSaveAcc(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEACCOUNT_XPATH));
	}
	public static void clickSaveAcc(WebDriver driver) {
		getSaveAcc(driver).click();
	}
}
