package projectStudy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotStudy1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.nedient.co.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType .FILE);
		File des=new File("C:\\Users\\AKSHAY\\Desktop\\TakePicture\\output.png");
		FileUtils.copyFile(src, des);
		

	}

}
