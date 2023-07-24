package week5.testngannotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{
@Test
	public void DeleteLeadTestCase() throws InterruptedException {
		

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("60178");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		String id=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext']")).getText();
		System.out.println(id);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(6000);
		String rs=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if (rs.equalsIgnoreCase("No records to display")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		Thread.sleep(6000);
		

	}

}
