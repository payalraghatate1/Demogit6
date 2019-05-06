package scopeee;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukaripopupw {
	public static void main(String args[])
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String tit=driver.getTitle();
		System.out.println("the main title is:"+tit);
		//WebElement window=driver.findElement(By.xpath("//img[@alt='Amazon']"));
		Set<String> window=driver.getWindowHandles();
		int count=window.size();
		System.out.println(count);
		Iterator<String> itr=window.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
		//driver.switchTo().window(arg0)
	}

}
