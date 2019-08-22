package org.tcs.test;
     
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class NewClass {
		
		static WebDriver driver;
		
		@Test
		public void runBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagad\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("jagadish@gmil.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
			
			

		}
		

	}


}
