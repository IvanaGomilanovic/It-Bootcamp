package testovi;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.SlikeMeni;



public class TestSlikeMeni {
  @Test
  public static void a() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get(SlikeMeni.URL);
		SlikeMeni.clickFish3(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(url, SlikeMeni.FISHURL);
		
		as.assertAll();
		driver.close();
			
	  }
  @Test
  public static void b() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.get(SlikeMeni.URL);
			SlikeMeni.clickDog3(driver);
			String url = driver.getCurrentUrl();
			
			SoftAssert as = new SoftAssert();
			as.assertEquals(url, SlikeMeni.DOGURL);
			
			as.assertAll();
			driver.close();
	  }
  @Test
  public static void c() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.get(SlikeMeni.URL);
			SlikeMeni.clickReptiles3(driver);
			String url = driver.getCurrentUrl();
			
			SoftAssert as = new SoftAssert();
			as.assertEquals(url, SlikeMeni.REPTILESURL);
			
			as.assertAll();
			driver.close();
	  }
  @Test
  public static void d() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.get(SlikeMeni.URL);
			SlikeMeni.clickCat3(driver);
			String url = driver.getCurrentUrl();
			
			SoftAssert as = new SoftAssert();
			as.assertEquals(url, SlikeMeni.CATURL);
			
			as.assertAll();
			driver.close();
	  }
  @Test
  public static void e() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.get(SlikeMeni.URL);
			SlikeMeni.clickBirds3(driver);
			String url = driver.getCurrentUrl();
			
			SoftAssert as = new SoftAssert();
			as.assertEquals(url, SlikeMeni.BIRDURL);
			
			as.assertAll();
			driver.close();
	  }
  @Test
  public static void f() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.get(SlikeMeni.URL);
			SlikeMeni.clickLargeBird(driver);
			String url = driver.getCurrentUrl();
			
			SoftAssert as = new SoftAssert();
			as.assertEquals(url, SlikeMeni.BIRDURL);
			
			as.assertAll();
			driver.close();
	  }
  }

