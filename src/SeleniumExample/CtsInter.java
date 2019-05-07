package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CtsInter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[4]/div[2]/div[6]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
