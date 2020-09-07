package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();

		//load URL
		driver.get("http://leaftaps.com/opentaps");

		System.out.println(driver.getTitle());

		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		//Select class for Dropdown (how to handle with dropdown)

		// 1. identify the dropdown element and pass to select class

		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(Source);
		//dd.selectByVisibleText("Employee"); //use-way1
		//dd.selectByValue("LEAD_CONFERENCE");//use-way2
		dd.selectByIndex(3);



		// 2. select specific value from that select dropdown element

		// choosing value from dropdown - 3 options

		// dd.selectByVisibletext("Other");			// Way 1 
		// dd.selectByValue("LEAD_COLDCALL");		// Way 2
		// dd.selectByIndex(2);						// Way 3

		//close Browser
		driver.close();


	}

}
