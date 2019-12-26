package Main;

import java.util.Scanner;

import org.testng.annotations.Test;

import testovi.LogIn;
import testovi.LogOut;
import testovi.MyAccountTest;
import testovi.TestEnterToStore;
import testovi.TestGoreMeni;
import testovi.TestKlikSignIn;
import testovi.TestKorpa;
import testovi.TestLevoMeni;
import testovi.TestSlikeMeni;

public class IzvrsavanjeTestova {
  @Test
  public void sviTestovi() {
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Unesite broj od 1 do 11 da biste izvrsili zeljeni test.");
	  
	  
	  System.out.println("1 za testiranje da li ste na dobroj stranici.");
	  System.out.println("2 za testiranje klika na Enter To Store.");
	  System.out.println("3 za testiranje Levog Menija.");
	  System.out.println("4 za testiranje Gornjeg Menija.");
	  System.out.println("5 za testiranje Menija od Slika.");
	  System.out.println("6 za testiranje Sign In dugmeta.");
	  System.out.println("7 za testiranje registracije jednog korisnika.");
	  System.out.println("8 za testiranje registracije 50 korisnika.");
	  System.out.println("9 za testiranje Logovanja.");
	  System.out.println("10 za testiranje izmene podataka ulogovanog korisnika.");
	  System.out.println("11 za testiranje ubacivanje stavke u korpu i provera korpe");
	  
	  int br = sc.nextInt();
	  switch(br) {
	  case 1:
		  TestEnterToStore.testUrl();
		  break;
	  case 2: 
		  TestEnterToStore.testEnterToStore();
		  break;
	  case 3:
		  TestLevoMeni.a();
		  TestLevoMeni.b();
		  TestLevoMeni.c();
		  TestLevoMeni.d();
		  TestLevoMeni.e();
		  break;
	  case 4:
		  TestGoreMeni.a();
		  TestGoreMeni.b();
		  TestGoreMeni.c();
		  TestGoreMeni.d();
		  TestGoreMeni.e();
		  break;
	  case 5:
		  TestSlikeMeni.a();
		  TestSlikeMeni.b();
		  TestSlikeMeni.c();
		  TestSlikeMeni.d();
		  TestSlikeMeni.e();
		  TestSlikeMeni.f();
		  break;
	  case 6:
		  TestKlikSignIn.testKlikSignIn();
		  break;
	  case 7:
		  LogIn.logIn1();
		  break;
	  case 8:
		  LogIn.logIn50();
		  break;
	  case 9:
		  LogOut.logOut();
		  break;
	  case 10:
		  MyAccountTest.myAccountIzmena();
		  break;
	  case 11:
		  TestKorpa.ubacivanjeArtiklaIProvera();
	  }
  }
}
