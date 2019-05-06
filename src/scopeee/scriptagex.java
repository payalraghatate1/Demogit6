package scopeee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptagex {
	public static void main(String args[]) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("the title of webpage"+title);
		WebElement fromcity=driver.findElement(By.id("fromPlaceName"));
		fromcity.sendKeys("BENG");
		String fromcitynm=fromcity.getAttribute("value");
		System.out.println("fromcity name is"+fromcitynm);
		fromcity.sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		//String fromcitynm1=fromcity.getAttribute("value");
		//System.out.println("fromcity name is"+fromcitynm1);
		//handle ajax.........
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String citynm="return document.getElementById(\"fromPlaceName\").value;";
		String cityname=(String)js.executeScript(citynm);
		System.out.println(cityname);
	}

}
