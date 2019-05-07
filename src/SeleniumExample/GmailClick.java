package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[1]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[1]/div[2]/ul[1]/li[7]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.close();

}
}
