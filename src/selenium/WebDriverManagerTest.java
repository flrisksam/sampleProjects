package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\sampleProjects\\src\\Lib\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().browserVersion("114.0").setup();
		//WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		System.out.println("STARTED");
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle().toString()+" title");
		driver.quit();
		System.out.println("ENDED");
	}
	
	@Test
	public void myTest()
	{
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\sampleProjects\\src\\Lib\\chromedriver.exe");
		
		WebDriverManager.chromedriver().browserVersion("113.0").setup();
		//WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		System.out.println("STARTED");
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle().toString()+" title");
		driver.quit();
		System.out.println("ENDED");
	}

}
