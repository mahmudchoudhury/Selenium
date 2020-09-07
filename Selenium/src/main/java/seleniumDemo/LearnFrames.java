package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	


		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//way-1
		driver.switchTo().frame("iframeResult");

		//way-2
		//driver.switchTo().frame(1);

		//way-3

		//WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		//driver.switchTo().frame(iframe);

		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));

		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("Mahmud Hassan");

		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='lname']").clear();
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Zakia Khan");

		//driver.findElementByXPath("//input[@id='fname']").sendKeys("Atia");

		//driver.findElementByXPath("//input[@value='John']").clear();
		//driver.findElementByXPath("//input[@value='John']").sendKeys("Mamun");

		driver.switchTo().parentFrame();

		Thread.sleep(3000);
		driver.close();

	}

}
