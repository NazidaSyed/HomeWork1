package Websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class marshalls_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marshalls.com");
		driver.manage().window().maximize();
		driver.quit();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.marshalls.com");
		driver2.manage().window().maximize();
		driver2.quit();
	}

}
