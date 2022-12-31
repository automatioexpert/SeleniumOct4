package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {

	@Test
	public void t1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://notice.aenetworks.com/");
		System.out.println(driver.findElement(By.cssSelector("div.logo")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'area')]")).getText());

		int s = driver.findElements(By.cssSelector("ul>li")).size();
		System.out.println(s);
		driver.quit();
	}

}