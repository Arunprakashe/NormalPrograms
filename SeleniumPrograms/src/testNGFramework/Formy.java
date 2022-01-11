package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Formy {
	WebDriver driver;

	@Test
	public void a_pageLoad() {

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_fName() {

		driver.findElement(By.id("first-name")).sendKeys("Arun");
	}
	@Test
		public void c_lName() {
		driver.findElement(By.id("last-name")).sendKeys("Venkat");
	}	
	@Test
		public void d_jTitle() {

		driver.findElement(By.id("job-title")).sendKeys("Developer");
	}
	@Test
		public void e_college() {

		WebElement college = driver.findElement(By.id("radio-button-2"));
		college.click();
	}	
	@Test
		public void f_gen() {

		WebElement gender = driver.findElement(By.id("checkbox-1"));
		gender.click();
	}	
	@Test
		public void g_exp() {

		Select experience= new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("5-9");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
	}
	
	@Test
	public void h_browserCloser() {
		driver.close();
	}

}
