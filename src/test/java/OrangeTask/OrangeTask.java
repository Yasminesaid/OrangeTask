package OrangeTask;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;


public class OrangeTask {
	//instance from Tcs CLASS
	mainclass TCs = new mainclass();
	ChromeDriver chrom;
	
	@BeforeClass
	public void setup() {
		 //call setup chrome methode
		
		 TCs.setupchrom();
		 
	  }
	
//	  @BeforeMethod
//	  public void beforeMethod() {
//		  
//  }
	
  @Test(priority=0)
  public void loginsite() {
	//call setup login methode
	  TCs.logins();

  }
  @Test(priority=1)
  public void addusers() {
	//call setup add new user methode
	  TCs.adduser();
  }
  @Test(priority=2)
 public void searchuser(){
	//call searchfor created user methode 
	  TCs.searchuse();
	   
  }
 
  @Test(priority=3)
 public void deletuser(){
	//call delete methode
	  	  TCs.deletusers();
  }


@AfterClass

	//close google chrom after finishing above TCs
public void afterclass(){
	  chrom.close();
}

}
