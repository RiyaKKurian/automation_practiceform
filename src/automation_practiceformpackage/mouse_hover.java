package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		
		
		driver.get("https://www.browserstack.com/"); 
		driver.manage().window().maximize();
		
		Actions ac=new Actions (driver);
		//WebElement live=driver.findElement(By.xpath(""))
		

	}

}
