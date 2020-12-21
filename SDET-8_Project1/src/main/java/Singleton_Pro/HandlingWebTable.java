package Singleton_Pro;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebTable
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing']")).click();
		
		Random random= new Random();
		int  randomData = random.nextInt(10000);		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Alcatel"+ randomData);				
						
		WebElement ele=driver.findElement(By.xpath("//Select[@name='accounttype']"));
		Select S = new Select(ele);
		S.selectByVisibleText("Analyst");
		
		WebElement ele1=driver.findElement(By.xpath("//Select[@name='rating']"));
		Select S1 = new Select(ele1);
		S1.selectByVisibleText("Active");
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		
		
	}
}
