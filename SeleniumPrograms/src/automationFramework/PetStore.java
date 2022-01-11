package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetStore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[1]")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[2]")).sendKeys("feasfg*123");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[3]")).sendKeys("feasfg*123");
		driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[1]")).sendKeys("arun");
		driver.findElement(By.xpath("//td[text()='Last name:']/following::input[1]")).sendKeys("prakash");
		driver.findElement(By.xpath("//td[text()='Email:']/following ::input[1]")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//td[text()='Phone:']/following ::input[1]")).sendKeys("54494466131");
		driver.findElement(By.xpath("//td[text()='Address 2:']/preceding::input[1]")).sendKeys("arcot");
		driver.findElement(By.xpath("//td[text()='Address 2:']/following::input[1]")).sendKeys("ranipet");
		driver.findElement(By.xpath("//td[text()='City:']/following::input[1]")).sendKeys("vellore");
		driver.findElement(By.xpath("//td[text()='City:']/following::input[2]")).sendKeys("tamilnadu");
		driver.findElement(By.xpath("//td[text()='City:']/following::input[3]")).sendKeys("632555");
		driver.findElement(By.xpath("//td[text()='Country:']/following::input[1]")).sendKeys("India");
		
		Select Language =new Select( driver.findElement(By.xpath("//td[text()='Language Preference:']/following::select[1]")));
		Language.selectByVisibleText("japanese");
		
		Select favourite =new Select( driver.findElement(By.xpath("//td[text()='Favourite Category:']/following::select")));
		favourite.selectByVisibleText("CATS");
		
		WebElement list = driver.findElement(By.xpath("//td[text()='Enable MyList']/following::input[1]"));
		list.click();
		Thread.sleep(3000);
		WebElement banner = driver.findElement(By.xpath("//td[text()='Enable MyBanner']/following::input[1]"));
		banner.click();
		
		driver.findElement(By.xpath("//td[text()='Country:']/following::input[4]")).click();
	}

}
