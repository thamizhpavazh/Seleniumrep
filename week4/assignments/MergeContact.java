package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String>id=driver.getWindowHandles();
		Iterator<String> ids=id.iterator();
		String parent=ids.next();
		String child=ids.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(2000);

		Set<String> idse=driver.getWindowHandles();
		Iterator<String> idss=idse.iterator();
		String sparent=idss.next();
		String schild=idss.next();
		driver.switchTo().window(schild);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();	
		driver.switchTo().window(sparent);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());


	}

}

