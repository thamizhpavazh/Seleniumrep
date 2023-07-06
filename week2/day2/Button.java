package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("Clicked the Page "+ driver.getTitle());
		driver.navigate().back();
		String dis=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']")).getAttribute("aria-disabled");
		if (dis.equalsIgnoreCase("true")){
			System.out.println("the button is disabled");
		}
		WebElement ele=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']"));
		Point location=ele.getLocation();
		System.out.println("X, Y coordinates of submit button "+location);
		WebElement col=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']"));
		String s=col.getCssValue("color");
		String hexcol=Color.fromString(s).asHex();
		System.out.println("Color of Save button in hex is " +hexcol);
		WebElement size=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']"));
		Dimension dim=size.getSize();
		System.out.println("height and width of submit button "+dim);
		WebElement bckcol=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt100']"));
		Actions action = new Actions(driver);
		action.moveToElement(bckcol).perform();
		String bgcol=bckcol.getCssValue("color");
		String hexbgcol=Color.fromString(bgcol).asHex();
		System.out.println(hexbgcol);
		
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt102:imageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt109']")).click();
		List<WebElement> count=driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		int elementsCount = count.size();
		System.out.println("rounded buttons are " +elementsCount);
	}

}
