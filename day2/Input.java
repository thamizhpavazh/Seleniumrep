package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("pavazhathamizhanna");
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys(" India");
		String ph=driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).getAttribute("placeholder");
		System.out.println("field is " +ph);
		Assert.assertTrue(ph.contains("Disabled"));
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).getAttribute("value"));
		WebElement input = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']"));
		input.sendKeys("pta.gmail.com");
		input.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']")).sendKeys("This is pavazh");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(@class,'ql-blank')])[1]")).sendKeys("this is textarea");
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText());
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).sendKeys("pavazhathamizhanna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete-item')])[3]")).click();
		driver.findElement(By.xpath("//input[(@name='j_idt106:j_idt116_input')]")).sendKeys("10/28/1976");
		Thread.sleep(1000);
		String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(mon);
		if (mon.equalsIgnoreCase("october")) {
			System.out.println("10/28/1976 selected in calendar");
		}
		driver.findElement(By.xpath("//input[contains(@class,'ui-spinner')]")).sendKeys("123123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-spinner-up')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-spinner-down')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@class,'ui-spinner')]")).getAttribute("aria-valuenow"));
		driver.findElement(By.xpath("//input[@name='j_idt106:slider']")).sendKeys("25");
		Thread.sleep(2000);
		String slider=driver.findElement(By.xpath("//div[contains(@style,'25')]")).getAttribute("style");
		String [] sliders= slider.split(":");
		String[] per=sliders[1].split("%");
		System.out.println("Slider moved "+per[0]+"%");
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
		Thread.sleep(1000);
		Boolean nn=driver.findElement(By.xpath("//button[text()='Close']")).isEnabled();
		if(nn) {
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			System.out.println("Keyboard appeared");
		}

	}

}
