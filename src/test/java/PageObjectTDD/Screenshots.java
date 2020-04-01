package PageObjectTDD;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public static String CaptureScreenshot(WebDriver driver, String namePrint) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String local = System.getProperty("use.dir")+ "/ScreenShot/"+ namePrint + ".png";
		
		File LocalScreenshot = new File(local);
		
		try {
				FileUtils.copyFile(source, LocalScreenshot);
		} catch (IOException e) {
			System.out.println("FAIL PRINT " + e.getMessage());
			// TODO: handle exception
		}
		return local;
		
		
		
	}
	
}
