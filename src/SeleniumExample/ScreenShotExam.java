package SeleniumExample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExam {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File f1=new File("D:\\screen.png");
		FileHandler.copy(f, f1);
		driver.close();
	}
		
		
	}


