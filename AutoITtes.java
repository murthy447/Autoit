package autoITtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITtes {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver wd= new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://s000.tinyupload.com/index.php?");
		wd.findElement(By.name("uploaded_file")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\SeleniumWorkspace\\AutoIt\\lib\\upload.exe");
	}

}
