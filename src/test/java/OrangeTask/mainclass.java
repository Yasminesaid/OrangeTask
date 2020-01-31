package OrangeTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
public class mainclass {
	ChromeDriver chrom;
	public void setupchrom(){ 
		
		//setup chrome driver 	
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
					"\\webdriver\\chromedriver.exe" );
		  chrom=new ChromeDriver();
		  
		  //open orangeHR site
		  chrom.get("https://opensource-demo.orangehrmlive.com");
		  chrom.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			chrom.manage().window().maximize();
			
	}
	public void logins(){
		//login with admin credentials
		
		  String credential[]={"Admin" ,"admin123"};
	      chrom.findElement(By.name("txtUsername")).sendKeys(credential[0]);
	      chrom.findElement(By.name("txtPassword")).sendKeys(credential[1]);
	      chrom.findElement(By.name("Submit")).click();
	      System.out.println("Login Successfully");
	      
		}
	public void adduser(){
		//add new user
		 chrom.findElement(By.linkText("Admin")).click();
	      chrom.findElement(By.linkText("User Management")).click();
	      chrom.findElement(By.linkText("Users")).click();
	      
	      chrom.findElement(By.id("btnAdd")).click();
	      
	      Select formSelect = new Select(chrom.findElement(By.id("systemUser_userType")));
	      formSelect.selectByVisibleText("Admin");     
	      chrom.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Linda Anderson");     
	      chrom.findElement(By.name("systemUser[userName]")).sendKeys("yasminesaied");      
	      Select systemUser = new Select(chrom.findElement(By.name("systemUser[status]")));
	      systemUser.selectByVisibleText("Disabled");      
	      chrom.findElement(By.name("systemUser[password]")).sendKeys("Ya2681995");
	      chrom.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Ya2681995");      
	      chrom.findElement(By.name("btnSave")).click();
	      
	      System.out.println("User added Successfully");

	}
	
	public void searchuse(){
		//search for above created user
		  
		  chrom.findElement(By.id("searchSystemUser_userName")).sendKeys("yasminesaied");
		  chrom.findElement(By.name("_search")).click();
		  
		  System.out.println("Search done Successfully");
	}
	
	 public void deletusers(){
		 //delete selected user
		  
		  WebElement check= chrom.findElement(By.name("chkSelectAll"));
		  check.click();		  
		  chrom.findElement(By.name("btnDelete")).click();	  
		  chrom.findElement(By.id("dialogDeleteBtn")).click();
		    
		  System.out.println("User deleted Successfully");
	  }

}
