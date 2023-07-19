package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleMen =driver.findElement(By.xpath("(//a[text()='brands'])[1]"));
		Thread.sleep(1000);
		Actions builder= new Actions(driver);
		builder.moveToElement(eleMen).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class=' css-1aucgde']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@for='radio_customer top rated_undefined']//div)[2]")).click();
		Thread.sleep(1000);
		WebElement cate =driver.findElement(By.id("category"));
		Thread.sleep(1000);
		builder.moveToElement(cate).perform();
		Thread.sleep(1000);
		WebElement hair =driver.findElement(By.xpath("//a[text()='hair']"));
		Thread.sleep(1000);
		builder.moveToElement(hair).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Shampoo']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow=new ArrayList<>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		driver.findElement(By.xpath("//div[@id='filters-strip']/div[1]/div[1]/div[4]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();
		String filter = driver.findElement(By.xpath("(//span[text()='Color Protection'])[1]")).getText();
		System.out.println("filter applied for "+filter);
		driver.findElement(By.xpath("(//span[text()='Help']/following::input)[2]")).sendKeys("L'Oreal Paris Colour Protect Shampoo",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='css-1rd7vky']//div)[1]")).click();
		Set<String> windowHandleso = driver.getWindowHandles();
		List<String> childWindows=new ArrayList<>(windowHandleso);

		driver.switchTo().window(childWindows.get(2));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		Thread.sleep(1000);
		String amount = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();

		String finPrice=amount.replaceAll("\\W", "");
		System.out.println("MRP of the Product " +finPrice);
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		String cartamt = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		String finCarAmt=cartamt.replaceAll("\\W", "");
		System.out.println("MRP of the Cart Product "+finCarAmt);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		Thread.sleep(2000);

		String finamt = driver.findElement(By.xpath("(//div[@class='css-46b9vi efuv1qx0']/following-sibling::p)[2]")).getText();
		String finalAmt=finamt.replaceAll("\\W","");
		if (finalAmt.equals(finCarAmt)) {
			System.out.println("final and cart amount are same Rs "+finalAmt);
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		Thread.sleep(2000);
		driver.quit();
}

}
