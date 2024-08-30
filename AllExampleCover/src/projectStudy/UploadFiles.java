package projectStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class UploadFiles {

	static WebDriver driver;
	public static void main(String[] args) 
	
	{
            driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://website.nedient.co.in/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().to("https://website.nedient.co.in/Freshers");
			WebElement Ubtn = driver.findElement(By.xpath("//*[@id=\"fresher_app_resume\"]"));
			Ubtn.sendKeys("");
	}
}

