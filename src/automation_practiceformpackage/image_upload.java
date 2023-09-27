package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//navigate to the image upload page
		
		driver.get("https://qavbox.github.io/demo/signup/"); 
		driver.manage().window().maximize();
		
		WebElement fileinput=driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileinput.sendKeys("C:\\Users\\rithin kurian\\Pictures\\Screenshots");
		
		//for scrolldown
		JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
		
		
		//wait for a few seconds to ensure the file is uploaded
		
		try
		   {
             Thread.sleep(5000);
		   }
        catch(InterruptedException e) {
        	e.printStackTrace();
        	
        
        	
        	
        
		
        
        	
        }
	}

}
