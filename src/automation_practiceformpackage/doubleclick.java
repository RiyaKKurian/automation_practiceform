package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//right click the button to launch right click menu options
		Actions ac=new Actions(driver);
		WebElement link=driver.findElement(By.cssSelector("#authentication > button"));
		ac.doubleClick(link).perform();
		
		//click on edit link on the displayed menu options
		WebElement element=driver.findElement(By.xpath(""));
		element.click();
		
		
		

	}

}
