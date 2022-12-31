package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T4 {

	@Test
	public void t1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.almarai.com/en");
		driver.findElement(By.cssSelector("a[href*='products']")).click();
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'evening')]")).getText());
		driver.close();
	}

}