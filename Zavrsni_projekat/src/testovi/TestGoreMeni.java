package testovi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.GoreMeni;
import objekti.SlikeMeni;



public class TestGoreMeni {
  @Test
  public static void a() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(GoreMeni.URL);
		GoreMeni.clickFish2(driver);
		
		boolean naslov = driver.findElement(By.xpath(SlikeMeni.NASLOVFISH)).isDisplayed();
		SoftAssert as = new SoftAssert();
		as.assertTrue(naslov);
		driver.close();
  }
  
  @Test
  public static void  b() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(GoreMeni.URL);
		GoreMeni.clickDog2(driver);
		
		boolean naslov = driver.findElement(By.xpath(SlikeMeni.NASLOVDOG)).isDisplayed();
		SoftAssert as = new SoftAssert();
		as.assertTrue(naslov);
		driver.close();
  }
  
  @Test
  public static void  c() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(GoreMeni.URL);
		GoreMeni.clickReptiles2(driver);
		
		boolean naslov = driver.findElement(By.xpath(SlikeMeni.NASLOVREPTILES)).isDisplayed();
		SoftAssert as = new SoftAssert();
		as.assertTrue(naslov);
		driver.close();
  }
  
  @Test
  public static void  d() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(GoreMeni.URL);
		GoreMeni.clickCat2(driver);
		
		boolean naslov = driver.findElement(By.xpath(SlikeMeni.NASLOVCAT)).isDisplayed();
		SoftAssert as = new SoftAssert();
		as.assertTrue(naslov);
		driver.close();
  }
  @Test
  public static void  e() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(GoreMeni.URL);
		GoreMeni.clickBirds2(driver);
		
		boolean naslov = driver.findElement(By.xpath(SlikeMeni.NASLOVBIRDS)).isDisplayed();
		SoftAssert as = new SoftAssert();
		as.assertTrue(naslov);
		driver.close();
  }
}
