package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lalitha");
		driver.findElement(By.name("lastname")).sendKeys("Sivakumar");
		driver.findElement(By.name("reg_email__")).sendKeys("7338854458");
		driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
		WebElement day = driver.findElement(By.id("day"));
		Select daydd = new Select(day);
		daydd.selectByValue("24");
		WebElement month = driver.findElement(By.id("month"));
		Select monthdd = new Select(month);
		monthdd.selectByIndex(10);
		WebElement year = driver.findElement(By.id("year"));
		Select yeardd = new Select(year);
		yeardd.selectByVisibleText("1997");
		driver.findElement(By.id("sex")).click();	

	}

}
