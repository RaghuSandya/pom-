package Pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
WebDriver drvier;
private static WebElement element=null;
  public static WebElement txt_Username(WebDriver drvier){
	 // Log.info("Username Text Box");
	  element=drvier.findElement(By.xpath(".//input[@id='email']"));
	return element;
	  
  }
public static WebElement txt_Password(WebDriver driver){
	//Log.info("Password Text Box");
	element=driver.findElement(By.xpath(".//input[@id='pass']"));
	return element;
	
}
public static WebElement btn_click(WebDriver driver){
	//Log.info("Login Button");
	element=driver.findElement(By.xpath(".//label[@id='loginbutton']"));
	return element;
}
}