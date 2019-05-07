package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Ponsankar");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Shanmugam");
		Thread.sleep(1000);
		List<WebElement> sex = driver.findElements(By.xpath("//*[@id=\"sex-0\"]"));
		for(int i=0;i<sex.size();i++)
		{	
			sex.get(i).click();
			Thread.sleep(1000);
					}
		 driver.findElement(By.id("datepicker")).sendKeys("04/05/2019");
		 List<WebElement> prof = driver.findElements(By.xpath("//*[@id=\"profession-0\"]"));
		 for(int i=0;i<prof.size();i++)
		 {
			 prof.get(i).click();
			 Thread.sleep(1000);
		 }
		driver.close();
	}

}
