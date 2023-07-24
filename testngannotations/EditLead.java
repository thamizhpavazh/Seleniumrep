package week5.testngannotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
	@Test
	public void EditLeadTestCase() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pavazhthamizhanna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("thamizh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Training");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Jul23Batch3");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavazh@gmail.com");
		WebElement statePR=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec= new Select(statePR);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(10);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated now");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
