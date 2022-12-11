package launchBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tikha\\Selenium\\selenium1\\driver\\chromedriver.exe");
		// in line#12 we set property by adding (the exception key&the path of driver) see notes selenium 1st class. 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");   //in inspection we should look for ID, Name or class
		driver.findElement(By.name("btnI")).click();
		
		//Thread.sleep(3000); // function to hold chrom open for 3 seconds before it close
		//driver.close();
		
		
	}

}
