package testovi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objekti.Home_page;
import objekti.MyAccount;
import objekti.Registracija;
import objekti.SignIn;
import excel.Utility;

public class MyAccountTest {
  @Test
  public static void myAccountIzmena() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(SignIn.URL);
		
		Home_page.clickSignIn(driver);
		Utility.setExcell("UserRandomData.xlsx");
		Utility.setWorkSheet(0);
		String s;
		SignIn.clickUserName(driver);
		  s = Utility.getDataAt(1, 0);
		  SignIn.inputUserName(driver, s); 
		
		  SignIn.clickPassword(driver);
		  SignIn.clearPassword(driver); 
		 s = Utility.getDataAt(1, 1);
		  SignIn.inputPassword(driver, s);
		  SignIn.clickLogIn(driver);
		 MyAccount.clickMyAccount(driver);
		 
						
			Registracija.clickPass(driver);
			Registracija.clickNewPass(driver);
			s = Utility.getDataAt(52, 1);
			Registracija.inputPass(driver, s);
			Registracija.inputNewPass(driver, s);
		
			
			// FirstName
			Registracija.clickFName(driver);
			Registracija.clearFName(driver);
			s = Utility.getDataAt(52, 2);
			Registracija.inputFName(driver, s);

			// LastName
			Registracija.clickLName(driver);
			Registracija.clearLName(driver);
			s = Utility.getDataAt(52, 3);
			Registracija.inputLName(driver, s);

			// Email
			Registracija.clickEmail(driver);
			Registracija.clearEmail(driver);
			s = Utility.getDataAt(52, 4);
			Registracija.inputEmail(driver, s);

			// Phone
			Registracija.clickPhone(driver);
			Registracija.clearPhone(driver);
			s = Utility.getDataAtNum(52, 5);
			Registracija.inputPhone(driver, s);

			//Address1
			Registracija.clickAddress1(driver);
			Registracija.clearAddress1(driver);
			s = Utility.getDataAt(52, 6);
			Registracija.inputAddress1(driver, s);
			//Address2
			Registracija.clickAddress2(driver);
			Registracija.clearAddress2(driver);
			s = Utility.getDataAt(52, 7);
			Registracija.inputAddress2(driver, s);
					
			//City
			Registracija.clickCity(driver);
			Registracija.clearCity(driver);
			s = Utility.getDataAt(52, 8);
			Registracija.inputCity(driver, s);
			
			//State
			Registracija.clickState(driver);
			Registracija.clearState(driver);
			s = Utility.getDataAt(52, 9);
			Registracija.inputState(driver, s);
			
			//Zip
			Registracija.clickZip(driver);
			Registracija.clearZip(driver);
			s = Utility.getDataAtNum(52, 10);
			Registracija.inputZip(driver, s);
			
			//Country
			Registracija.clickCountry(driver);
			Registracija.clearCountry(driver);
			s = Utility.getDataAt(52, 11);
			Registracija.inputCountry(driver, s);
			
			//Language
			
			s = Utility.getDataAt(52, 12);
			Registracija.inputLang(driver, s);
		
			//Favorite
			s = Utility.getDataAt(52, 13);
			Registracija.inputFav(driver, s);
			
			
			// Submit
			MyAccount.clickSave(driver);
			
			SignIn.clickSignOut(driver);
			
			SignIn.clickSignIn(driver);
			SignIn.clickUserName(driver);
			  s = Utility.getDataAt(1, 0);
			  SignIn.inputUserName(driver, s); 
			  SignIn.clickPassword(driver);
			  SignIn.clearPassword(driver); 
			 s = Utility.getDataAt(52, 1);
			  SignIn.inputPassword(driver, s);
			  SignIn.clickLogIn(driver);
			  
			  boolean welcome = driver.findElement(By.xpath(SignIn.WELCOME)).isDisplayed();
				SoftAssert as = new SoftAssert();
				as.assertTrue(welcome);
			
  }
}
