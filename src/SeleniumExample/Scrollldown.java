package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scrollldown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com");
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[1]/a/span/span"));
		Select s=new Select(dropdown);
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i).getText());
		}
		
		driver.close();

	}
}
