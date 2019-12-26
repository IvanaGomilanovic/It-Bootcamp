package testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.Home_page;

public class TestKlikSignIn {
  @Test
  public static void testKlikSignIn() {
		System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Home_page.URL);
		Home_page.clickSignIn(driver);
		String url = driver.getCurrentUrl();
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(Home_page.SIGNURL, url);
		as.assertAll();
  
  }

  
}
