package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)"); 
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		/*JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement Element=driver.findElement(By.linkText("QTP"));
		js.executeScript("arguments[0].scrollIntoView();",Element);*/
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 /*WebElement Element =driver.findElement(By.linkText("VBScript"));
		js.executeScript("arguments[0].scrollIntoView();",Element); */
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		

	}

}
