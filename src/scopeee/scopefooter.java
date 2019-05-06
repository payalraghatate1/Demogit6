package scopeee;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scopefooter {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("the title of webpage"+title);
		int count1=driver.findElements(By.tagName("a")).size();
		System.out.println("the number of hyperlink on webpage..."+count1);
		Thread.sleep(5000);
		//locate footer...
		WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int count2=footerdriver.findElements(By.tagName("a")).size();
		System.out.println("the number of hyperlink in footer..."+count2);
		//locate column element
		WebElement columndriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int count3=columndriver.findElements(By.tagName("a")).size();
		System.out.println("hyperlink in coloumn"+count3);
		for(int i=1;i<=count3;i++)
		{
			String cliclonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(cliclonlink);;
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> itr=abc.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
	}

}
