package scopeee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class citybankdemo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "https://www.online.citibank.co.in/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		String tit=driver.getTitle();
		System.out.println("the head title is:"+tit);
		//login user
		WebElement id=driver.findElement(By.xpath("//span[@class='txtSign']"));
		id.sendKeys("payalraghatate@gmail.com");
		String idval=id.getAttribute("value");
		System.out.println("user id is"+idval);
	}

}
