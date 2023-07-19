package week4.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-symbol']/following-sibling::span)[1]")).getText();
		System.out.println("Price of the Mobile is " +price);
		driver.findElement(By.xpath("(//span[@class='a-icon-alt']//preceding::i)[4]")).click();
		String rating = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']")).getText();
		String[] split = rating.split(" ");
		System.out.println("The rating of the first Phone is "+split[0]);
		driver.findElement(By.xpath("(//img[@data-image-index='1'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow=new ArrayList<>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/amazon.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		String subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		price=price.replaceAll(",", "");

		String[] splitsubtotal = subtotal.split("\\.");

		String finalsubtotal=splitsubtotal[0];
		finalsubtotal=finalsubtotal.replaceAll("\\W", "").replaceAll(",", "");

		if (finalsubtotal.equals(price)) {
			System.out.println("cart total is verified with price "+finalsubtotal);
		}
		Thread.sleep(3000);
		driver.quit();
	}
}