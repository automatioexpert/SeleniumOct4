package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {

	@Test
	public void t1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.almarai.com/en");
		driver.findElement(By.cssSelector("input[placeholder='Looking for?']")).sendKeys("food" + Keys.ENTER);

		List<WebElement> results = driver.findElements(By.xpath("//h3"));

		for (WebElement result : results) {
			System.out.println(result.getText());
		}
		
		System.out.println("I am the best expert on the Planet");
		driver.quit();
	}

}