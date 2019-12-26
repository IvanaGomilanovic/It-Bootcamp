package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoreMeni {

	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";
	
	
	public static final String FISHURL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DOGURL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String CATURL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String REPTILESURL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String BIRDURL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String NASLOVFISH = "//h2[contains(text(),'Fish')]";
	public static final String NASLOVDOG = "//h2[contains(text(),'Dogs')]";
	public static final String NASLOVCAT = "//h2[contains(text(),'Cats')]";
	public static final String NASLOVREPTILES = "//h2[contains(text(),'Reptiles')]";
	public static final String NASLOVBIRDS = "//h2[contains(text(),'Birds')]";
	
	public static final String FISH2_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String DOG2_XPATH = "//div[@id='Header']//a[2]//img[1]";
	public static final String CAT2_XPATH = "//div[@id='Header']//a[4]//img[1]";
	public static final String REPTILES2_XPATH = "//div[@id='Header']//a[3]//img[1]";
	public static final String BIRDS2_XPATH = "//div[@id='Header']//a[5]//img[1]";
	
	
	
		
	public static WebElement getFish2(WebDriver driver) {
		return driver.findElement(By.xpath(FISH2_XPATH));
	}
	public static void clickFish2(WebDriver driver) {
		getFish2(driver).click();
	}

	public static WebElement getDog2(WebDriver driver) {
		return driver.findElement(By.xpath(DOG2_XPATH));
	}
	public static void clickDog2(WebDriver driver) {
		getDog2(driver).click();
	}
	public static WebElement getCat2(WebDriver driver) {
		return driver.findElement(By.xpath(CAT2_XPATH));
	}
	public static void clickCat2(WebDriver driver) {
		getCat2(driver).click();
	}
	public static WebElement getReptiles2(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES2_XPATH));
	}
	public static void clickReptiles2(WebDriver driver) {
		getReptiles2(driver).click();
	}
	public static WebElement getBirds2(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS2_XPATH));
	}
	public static void clickBirds2(WebDriver driver) {
		getBirds2(driver).click();
	}

}
