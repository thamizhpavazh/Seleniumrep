package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();


		driver.get("http://leaftaps.com/opentaps/control/main");


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("p");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("pavazh");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("p");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("pta");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("department");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("description");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("abc@portarius.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select st = new Select(state);
		st.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("importantnote");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
	}

}
