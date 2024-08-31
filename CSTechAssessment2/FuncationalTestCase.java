package CSTechAssessment2;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class FuncationalTestCase {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com\r\n"
				);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Geetha\\Downloads\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		Robot r = new Robot();

		for (int i = 1; i <= 6; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
		}
			
		
		
		Thread.sleep(3000);
		TakesScreenshot ts =(TakesScreenshot)driver;
      	File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+"image.png");
		Files.copy(src, dest);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//td[contains(@class, 'MuiTableCell')])[34]"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		
		TakesScreenshot ts1 =(TakesScreenshot)driver;
      	File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File(".\\Screenshot\\"+"image.png");
		Files.copy(src1, dest1);
		driver.close();
	}
				
		
		
		
		
	}


