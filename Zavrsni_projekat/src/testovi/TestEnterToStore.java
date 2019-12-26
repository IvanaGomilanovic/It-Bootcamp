package testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.Home_page;

public class TestEnterToStore {
  @Test
  public static void testUrl() {
		System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Home_page.URL);
		String url = driver.getCurrentUrl();
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(Home_page.URL, url);
		as.assertAll();
  }
  
  @Test
  public static void testEnterToStore() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Home_page.URL);
		Home_page.clickEnter(driver);
		String url = driver.getCurrentUrl();
		
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(Home_page.ENTEREDURL, url);
		as.assertAll();
  }
}
