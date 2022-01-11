package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		Alert aler=driver.switchTo().alert();
		String PopUpText = aler.getText();
		System.out.println(PopUpText);
		Thread.sleep(5000);
		//aler.accept();//ok button
		aler.dismiss();
		String Confirmtext= driver.findElement(By.id("confirm-demo")).getText();
		System.out.println(Confirmtext);
		

	}

}
