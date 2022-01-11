package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenMrs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("Pharmacy")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-"
				+ "registrationapp-registerPatient-homepageLink-extension")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'What's the patient's name?')]/following::input[1]")).sendKeys("Ani");
		driver.findElement(By.xpath("//h3[contains(text(),'What's the patient's name?')]/following::input[2]")).sendKeys("ruth");
		driver.findElement(By.xpath("//label[contains(text(),'Family Name')]/following::input[1]")).sendKeys("ravi");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("birthdateDay-field")).sendKeys("10");
		
		Select month = new Select(driver.findElement(By.id("birthdateMonth-field")));
		month.selectByVisibleText("January");
		
		driver.findElement(By.id("birthdateYear-field")).sendKeys("2000");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//label[contains(text(),'Estimated Years')]/following::input[1]")).sendKeys("2001");
		//driver.findElement(By.xpath("//label[contains(text(),'Estimated Years')]/following::input[2]")).sendKeys("feb");
		//Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.id("address1")).sendKeys("guindy");
		driver.findElement(By.id("address2")).sendKeys("Little mt");
		driver.findElement(By.id("cityVillage")).sendKeys("chennai");
		driver.findElement(By.id("stateProvince")).sendKeys("Tn");
		driver.findElement(By.id("country")).sendKeys("in");
		driver.findElement(By.id("postalCode")).sendKeys("626262");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'number')]/following::input[1]")).sendKeys("97994661313");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		
		Select relation = new Select (driver.findElement(By.id("relationship_type")));
		relation.selectByVisibleText("Aunt/Uncle");
		driver.findElement(By.xpath("//h3[contains(text(),'related ')]/following::input[1]")).sendKeys("mini");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		
		
		
		
		
		
		
	}

}
