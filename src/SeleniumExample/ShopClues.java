package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html.in");
		Actions ac=new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[3]/a"));
		ac.moveToElement(mobile).build().perform();
		Thread.sleep(3000);
	}

}
