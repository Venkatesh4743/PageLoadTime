package PageLoadTime;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		Instant startTime= Instant.now();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		
		Instant endTime= Instant.now();
		System.out.println(endTime.toString());
		Duration duration	=Duration.between(startTime, endTime);
		System.out.println(duration.toMillis());
		System.out.println(driver.getTitle());
		driver.quit();
	
}
}