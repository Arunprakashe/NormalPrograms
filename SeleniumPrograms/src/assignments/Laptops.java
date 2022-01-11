package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Your Store'])/following::input")).sendKeys("laptop");
		driver.findElement(By.xpath("(//a[text()='Your Store'])/following::button[1]")).click();
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Products meeting the search criteria')]")).getText();
		System.out.println(text);

	}

}
