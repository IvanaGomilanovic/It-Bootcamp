package testovi;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;




import objekti.Registracija;
import objekti.SignIn;
import excel.Utility;

public class metodaUnosaRegistracija50 {
	
public static void registracija50(WebDriver driver) {
	
	

	Utility.setExcell("UserRandomData.xlsx");
	Utility.setWorkSheet(0);
	String s;
	
	for(int i = 1; i<51;i++) {
		driver.get(SignIn.URL);
		SignIn.clickSignIn(driver);
		SignIn.clickRegistration(driver);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Registracija.clickUserID(driver);
		Registracija.clearkUserID(driver);
		s = Utility.getDataAt(i, 0);
		Registracija.inputUserID(driver, s);
		
		Registracija.clickPass(driver);
		Registracija.clearPass(driver);
		Registracija.clickNewPass(driver);
		Registracija.clearNewPass(driver);
		s = Utility.getDataAt(i, 1);
		Registracija.inputPass(driver, s);
		Registracija.inputNewPass(driver, s);
	
		
		// FirstName
		Registracija.clickFName(driver);
		Registracija.clearFName(driver);
		s = Utility.getDataAt(i, 2);
		Registracija.inputFName(driver, s);
	
		// LastName
		Registracija.clickLName(driver);
		Registracija.clearLName(driver);
		s = Utility.getDataAt(i, 3);
		Registracija.inputLName(driver, s);
		
		// Email
		Registracija.clickEmail(driver);
		Registracija.clearEmail(driver);
		s = Utility.getDataAt(i, 4);
		Registracija.inputEmail(driver, s);
		
		// Phone
		Registracija.clickPhone(driver);
		Registracija.clearPhone(driver);
		s = Utility.getDataAt(i, 5);
		Registracija.inputPhone(driver, s);
		
		//Address1
		Registracija.clickAddress1(driver);
		Registracija.clearAddress1(driver);
		s = Utility.getDataAt(i, 6);
		Registracija.inputAddress1(driver, s);
		
		//Address2
		Registracija.clickAddress2(driver);
		Registracija.clearAddress2(driver);
		s = Utility.getDataAt(i, 7);
		Registracija.inputAddress2(driver, s);
	
				
		//City
		Registracija.clickCity(driver);
		Registracija.clearCity(driver);
		s = Utility.getDataAt(i, 8);
		Registracija.inputCity(driver, s);
		
		
		//State
		Registracija.clickState(driver);
		Registracija.clearState(driver);
		s = Utility.getDataAt(i, 9);
		Registracija.inputState(driver, s);
		
		
		//Zip
		Registracija.clickZip(driver);
		Registracija.clearZip(driver);
		s = Utility.getDataAt(i, 10);
		Registracija.inputZip(driver, s);
		
		
		//Country
		Registracija.clickCountry(driver);
		Registracija.clearCountry(driver);
		s = Utility.getDataAt(i, 11);
		Registracija.inputCountry(driver, s);
		//Language
		s = Utility.getDataAt(i, 12);
		Registracija.inputLang(driver, s);
		//Favorite
		s = Utility.getDataAt(i, 13);
		Registracija.inputLang(driver, s);
		//myList
		s = Utility.getDataAt(i, 14);
		if (s.equals("YES")) {
			Registracija.clickMyList(driver);
		}
		//myBanner
		s = Utility.getDataAt(i, 14);
		if (s.equals("YES")) {
			Registracija.clickMyBanner(driver);
		}
		
		// Submit
		Registracija.clickSaveAcc(driver);
		
		}
	
}
	
}
