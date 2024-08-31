package genericUtilityOrLib;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
	
public static void Screenshot(WebDriver driver, String imageName) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
		String date = sdf.format(d);
		TakesScreenshot ts =(TakesScreenshot)driver;
      	File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+imageName+"_"+date+".png");
		Files.copy(src, dest);
		
		
	}

}
