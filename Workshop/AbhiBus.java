package Workshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody[1]/tr[2]/td[5]/a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("(//p[@class='BsTyp ng-binding'])[1]")).getText());
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
		System.out.println(driver.findElement(By.xpath("(//p[contains(@class,'noseats')])[1]")).getText());
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.xpath("//li[@id='UO1-11']//a[1]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='right']//span")).getText());
		WebElement boarding=driver.findElement(By.xpath("//select[@class='dropdown_custom']"));
		Select sec= new Select(boarding);
		sec.selectByVisibleText("Guindy-22:44");
		WebElement dest=driver.findElement(By.xpath("(//select[@class='dropdown_custom'])[2]"));
		Select des= new Select(dest);
		des.selectByVisibleText("Silk Board-05:13");
		System.out.println(driver.getTitle());

	}

}
