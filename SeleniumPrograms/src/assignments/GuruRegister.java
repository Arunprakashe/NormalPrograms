package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuruRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//b[contains(text(),'First')]/following::input[1]")).sendKeys("arivu");
		driver.findElement(By.xpath("//b[contains(text(),'Last')]/following::input[1]")).sendKeys("aazghu");
		driver.findElement(By.xpath("//b[contains(text(),'Phone')]/following::input[1]")).sendKeys("596616166");
		driver.findElement(By.xpath("//b[contains(text(),'Email')]/following::input[1]")).sendKeys("arivu@yahoo.com");
		driver.findElement(By.xpath("//b[contains(text(),'Address:')]/following::input[1]")).sendKeys("arcot");
		driver.findElement(By.xpath("//b[contains(text(),'City:')]/following::input[1]")).sendKeys("ranipet");
		driver.findElement(By.xpath("//b[contains(text(),'State/Province:')]/following::input[1]")).sendKeys("TN");
		driver.findElement(By.xpath("//b[contains(text(),'Code:')]/following::input[1]")).sendKeys("656662");
		
		Select country=new Select(driver.findElement(By.xpath("//b[contains(text(),'Country:')]/following::select[1]")));
		country.selectByVisibleText("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("asku");
		driver.findElement(By.xpath("//b[(text()='Password:')]/following::input[1]")).sendKeys("busku");
		driver.findElement(By.xpath("//b[(text()='Password:')]/following::input[2]")).sendKeys("busku");

		driver.findElement(By.xpath("//b[(text()='Password:')]/following::input[3]")).click();
		
	}

}
