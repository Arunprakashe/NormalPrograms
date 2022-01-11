package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\NANDHINI\\Pictures\\Saved Pictures\\Ns200.jpg");
		
		WebElement click = driver.findElement(By.id("terms"));
		click.click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		String text = driver.findElement(By.xpath("//center[contains(text(),'1 file')]")).getText();
		System.out.println(text);
	}

}
