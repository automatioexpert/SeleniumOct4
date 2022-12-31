package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	public void t1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbandictionary.com/define.php?term=DTR");
		System.out.println(
				driver.findElement(By.cssSelector("a[aria-label='Urban Dictionary logo, home page']")).isDisplayed());
		driver.findElement(By.xpath("(//input[@aria-label='Search'])[2]")).sendKeys("items" + Keys.ENTER);

		driver.quit();
	}

}