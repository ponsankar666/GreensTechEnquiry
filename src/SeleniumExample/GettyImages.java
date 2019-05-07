package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettyImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gettyimages.in");
		driver.findElement(By.xpath("/html/body/div[1]/section/div/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section/div/ul[2]/li[4]/a")).click();
		Thread.sleep(3000);
		driver.close();
			}
}
