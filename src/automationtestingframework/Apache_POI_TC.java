package automationtestingframework;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pageobject.Homepage;
import appsModulu.signIN_Action;
import utility.Constant;
import utility.Excelutlity;

public class Apache_POI_TC {
	private static WebDriver driver=null;
   public static void main(String args[]) throws Exception{
        driver =new FirefoxDriver();
		driver.get(Constant.Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		///System.out.println("Login Page Successfully");
		Thread.sleep(2000);
		Excelutlity.setExcelFile(Constant.Excel_path+Constant.testdata_path,"Sheet1");
		signIN_Action.Excute(driver);
		//driver.quit();
		Excelutlity.setcelldata("pass",1, 3);
	}

}
