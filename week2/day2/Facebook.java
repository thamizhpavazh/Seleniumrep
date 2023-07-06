package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("testfirstname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testlastname");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("111212312313");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pa55word");
		//select[@id='day']

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dy = new Select(day);
		dy.selectByVisibleText("28");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select(month);
		mon.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1986");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

		}