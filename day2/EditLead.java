package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input[@name='firstName']")).sendKeys("pavazhthamizhanna");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]//a[@class='linktext'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		
		String updatedCom="testttt";
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(updatedCom);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		String output=driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).getAttribute("value");
		
		if (updatedCom.equalsIgnoreCase(output)) {
			System.out.println("the updated company name is "+updatedCom);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
