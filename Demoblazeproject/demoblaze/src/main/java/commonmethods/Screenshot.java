package commonmethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testbase.Browser;

public class Screenshot extends Browser{
	
	//static WebDriver driver;
	public static void schot() throws IOException   {
		
		
		/*
		 * String timestamp=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new
		 * Date()); File scrsht=
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(scrsht, new File("D:\\errorsc12.png"+timestamp+".png"));
		 */
		File scrsch=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsch, new File("C:\\Users\\prave\\eclipse-workspace\\demoblaze\\src\\test\\java\\uitesting.png"));
		
		
	}

}
