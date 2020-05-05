package com.example.springbootlearn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringbootlearnApplicationTests {

	WebDriver driver;

	@BeforeTest
	public void invokeBrowser(){
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");

		driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8500/");
	}

	@Test
	public void searchCource(){
		String expectedTitle = "Calculator";
		String title = driver.getTitle();
		Assert.assertEquals(expectedTitle,title);
		//driver.findElement(By.id("proname")).sendKeys("JAVA");
		//driver.findElement(By.className("pr-2")).click();
	}

	@AfterTest
	public void endSession(){
		driver.quit();
	}

}
