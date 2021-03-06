package testovi;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import objekti.SignIn;
import excel.Utility;

public class LogIn {
	@Test
	public static void logIn1() {
		System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		metodaUnosaRegistracije.registracija1(driver, 5);
		Utility.setExcell("UserRandomData.xlsx");
		Utility.setWorkSheet(0);
		String s;
		
		driver.get(SignIn.URL);
		SignIn.clickSignIn(driver);
		
		
		SignIn.clickUserName(driver);
		  s = Utility.getDataAt(5, 0);
		  SignIn.inputUserName(driver, s); 
		
		  SignIn.clickPassword(driver);
		  SignIn.clearPassword(driver); 
		 s = Utility.getDataAt(5, 1);
		  SignIn.inputPassword(driver, s);
		  SignIn.clickLogIn(driver);
		 

			boolean welcome = driver.findElement(By.xpath(SignIn.WELCOME)).isDisplayed();
			SoftAssert as = new SoftAssert();
			as.assertTrue(welcome);
		
		SignIn.clickSignOut(driver);
		boolean signin = driver.findElement(By.xpath(SignIn.SIGNIN_XPATH)).isDisplayed();
		as.assertTrue(signin);
		}
		
	
	@Test
	public static void logIn50() {
		System.setProperty("webdriver.chrome.driver", "E:\\Ivana\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		metodaUnosaRegistracija50.registracija50(driver);
		Utility.setExcell("UserRandomData.xlsx");
		Utility.setWorkSheet(0);
		String s;
		for(int i = 1; i<51; i++) {
		driver.get(SignIn.URL);
		SignIn.clickSignIn(driver);
		
		
		SignIn.clickUserName(driver);
		  s = Utility.getDataAt(i, 0);
		  SignIn.inputUserName(driver, s); 
		
		  SignIn.clickPassword(driver);
		  SignIn.clearPassword(driver); 
		 s = Utility.getDataAt(i, 1);
		  SignIn.inputPassword(driver, s);
		  SignIn.clickLogIn(driver);
		 

			boolean welcome = driver.findElement(By.xpath(SignIn.WELCOME)).isDisplayed();
			SoftAssert as = new SoftAssert();
			as.assertTrue(welcome);
		
		SignIn.clickSignOut(driver);
		boolean signin = driver.findElement(By.xpath(SignIn.SIGNIN_XPATH)).isDisplayed();
		as.assertTrue(signin);
		}
		}
		
}
