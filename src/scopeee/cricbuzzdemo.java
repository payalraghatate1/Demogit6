package scopeee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzzdemo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	    driver.manage().window().maximize();
	    String title=driver.getTitle();
	    System.out.println("the main titel"+title);
	    WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	    System.out.println("the number of rows"+rowcount);
	    int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	    System.out.println("count is"+count);
	    //total sum of run=0
	    int sum=0;
	    for(int i=0;i<count-2;i++)
	    {
	    	String val=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	         int value=Integer.parseInt(val);
	         sum=sum+value;
	         System.out.println(sum);
	    }
	    String extval=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
	    int extra=Integer.parseInt(extval);
	    //actual total sum of runs by considering extra...
	    int actual=sum+extra;
	    System.out.println("total sum of runs incluiding extra are:-"+actual);
	    //total sum of runs
	    String totalval=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
	    int totalruns=Integer.parseInt(totalval);
	   // System.out.println("total runs are:-"+totalruns);
	    
	    if(totalruns==actual)
	    {
	    	System.out.println("score is matched");
	    }else
	    {
	    	System.out.println("score is not matched");
	    }
	    
	}

}
