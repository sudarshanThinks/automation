package Jobito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\Chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver wb=new ChromeDriver();
//WebDriver driver = null;
wb.get("https://javabeginnerstutorial.com/");
wb.manage().window().maximize();
	}

}