package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlikeMeni {

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
	
	public static final String FISH3_XPATH = "//body//area[2]";
	public static final String DOG3_XPATH = "//body//area[3]";
	public static final String CAT3_XPATH = "//body//area[5]";
	public static final String REPTILES3_XPATH = "//body//area[4]";
	public static final String BIRDS3_XPATH = "//body//area[6]";
	public static final String LARGEBIRD_XPATH = "//body//area[1]";
	
	
	
	public static WebElement getFish3(WebDriver driver) {
		return driver.findElement(By.xpath(FISH3_XPATH));
	}
	public static void clickFish3(WebDriver driver) {
		getFish3(driver).click();
	}

	public static WebElement getDog3(WebDriver driver) {
		return driver.findElement(By.xpath(DOG3_XPATH));
	}
	public static void clickDog3(WebDriver driver) {
		getDog3(driver).click();
	}
	public static WebElement getCat3(WebDriver driver) {
		return driver.findElement(By.xpath(CAT3_XPATH));
	}
	public static void clickCat3(WebDriver driver) {
		getCat3(driver).click();
	}
	public static WebElement getReptiles3(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES3_XPATH));
	}
	public static void clickReptiles3(WebDriver driver) {
		getReptiles3(driver).click();
	}
	public static WebElement getBirds3(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS3_XPATH));
	}
	public static void clickBirds3(WebDriver driver) {
		getBirds3(driver).click();
	}
	
	
	public static WebElement getLargeBird(WebDriver driver) {
		return driver.findElement(By.xpath(LARGEBIRD_XPATH));
	}
	public static void clickLargeBird(WebDriver driver) {
		getLargeBird(driver).click();
	}
	
}
