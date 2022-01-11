package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagAssgn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Products']/preceding::a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Muthu");
		driver.findElement(By.id("last-name")).sendKeys("Mouth");
		driver.findElement(By.id("postal-code")).sendKeys("121311");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		String thanks = driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")).getText();
		System.out.println(thanks);
		String pony = driver.findElement(By.xpath("//div[contains(text(),'pony')]")).getText();
		System.out.println(pony);
		pony = driver.findElement(By.xpath("//div[contains(text(),'pony')]/following::img[1]")).getTagName();
		System.out.println(pony);
		pony = driver.findElement(By.xpath("//div[contains(text(),'pony')]/following::img[1]")).getAttribute("class");
		System.out.println(pony);
		pony = driver.findElement(By.xpath("//div[contains(text(),'pony')]/following::img[1]")).getCssValue("margin");
		System.out.println(pony);
		
		
		
	}

}
