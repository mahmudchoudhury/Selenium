package learnAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
	
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
