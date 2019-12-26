package testovi;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.Home_page;
import objekti.Korpa;
import objekti.LevoMeni;
import objekti.SignIn;
import excel.Utility;

public class TestKorpa {
  @Test
  public static void ubacivanjeArtiklaIProvera() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Utility.setExcell("UserRandomData.xlsx");
		Utility.setWorkSheet(0);
		String s;
		
		driver.get(SignIn.URL);
		SignIn.clickSignIn(driver);
		
		
		SignIn.clickUserName(driver);
		  s = Utility.getDataAt(1, 0);
		  SignIn.inputUserName(driver, s); 
		
		  SignIn.clickPassword(driver);
		  SignIn.clearPassword(driver); 
		 s = Utility.getDataAt(1, 1);
		  SignIn.inputPassword(driver, s);
		  SignIn.clickLogIn(driver);
		  
		 LevoMeni.clickReptiles1(driver);
		 Korpa.clickIguana(driver);
		 Korpa.clickAddToChart(driver);
		 Korpa.clickQuantity(driver);
		 Korpa.clearQuantity(driver);
		 Korpa.inputQuantity(driver, "5");
		
		 Korpa.clickUpdate(driver);
		 Home_page.clickJPetStore(driver);
		 Korpa.clickKorpa(driver);
			boolean iguana = driver.findElement(By.xpath(Korpa.SIFRAIGUANA)).isDisplayed();
			SoftAssert as = new SoftAssert();
			as.assertTrue(iguana);
	  
  }
}
