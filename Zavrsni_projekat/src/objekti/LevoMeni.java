package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LevoMeni {
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
	
	public static final String FISH1_XPATH = "//div[@id='Content']//a[1]//img[1]";
	public static final String DOG1_XPATH = "//div[@id='Content']//a[2]//img[1]";
	public static final String CAT1_XPATH = "//div[@id='Content']//a[3]//img[1]";
	public static final String REPTILES1_XPATH = "//div[@id='Content']//a[4]//img[1]";
	public static final String BIRDS1_XPATH = "//div[@id='Content']//a[5]//img[1]";
	

	
	public static WebElement getFish1(WebDriver driver) {
		return driver.findElement(By.xpath(FISH1_XPATH));
	}
	public static void clickFish1(WebDriver driver) {
		getFish1(driver).click();
	}

	public static WebElement getDog1(WebDriver driver) {
		return driver.findElement(By.xpath(DOG1_XPATH));
	}
	public static void clickDog1(WebDriver driver) {
		getDog1(driver).click();
	}
	public static WebElement getCat1(WebDriver driver) {
		return driver.findElement(By.xpath(CAT1_XPATH));
	}
	public static void clickCat1(WebDriver driver) {
		getCat1(driver).click();
	}
	public static WebElement getReptiles1(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES1_XPATH));
	}
	public static void clickReptiles1(WebDriver driver) {
		getReptiles1(driver).click();
	}
	public static WebElement getBirds1(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS1_XPATH));
	}
	public static void clickBirds1(WebDriver driver) {
		getBirds1(driver).click();
	}


}
