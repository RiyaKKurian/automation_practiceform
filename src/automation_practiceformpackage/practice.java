package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement name=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		name.sendKeys("haripriya");
        
		//for drop down button testing  
		// 1 select by visibletext methord
		Select drop=new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		drop.selectByVisibleText("AutoCAD"); 
		
		//2 select by value methord
		Select drop1=new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		drop1.selectByValue("Art Design");
		
		//3 select by index methord
		Select drop2=new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		drop2.selectByIndex(9);
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		lastname.sendKeys("suresh");
		
		WebElement address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("meenengadi wayanad");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.sendKeys("rama@gmail.com"); 
		
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phone.sendKeys("123");
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		gender.click();
		
		WebElement hobbi=driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		hobbi.click();  
		
		//            Select language=new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
		//            language.selectByIndex(3);
		
		
		
		
	
				
		
		
		
	}

}
