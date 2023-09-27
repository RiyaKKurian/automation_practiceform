package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickjava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		// create object action class
		Actions action=new Actions(driver);
		
		//find element using locator and store into webelement
		WebElement element=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		//perform right click operations using action(object) on element
		action.contextClick(element).perform();
		
		

	}

}
