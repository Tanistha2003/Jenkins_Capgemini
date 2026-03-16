package mavenStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3Test {
	
	@Test
	public void sample3Test() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
}
