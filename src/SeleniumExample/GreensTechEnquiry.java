package SeleniumExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechEnquiry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/ul/li[6]/a")).click();
		driver.findElement(By.id("InputName")).sendKeys("Ponsankar");
		driver.findElement(By.id("InputEmail1")).sendKeys("ponsankarbe@gmail.com");
		driver.findElement(By.id("InputSubject")).sendKeys("9442058666");
		driver.findElement(By.name("courses")).sendKeys("Selenium");
		driver.findElement(By.name("branch")).sendKeys("Velachery");
		driver.findElement(By.name("time")).sendKeys("Immediately");
		driver.findElement(By.name("comments")).sendKeys("I am ready to join the class.");
		Thread.sleep(3000);
		driver.close();
		
	}

}
