package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//full path
		/* WebElement serchbox=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		serchbox.sendKeys("watches for women");
		WebElement serch=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		serch.click(); 
		WebElement clearbutton=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		clearbutton.clear();
		WebElement serchbox1=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		serchbox1.sendKeys("watches for men");
		WebElement serch1=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		serch1.click(); */
		
		//relative
	/*	WebElement serchbox=driver.findElement(By.xpath("//input[@type='text']"));
		serchbox.sendKeys("watches for women");
		WebElement serch=driver.findElement(By.xpath("//input[@type='submit']"));
		serch.click(); 
		WebElement clearbutton=driver.findElement(By.xpath("//input[@type='text']"));
		clearbutton.clear();
		WebElement serchbox1=driver.findElement(By.xpath("//input[@type='text']"));
		serchbox1.sendKeys("watches for men");
		WebElement serch1=driver.findElement(By.xpath("//input[@type='submit']"));
		serch1.click(); */
		
		//xpath using or
		
	/*	WebElement serchbox=driver.findElement(By.xpath("//input[@type='text' or @name='fileId-keywords']"));
		serchbox.sendKeys("watches for women");
		WebElement serch=driver.findElement(By.xpath("//input[@type='submit'or @value='Go']"));
		serch.click(); 
		WebElement clearbutton=driver.findElement(By.xpath("//input[@type='text'or @name='fileId-keywords']"));
		clearbutton.clear();
		WebElement serchbox1=driver.findElement(By.xpath("//input[@type='text'or @name='fileId-keywords']"));
		serchbox1.sendKeys("watches for men");
		WebElement serch1=driver.findElement(By.xpath("//input[@type='submit'or @value='Go']"));
		serch1.click(); */
		
		//xpath using and
		
	/*	WebElement serchbox=driver.findElement(By.xpath("//input[@type='text' and @dir='auto']"));
		serchbox.sendKeys("watches for women");
		WebElement serch=driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
		serch.click(); 
		WebElement clearbutton=driver.findElement(By.xpath("//input[@type='text' and @dir='auto']"));
		clearbutton.clear();
		WebElement serchbox1=driver.findElement(By.xpath("//input[@type='text' and @dir='auto']"));
		serchbox1.sendKeys("watches for men");
		WebElement serch1=driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
		serch1.click(); */
		
		//xpath using contains()
		
	/*	WebElement serchbox=driver.findElement(By.xpath("//input[contains(@class,'nav-input')]"));
		serchbox.sendKeys("watches for women");
		WebElement serch=driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
		serch.click(); 
		WebElement clearbutton=driver.findElement(By.xpath("//input[contains(@class,'nav-input')]"));
		clearbutton.clear();
		WebElement serchbox1=driver.findElement(By.xpath("//input[contains(@class,'nav-input')]"));
		serchbox1.sendKeys("watches for men");
		WebElement serch1=driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
		serch1.click();  */
		
		//xpath using starts-with
		
	/*	WebElement serchbox=driver.findElement(By.xpath("//input[starts-with(@dir,'auto')]"));
		serchbox.sendKeys("watches for women");
		WebElement serch=driver.findElement(By.xpath("//input[starts-with(@type,'submit')]"));
		serch.click(); 
		WebElement clearbutton=driver.findElement(By.xpath("//input[starts-with(@dir,'auto')]"));
		clearbutton.clear();
		WebElement serchbox1=driver.findElement(By.xpath("//input[starts-with(@dir,'auto')]"));
		serchbox1.sendKeys("watches for men");
		WebElement serch1=driver.findElement(By.xpath("//input[starts-with(@type,'submit')]"));
		serch1.click();  */
		
		//xpath using text()
		
		driver.findElement(By.xpath("//a[text()='miniTV']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
