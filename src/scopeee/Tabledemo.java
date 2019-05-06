package scopeee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledemo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/seleniumhtml/table.html");
		driver.manage().window().maximize();
		//number of rows
		List<WebElement>ls=driver.findElements(By.tagName("tr"));
		int rows=ls.size();
		System.out.println("number of rows"+rows);
		for(WebElement row:ls)
		{
			List<WebElement>coloumns=row.findElements(By.tagName("td"));
			//System.out.println("the number of coloumns"+coloumns);
			for(WebElement col:coloumns)
			{
				System.out.println(col.getText());
			}
		}
	}

}
