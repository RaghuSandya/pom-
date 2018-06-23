package appsModulu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Pageobject.Homepage;
import utility.Excelutlity;

public class signIN_Action {
   public static void Excute(WebDriver driver) throws Exception{
	 String sUsername=Excelutlity.GetCellData(1, 1);
    String sPassword=Excelutlity.GetCellData(1, 2);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Homepage.txt_Username(driver).sendKeys(sUsername);
	  Homepage.txt_Password(driver).sendKeys(sPassword);
      Homepage.btn_click(driver).click();
   
   
  }
}
