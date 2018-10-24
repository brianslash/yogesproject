/**
 * 
 */
package KD_Eassignment.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin 
{
	
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Run_Mode.run_mode(driver);
		
		Thread.sleep(3000);
	}

}
