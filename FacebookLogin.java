package Jobito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

//	private static final String Webdriver = null;

	public static void main(String[] args) {
		Object webdriver;
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
WebElement userName=driver.findElement(By.id("email"));
userName.sendKeys("8208134076");

WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("jobito@123");
//password.clear();

WebElement loginbutton=driver.findElement(By.id("loginbutton"));
loginbutton.click();
		

	}

}
