package testovi;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.LevoMeni;


public class TestLevoMeni {
	
  @Test
  public static void a() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(LevoMeni.URL);
		LevoMeni.clickFish1(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(url, LevoMeni.FISHURL);
		
		as.assertAll();
  	}	  
  @Test
  public static void b() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(LevoMeni.URL);
		LevoMeni.clickDog1(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(url, LevoMeni.DOGURL);
	
		as.assertAll();
  	}
  @Test
  public static void c() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(LevoMeni.URL);
		LevoMeni.clickCat1(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(url, LevoMeni.CATURL);
	
		as.assertAll();
  	}
  @Test
  public static void d() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(LevoMeni.URL);
		LevoMeni.clickReptiles1(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(url, LevoMeni.REPTILESURL);
		as.assertAll();
  	}
  @Test
  public static void e() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(LevoMeni.URL);
		LevoMeni.clickBirds1(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(url, LevoMeni.BIRDURL);
		
		as.assertAll();
  	}
  
	  
}
