package SeleniumExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {
		public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();		
		//WebElement login = driver.findElement(By.id("u_0_2"));
		//login.click();
		Thread.sleep(5000);
		driver.close();		
		
	}

}
