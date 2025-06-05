package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industrydd = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(industrydd);
		dropdown1.selectByValue("IND_SOFTWARE");
		WebElement ownershipdd = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(ownershipdd);
		dropdown2.selectByVisibleText("S-Corporation");
		WebElement sourcedd = driver.findElement(By.id("dataSourceId"));
		Select dropdown3 = new Select(sourcedd);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketcamdd = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(marketcamdd);
		dropdown4.selectByIndex(6);
		WebElement statedd = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(statedd);
		dropdown5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();	
	}
}
