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

	@BeforeTest
	public void invokeBrowser(){
		System.out.println("Before class tested!!!");
	}

	@Test
	public void searchCource(){
        System.out.println("Class tested!!!");
	}

	@AfterTest
	public void endSession(){
        System.out.println("After class tested!!!");
	}

}
