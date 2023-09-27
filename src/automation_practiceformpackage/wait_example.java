package automation_practiceformpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		
		
		driver.get("https://www.google.com"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchbar.sendKeys("selenium interview questions");
		searchbar.sendKeys(Keys.RETURN);
		
		//list<WebElement> list=driver.findElement(By.className(""))
		

	}

}
