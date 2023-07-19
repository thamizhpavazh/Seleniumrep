package week4.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mens =driver.findElement(By.xpath("(//span[@class='labelIcon']/following-sibling::span)[1]"));
		Actions builder= new Actions(driver);
		builder.moveToElement(mens).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String count = driver.findElement(By.xpath("//h1[@class='category-name']/following-sibling::span[1]")).getText();
		count=count.replaceAll("[^\\d]", "");
		System.out.println("the total count of Sport shoes are "+count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']/following-sibling::i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		String isSorted=driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::div")).getText();
		System.out.println("Sorted by "+isSorted);
		driver.findElement(By.xpath("(//div[@class='price-text-box']//input)[1]")).sendKeys("800");
		driver.findElement(By.xpath("(//div[@class='price-text-box']//input)[2]")).sendKeys("900");
		driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::label)[1]")).click();
		String filterConfirm = driver.findElement(By.xpath("(//a[@class='clear-filter-pill  '])[1]")).getText();
		System.out.println(filterConfirm);
		
		Thread.sleep(5000);
		WebElement qView =driver.findElement(By.xpath("//picture[@class='picture-elem']//img[1]"));
		
		builder.moveToElement(qView).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/SnapDealShoe.png");
		FileUtils.copyFile(source, dest);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
		Thread.sleep(1000);
		String finalPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		finalPrice=finalPrice.replaceAll("[^\\d]", "");
		System.out.println("cost of the shoe is "+finalPrice);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("discount "+discount);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		driver.close();
	}

}
