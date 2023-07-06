package Workshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		WebElement gen=driver.findElement(By.xpath("//select[@name='genre']"));
		Select sec= new Select(gen);
		sec.selectByVisibleText("ANIMATION");
		WebElement lan=driver.findElement(By.xpath("//select[@name='lang']"));
		Select ln= new Select(lan);
		ln.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(2000);
		WebElement cin=driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select cn= new Select(cin);
		cn.selectByVisibleText("PVR Velachery Chennai");
		driver.findElement(By.xpath("//div[contains(@class,'datepicker-container')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'13')]")).click();
		WebElement tim=driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[2]"));
		Select tm= new Select(tim);
		tm.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("pava");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("4234567891");
		WebElement food=driver.findElement(By.xpath("//select[@name='food']"));
		Select fd= new Select(food);
		fd.selectByVisibleText("No");
		driver.findElement(By.xpath("(//label[text()='F&B Requirements']/following::input)[1]")).sendKeys("no");
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		System.out.println(driver.getTitle());
		
	}

}
