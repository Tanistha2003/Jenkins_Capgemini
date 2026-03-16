package mavenStart;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4Test {

	@Test
	public void sample1Test(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		driver.quit();
	}

}
