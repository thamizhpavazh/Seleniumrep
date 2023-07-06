package Workshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@dir='auto']")).sendKeys("bags");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'for boys')])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText());
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][text()='Skybags']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][text()='Safari']")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'a-button-small')])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'a-row a-size-base')]/following-sibling::h2)[1]")).getText());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
