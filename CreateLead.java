package week2.day1;

import org.apache.commons.math3.distribution.GammaDistribution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String driverPath = System.getProperty("webdriver.chrome.driver");
		System.out.println(driverPath);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
		
		 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavana");
		driver.findElement(By.name("departmentName")).sendKeys("Software testing");
		driver.findElement(By.name("description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("papu@gmail.com");
		WebElement selector=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select g=new Select(selector);
		g.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("View Lead | opentaps CRM"))
			System.out.println("title is matching");
		else
			System.out.println("title is not matching");
		//driver.findElement(By.name("submitButtoBy.n")).click();
		//WebElement elem=driver.findElement(By.id("createLeadForm_dataSourceID"));
		//WebElement elem=driver.findElement(By.id("createLeadForm_dataSourceID"));
		//Select dd = new Select(elem);
		//dd.selectByValue("LEAD_CONFERENCE");
		//dd.selectByVisibleText("conference");
		
			
		

	}

}
