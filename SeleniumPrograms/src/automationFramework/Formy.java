package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("Arun");
		driver.findElement(By.id("last-name")).sendKeys("Venkat");
		driver.findElement(By.id("job-title")).sendKeys("Developer");
		WebElement college = driver.findElement(By.id("radio-button-2"));
		college.click();
		WebElement gender = driver.findElement(By.id("checkbox-1"));
		gender.click();
		Select experience= new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("5-9");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
	}

}
