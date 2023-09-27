package automation_practiceformpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy_page_pathtesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithin kurian\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		WebElement fullname=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[2]/input"));
        fullname.sendKeys("Anju");
        WebElement email=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[3]/input"));
        email.sendKeys("anju@gmail.com");
        WebElement phone=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[4]/input"));
        phone.sendKeys("1234567890");
        
	}

}
