package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("pavazh@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		String name=driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]//a[@class='linktext'])[1]")).getText();
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]//a[@class='linktext'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		String updatedname=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getAttribute("value");
		if(name.equals(updatedname)){
			System.out.println(true);
		}
		Thread.sleep(4000);
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
}

}
