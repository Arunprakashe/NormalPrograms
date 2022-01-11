package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Rediff {
	WebDriver driver;

	@Test
	public void a_pageLoad() {

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}

	@Test
	public void b_createAccount() {
		driver.findElement(By.xpath("//td[text()='Full Name']/following::input[1]")).sendKeys("Arun");
		driver.findElement(By.xpath("//td[text()='Choose a Rediffmail ID']/following::input[1]"))
				.sendKeys("arunvenkat17");
		driver.findElement(By.xpath("//td[text()='Password']/following::input[1]")).sendKeys("Venki@122");
		driver.findElement(By.xpath("//td[text()='Retype password']/following::input[1]")).sendKeys("Venki@122");
		driver.findElement(By.xpath("//td[text()='Alternate Email Address']/following::input[1]"))
				.sendKeys("arunvenkat17@yahoo.com");
		driver.findElement(By.id("mobno")).sendKeys("9879661061");

		Select ref = new Select(
				driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
		ref.selectByVisibleText("02");
		Select ref1 = new Select(
				driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		ref1.selectByVisibleText("FEB");
		Select ref2 = new Select(
				driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		ref2.selectByVisibleText("2018");

		WebElement gender = driver.findElement(By.xpath("//td[contains(text(),'Gender')]/following::input[1]"));
		gender.click();

		Select country = new Select(
				driver.findElement(By.xpath("//span[contains(text(),'Country')]/following::select[1]")));
		country.selectByVisibleText("India");
		Select city = new Select(driver.findElement(By.xpath("//td[contains(text(),'City')]/following::select[1]")));
		city.selectByVisibleText("Vellore");
	}

	@Test
	public void c_captcha() throws InterruptedException {

		Thread.sleep(30000);
		driver.findElement(By.id("Register")).click();
	}
}
