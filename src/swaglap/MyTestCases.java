package swaglap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

WebDriver driver = new ChromeDriver();
WebDriver driver2 = new EdgeDriver();
	
String myWebsite="https://www.saucedemo.com/";

@BeforeTest
public void mysetup() {
driver.get(myWebsite);	

driver2.get(myWebsite);

///comment 
	
	
}


@Test (priority=1)
public void loginWithNormalUser() {
	String theUserName = "standard_user";
	String thePassword ="secret_sauce";
	
driver.findElement(By.id("user-name")).sendKeys(theUserName);;
driver.findElement(By.id("password")).sendKeys( thePassword);;
	
	
	driver2.findElement(By.id("user-name")).sendKeys(theUserName);;
	driver2.findElement(By.id("password")).sendKeys( thePassword);;
		driver.findElement(By.id("login-button")).click();;
	driver2.findElement(By.id("login-button")).click();;
	
	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();


	driver2.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	driver2.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

	
	
}

@Test(priority=2)
public void chechoutprocess () throws InterruptedException {
driver.navigate().to("https://www.saucedemo/cart.html");	
driver.findElement(By.className("shopping_cart_link")).click();
	
}}
