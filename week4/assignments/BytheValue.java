package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BytheValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='product-content']//a)[1]")).click();
		
		driver.findElement(By.id("wk_zipcode")).sendKeys("600061");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/cart'])[3]")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		driver.switchTo().alert().accept();
		driver.close();
		
		
	}

}