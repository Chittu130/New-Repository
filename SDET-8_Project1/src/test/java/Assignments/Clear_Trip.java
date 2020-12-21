package Assignments;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Clear_Trip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.cleartrip.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Bang");
        WebDriverWait wait = new WebDriverWait(driver,10);
        
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[.='Bangalore, IN - Kempegowda International Airport (BLR)']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
        
        driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("Goa");
        WebDriverWait wait1 = new WebDriverWait(driver,10);
        
        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[.='Goa, IN - Dabolim Airport (GOI)']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Goa, IN - Dabolim Airport (GOI)']")).click();
        
        /*Date d = new Date();
        String cursysdate = d.toString();
        System.out.println(cursysdate);
        
        String[] arr = cursysdate.split(" ");
        
        String day= arr[0];
        String month = arr[1];
        System.out.println(month);
               int mon=Integer.parseInt(month);
               
              System.out.println(mon);
              String date=arr[2];
              int date1=Integer.parseInt(date);
              System.out.println(date1);
              
              String year = arr[5];
          	//String x="//td[@data-month='12' and @data-year='2020']";
          	Thread.sleep(3000);
          	driver.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[.='"+date+"']")).click();*/
        
        Date objdate=new Date();
    	String cursysdate = objdate.toString();
    			
    	int month = objdate.getMonth();
    	 	   	
    	System.out.println(cursysdate);
    	String[] arr = cursysdate.split(" ");

    	String day = arr[0];
    	String date = arr[2];
    	int date1 = Integer.parseInt(date)+1;
    	System.out.println(date1);
    	String year = arr[5];
    	int year1= Integer.parseInt(year);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year1+"']/a[.='"+date1+"']")).click();
	}
}
