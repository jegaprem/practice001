import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class prem {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
		}
         
}
