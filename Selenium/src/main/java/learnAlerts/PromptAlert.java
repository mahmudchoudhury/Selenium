package learnAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		//promptAlert.getText();
		System.out.println(promptAlert.getText());
		Thread.sleep(3000);
		promptAlert.sendKeys("I am Rumman");
		Thread.sleep(3000);
		promptAlert.accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());

	}

}
