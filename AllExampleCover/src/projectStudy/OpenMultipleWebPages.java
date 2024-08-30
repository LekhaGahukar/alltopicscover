package projectStudy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenMultipleWebPages {
  @Test
	public static void webpage() {

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		List<String> url = List.of("https://plotcompass.nedient.co.in/", "https://www.google.co.in/",
				"https://www.facebook.com/");
		for (String allurl : url) {
			driver.get(allurl);
			System.out.println("The Current URL of page is: " + driver.getCurrentUrl());
			System.out.println("The title of current page is: " + driver.getTitle());
		}

	}
}
